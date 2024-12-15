(ns api.app
  (:require [hiccup2.core :as h]
            [io.pedestal.interceptor :as i]
            [view.pages.main :as p]))

(defn ok [body]
  {:status  200
   :headers {"Content-Type" "text/html"}
   :body    (->> body
                 (h/html (h/raw "<!DOCTYPE html>"))
                 (str))})

(defn root [_req]
  (-> (p/main "/")
      ok))

(defn private-move [_req]
  (-> (p/main "private-move")
      ok))

(defn company-move [_req]
  (-> (p/main "company-move")
      ok))

(defn price [_req]
  (-> (p/main "price")
      ok))

(defn household-clearances [_req]
  (-> (p/main "household-clearances")
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
