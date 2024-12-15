(ns api.components.web-server
  (:require [io.pedestal.http :as http]
            [io.pedestal.http.route :as r]
            [io.pedestal.http.content-negotiation :refer [negotiate-content]]
            [io.pedestal.http.ring-middlewares :as rm]
            [com.stuartsierra.component :as component]
            [api.interceptors.core :as i]
            [api.app :as app]))

(def routes (r/expand-routes app/routes))

(def content-negotiation (negotiate-content ["application/json" "application/edn" "text/html" "text/plain"]))

(defn service-map [config custom-interceptors]
  (-> {::http/host   (-> config :server :host)
       ::http/port   (-> config :server :port)
       ::http/type   :jetty
       ::http/join?  false
       ::http/routes routes}
      http/default-interceptors
      (update ::http/interceptors into custom-interceptors)))

(defrecord WebServer [config xtdb]
  component/Lifecycle

  (start [rec]
    (if (:server rec)
      rec
      (let [common-interceptors [(i/inject-deps rec) (rm/resource "public") content-negotiation i/not-found]
            server (-> config
                       (service-map common-interceptors)
                       http/create-server)]
        (assoc rec :server (cond-> server
                                    (not= (:env config) :test) http/start)))))

  (stop [rec]
    (when (and (:server rec) (not= (:env config) :test))
      (http/stop (:server rec)))
    (assoc rec :server nil)))

(defn create-web-server [config]
  (if config
    (map->WebServer {:config config})
    {}))