(ns api.app
  (:require [hiccup2.core :as h]
            [io.pedestal.interceptor :as i]
            [io.pedestal.http.body-params :as bp]
            [nextjournal.garden-email :as garden-email]
            [view.pages.main :refer [main-page]]
            [view.pages.house-clearing :refer [house-clearing-page]]
            [view.pages.commercial-clearing :refer [commercial-clearing-page]]
            [view.pages.pricing :refer [pricing-page]]
            [view.pages.privacy-policy :refer [privacy-policy-page]]
            [view.components.form :refer [raw-contact-form success-toast]]
            [view.components.elements :refer [email-message]]))

(defn- page->body [page]
  (->> page
       (h/html (h/raw "<!DOCTYPE html>"))
       (str)))

(defn- fragment->body [fragment]
  (-> fragment
      (h/html)
      (str)))

(defn ok [body]
  {:status  200
   :headers {"Content-Type" "text/html"}
   :body    body})

(defn root-head [_req]
  {:status 200 :headers {"Content-Type" "text/plain"} :body "The App is available"})

(defn root [{:keys [uri]}]
  (-> (main-page uri)
      page->body
      ok))

(defn house-clearing [{:keys [uri]}]
  (-> (house-clearing-page uri)
      page->body
      ok))

(defn commercial-clearing [{:keys [uri]}]
  (-> (commercial-clearing-page uri)
      page->body
      ok))

(defn pricing [{:keys [uri]}]
  (-> (pricing-page uri)
      page->body
      ok))

(defn privacy-policy [{:keys [uri]}]
  (-> (privacy-policy-page uri)
      page->body
      ok))

(def contact-form (i/interceptor {:name  ::contact-form
                                  :enter (fn [{:keys [request] :as ctx}]
                                           (let [{:keys [username email message]} (:form-params request)
                                                 text (str "Benutzer: " username " \n" "Email: " email " \n" message)
                                                 html (fragment->body (email-message (:form-params request)))
                                                 res (try (garden-email/send-email! {:to      {:email "sander2411de@gmail.com" :name "Alexander"}
                                                                                     :from    {:email garden-email/my-email-address :name "Räumungsmeister App"}
                                                                                     :subject "Räumungsmeister App"
                                                                                     :text    text
                                                                                     :html    html})
                                                          (catch Exception e {:error (ex-message e)}))]


                                             (clojure.pprint/pprint res))
                                           (assoc ctx :response (-> (success-toast)
                                                                    raw-contact-form
                                                                    fragment->body
                                                                    ok)))}))

(def routes #{["/" :head root-head :route-name :root-head]
              ["/" :get root :route-name :root]
              ["/house-clearing" :get house-clearing :route-name :house-clearing]
              ["/commercial-clearing" :get commercial-clearing :route-name :commercial-clearing]
              ["/pricing" :get pricing :route-name :pricing]
              ["/privacy-policy" :get privacy-policy :route-name :privacy-policy]
              ["/contact-form" :post [(bp/body-params) contact-form]]})
