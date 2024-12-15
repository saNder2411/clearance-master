(ns view.components.layout
  (:require [hiccup.page :as hp]
            [view.components.header :refer [header]]
            [view.components.footer :refer [footer]]))

(defn layout [route page]
  [:html {:lang "de"}
   [:head
    [:meta {:charset "utf-8"}]
    [:meta {:name "viewport" :content "width=device-width, initial-scale=1"}]
    [:link {:rel "icon" :type "image/png" :href "/favicon/favicon-96x96.png" :sizes "96x96"}]
    [:link {:rel "icon" :type "image/svg+xml" :href "/favicon/favicon.svg"}]
    [:link {:rel "shortcut icon" :href "/favicon/favicon.ico"}]
    [:link {:rel "apple-touch-icon" :sizes "180x180" :href "/favicon/apple-touch-icon.png"}]
    [:meta {:name "apple-mobile-web-app-title" :content "Räumungsmeister"}]
    [:link {:rel "manifest" :href "/favicon/site.webmanifest"}]
    [:title "Räumungsmeister"]
    (hp/include-css "/css/index.css")]

   [:body
    (header route)
    page
    (footer)]])
