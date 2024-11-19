(ns api.app
  (:require [hiccup2.core :as h]
            [io.pedestal.interceptor :as i]
            [api.view.layout :refer [layout]]))

(defn ok [body]
  {:status  200
   :headers {"Content-Type" "text/html"}
   :body    (-> body
                (h/html)
                (str))})

(defn root [_req]
  (-> (layout)
      ok))

(def contacts (i/interceptor {:name  ::contacts
                              :enter (fn [ctx]
                                       (assoc ctx :response {:status 200 :body "Contacts Page"}))}))

(def routes #{["/" :get root :route-name :root]
              ["/contacts" :get [contacts]]})
