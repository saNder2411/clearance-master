(ns api.app
  (:require [hiccup2.core :as h]
            [io.pedestal.interceptor :as i]
            [view.pages.main :refer [main-view]]
            [view.pages.privacy-policy :refer [privacy-policy-view]]))

(defn ok [body]
  {:status  200
   :headers {"Content-Type" "text/html"}
   :body    (->> body
                 (h/html (h/raw "<!DOCTYPE html>"))
                 (str))})

(defn root-head [_req]
  {:status 200 :headers {"Content-Type" "text/plain"} :body "The App is available"})

(defn root [_req]
  (-> (main-view "/")
      ok))

(defn private-move [_req]
  (-> (main-view "private-move")
      ok))

(defn company-move [_req]
  (-> (main-view "company-move")
      ok))

(defn price [_req]
  (-> (main-view "price")
      ok))

(defn privacy-policy [_req]
  (-> (privacy-policy-view "privacy-policy")
      ok))

(def contacts (i/interceptor {:name  ::contacts
                              :enter (fn [ctx]
                                       (assoc ctx :response {:status 200 :body "Contacts Page"}))}))

(def routes #{["/" :head root-head :route-name :root-head]
              ["/" :get root :route-name :root]
              ["/private-move" :get private-move :route-name :private-move]
              ["/company-move" :get company-move :route-name :company-move]
              ["/price" :get price :route-name :price]
              ["/privacy-policy" :get privacy-policy :route-name :privacy-policy]
              ["/contacts" :get [contacts]]})
