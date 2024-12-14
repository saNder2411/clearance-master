(ns api.app
  (:require [hiccup2.core :as h]
            [io.pedestal.interceptor :as i]
            [api.view.layout :refer [layout]]))

(defn ok [body]
  {:status  200
   :headers {"Content-Type" "text/html"}
   :body    (->> body
                 (h/html (h/raw "<!DOCTYPE html>"))
                 (str))})

(defn root [_req]
  (-> (layout "/")
      ok))

(defn private-move [_req]
  (-> (layout "private-move")
      ok))

(defn company-move [_req]
  (-> (layout "company-move")
      ok))

(defn price [_req]
  (-> (layout "price")
      ok))

(defn household-clearances [_req]
  (-> (layout "household-clearances")
      ok))

(def contacts (i/interceptor {:name  ::contacts
                              :enter (fn [ctx]
                                       (assoc ctx :response {:status 200 :body "Contacts Page"}))}))

(def routes #{["/" :get root :route-name :root]
              ["/private-move" :get private-move :route-name :private-move]
              ["/company-move" :get company-move :route-name :company-move]
              ["/price" :get price :route-name :price]
              ["/household-clearances" :get household-clearances :route-name :household-clearances]
              ["/contacts" :get [contacts]]})
