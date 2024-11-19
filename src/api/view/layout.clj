(ns api.view.layout
  (:require [hiccup.page :as hp]))

(defn layout []
  [:head
   [:meta {:charset "utf-8"}]
   [:meta {:name "viewport" :content "minimum-scale=1, initial-scale=1, width=device-width"}]
   [:link {:rel "apple-touch-icon" :sizes "180x180" :href "icon/apple-touch-icon.png"}]
   [:link {:rel "icon" :type "image/png" :sizes "32x32" :href "icon/favicon-32x32.png"}]
   [:link {:rel "icon" :type "image/png" :sizes "16x16" :href "icon/favicon-16x16.png"}]
   [:link {:rel "manifest" :href "icon/manifest"}]
   [:title "J.R."]
   (hp/include-css "css/output.css")
   [:body
    [:header {:class "pos_sticky bg_primary_blur"}
     [:div {:class "mx_w_1144 m_0_a p_16_0 d_flex align_c justify_sb"}
      [:a {:href "/"}
       [:img {:alt "logo" :loading "lazy" :width "30" :height "30" :decoding "async" :data-nimg "1" :style "color:transparent" :src "/img/logo_image.svg"}]]

      [:nav {:class "d_flex align_c"}
       [:a {:class "nav_i f_w_600 hover_br_b nav_i__active" :href "/"}
        "Privatumzug"]

       [:a {:class "nav_i f_w_600 hover_br_b ml_32" :href "/"}
        "Firmenumzug"]

       [:a {:class "nav_i f_w_600 hover_br_b ml_32" :href "/"}
        "Preisanfrage"]

       [:a {:class "nav_i f_w_600 hover_br_b ml_32" :href "/"}
        "Haushaltsauflösungen"]]]]

    [:div {:class "mx_w_1144 m_0_a mt_140 mb_128 d_flex align_s justify_sb"}
     [:div {:class "w_55"}
      [:h1 {:class "mb_32"} "Professionelle Haushaltsauflösungen"]
      [:p {:class "mb_24 color_secondary"} "Vielen Dank, dass wir uns kurz vorstellen dürfen. Vom kleinen Appartement  über Messiwohnungen bis zum mehrstöckigen Bürogebäude haben wir schon alles geräumt. Auf Wunsch mit Renovierung, Endreinigung und Aktenvernichtung mit Zertifikat."]
      [:p {:class "color_secondary"} "Persönlich für Sie da\nNeben Privatkunden arbeiten wir auch oft mit Firmen, Berufsbetreuern, Gemeinden, Hausverwaltungen und Sozialämtern zusammen. \nWir sorgen dafür, dass Sie sich um nichts mehr zu kümmern brauchen. Ihre Haushaltsauflösung wird zügig und störungsfrei ablaufen. Machen Sie es sich leicht."]]
     [:img {:class "w_40" :src "/img/main_top_0.webp"}]]

    [:div {:style "height: 400px" :class "bg_secondary"}]

    [:div {:style "height: 400px" :class ""}]

    [:div {:style "height: 400px" :class "bg_secondary"}]]])
