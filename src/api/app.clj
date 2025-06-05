(ns api.app
  (:require [hiccup2.core :as h]
            [io.pedestal.interceptor :as i]
            [view.pages.main :refer [main-page]]
            [view.pages.private-move :refer [private-move-page]]
            [view.pages.company-move :refer [company-move-page]]
            [view.pages.pricing :refer [pricing-page]]
            [view.pages.privacy-policy :refer [privacy-policy-page]]))

(defn ok [body]
  {:status  200
   :headers {"Content-Type" "text/html"}
   :body    (->> body
                 (h/html (h/raw "<!DOCTYPE html>"))
                 (str))})

(defn root-head [_req]
  {:status 200 :headers {"Content-Type" "text/plain"} :body "The App is available"})

(defn root [_req]
  (-> (main-page "/")
      ok))

(defn private-move [_req]
  (-> (private-move-page "private-move")
      ok))

(defn company-move [_req]
  (-> (company-move-page "company-move")
      ok))

(defn pricing [_req]
  (-> (pricing-page "pricing")
      ok))

(defn privacy-policy [_req]
  (-> (privacy-policy-page "privacy-policy")
      ok))

(def contacts (i/interceptor {:name  ::contacts
                              :enter (fn [ctx]
                                       (assoc ctx :response {:status 200 :body "Contacts Page"}))}))

(def routes #{["/" :head root-head :route-name :root-head]
              ["/" :get root :route-name :root]
              ["/private-move" :get private-move :route-name :private-move]
              ["/company-move" :get company-move :route-name :company-move]
              ["/pricing" :get pricing :route-name :pricing]
              ["/privacy-policy" :get privacy-policy :route-name :privacy-policy]
              ["/contacts" :get [contacts]]})
