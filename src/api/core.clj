(ns api.core
  (:require [api.config :as config]
            [com.stuartsierra.component :as component]
            [api.components.web-server :as web-server]))

(defn services-system [config]
  (component/system-map
    :xtdb {}
    :web-server (component/using
                  (web-server/create-web-server config)
                  [:xtdb])))

(defn -main [opts]
  (println "OPTS=> " opts )
  (let [config (config/read-config)
        system (-> config services-system component/start-system)]
    (println "Starting system with config" config)
    (.addShutdownHook
      (Runtime/getRuntime)
      (new Thread #(component/stop-system system)))))
