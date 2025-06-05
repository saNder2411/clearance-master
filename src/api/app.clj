(ns api.app
  (:require [hiccup2.core :as h]
            [io.pedestal.interceptor :as i]
            [view.pages.main :refer [main-page]]
            [view.pages.house-clearing :refer [house-clearing-page]]
            [view.pages.commercial-clearing :refer [commercial-clearing-page]]
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

(defn house-clearing [_req]
  (println _req)
  (-> (house-clearing-page "house-clearing")
      ok))

(defn commercial-clearing [_req]
  (-> (commercial-clearing-page "commercial-clearing")
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
              ["/house-clearing" :get house-clearing :route-name :house-clearing]
              ["/commercial-clearing" :get commercial-clearing :route-name :commercial-clearing]
              ["/pricing" :get pricing :route-name :pricing]
              ["/privacy-policy" :get privacy-policy :route-name :privacy-policy]
              ["/contacts" :get [contacts]]})
