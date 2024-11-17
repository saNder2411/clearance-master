(ns api.app
  (:require [io.pedestal.interceptor :as i]))

(defn root [_req]
  {:status 200 :body "Home Page!"})

(def contacts (i/interceptor {:name  ::contacts
                              :enter (fn [ctx]
                                       (assoc ctx :response {:status 200 :body "Contacts Page"}))}))

(def routes #{["/" :get root :route-name :root]
              ["/contacts" :get [contacts]]})
