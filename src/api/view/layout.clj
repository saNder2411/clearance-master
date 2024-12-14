(ns api.view.layout
  (:require [hiccup.page :as hp]
            [api.view.header :refer [header]]
            [api.view.main-banner :refer [main-banner]]
            [api.view.breadcrumbs :refer [breadcrumbs]]
            [api.view.slideshow :refer [slideshow]]
            [api.view.card-img-left :refer [card-img-left]]
            [api.view.card :refer [card]]
            [api.view.appointment-top :refer [appointment-top]]
            [api.view.card-time :refer [card-time]]
            [api.view.contact-form :refer [contact-form]]
            [api.view.footer :refer [footer]]))

(defn layout [route]
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

    (main-banner)

    [:div.container.mb_44
     (breadcrumbs)]

    [:div.max_w_80.mx_a.mb_28
     (slideshow)]

    [:div.bg_yellow
     [:div.container.container_py
      (card-img-left)]]

    [:div.bg_light_242
     [:div.container.container_py
      [:div.max_w_800.mx_a.text_align_c_not_mob.mb_60_res
       [:h2 {:class "h_mb fs_28 fw_600"} "Leistungsumfang und Termine"]
       [:p {:class "c_light_sec"} "Nach Ihren Vorgaben. Von der Teilräumung bis zum Komplettpaket inkl. Renovierung, Aktenvernichtung und Endreinigung. Vorlauf je nach Umfang zwei bis drei Wochen, meist ist auch noch Platz für Eiltermine. Räumungsdauer einen Tag für eine normale Wohnung, zwei Tage für ein größeres Haus."]]

      (card {:id "card_00"
             :card-class "bg_light mb_84_res"
             :right-class "bg_light_245"
             :title       "Leistungsumfang und Termine"
             :left-text   ""
             :right-text  "Nach Ihren Vorgaben. Von der Teilräumung bis zum Komplettpaket inkl. Renovierung, Aktenvernichtung und Endreinigung. Vorlauf je nach Umfang zwei bis drei Wochen, meist ist auch noch Platz für Eiltermine. Räumungsdauer einen Tag für eine normale Wohnung, zwei Tage für ein größeres Haus."
             :bg-image    "/img/moving_0.jpeg"})

      (card {:id "card_01"
             :card-class "bg_light mb_84_res"
             :right-class "bg_light_245"
             :title       "Leistungsumfang und Termine"
             :left-text   ""
             :right-text  "Nach Ihren Vorgaben. Von der Teilräumung bis zum Komplettpaket inkl. Renovierung, Aktenvernichtung und Endreinigung. Vorlauf je nach Umfang zwei bis drei Wochen, meist ist auch noch Platz für Eiltermine. Räumungsdauer einen Tag für eine normale Wohnung, zwei Tage für ein größeres Haus."
             :bg-image    "/img/moving_1.jpg"})

      (card {:id "card_02"
             :card-class "bg_light mb_84_res"
             :right-class "bg_light_245"
             :title       "Leistungsumfang und Termine"
             :left-text   ""
             :right-text  "Nach Ihren Vorgaben. Von der Teilräumung bis zum Komplettpaket inkl. Renovierung, Aktenvernichtung und Endreinigung. Vorlauf je nach Umfang zwei bis drei Wochen, meist ist auch noch Platz für Eiltermine. Räumungsdauer einen Tag für eine normale Wohnung, zwei Tage für ein größeres Haus."
             :bg-image    "/img/moving_2.jpg"})

      [:div.max_w_800.mx_a.text_align_c_not_mob
       [:p {:class "p_mb c_light_sec"} "Nach Ihren Vorgaben. Von der Teilräumung bis zum Komplettpaket inkl. Renovierung, Aktenvernichtung und Endreinigung. Vorlauf je nach Umfang zwei bis drei Wochen, meist ist auch noch Platz für Eiltermine. Räumungsdauer einen Tag für eine normale Wohnung, zwei Tage für ein größeres Haus."]

       [:button {:class "button_d mob_w_100 my_16 c_dark border_r_22 shadow_22 py_6 px_22" :type "button"}
        "Jetzt starten"]]]]

    [:div.bg_light
     [:div.container.container_py
      [:div.max_w_800.mb_60_res
       [:h2 {:class "h_mb fs_28 fw_600"} "Leistungsumfang und Termine"]
       [:p {:class "c_light_sec"} "Nach Ihren Vorgaben. Von der Teilräumung bis zum Komplettpaket inkl. Renovierung, Aktenvernichtung und Endreinigung. Vorlauf je nach Umfang zwei bis drei Wochen, meist ist auch noch Platz für Eiltermine. Räumungsdauer einen Tag für eine normale Wohnung, zwei Tage für ein größeres Haus."]]

      [:div.grid_2_col.gap_x_84_res
       (card {:id         "card_03"
              :card-class "vertical bg_yellow mb_84_res"
              :title      "Leistungsumfang und Termine"
              :left-text  ""
              :right-text "Nach Ihren Vorgaben. Von der Teilräumung bis zum Komplettpaket inkl. Renovierung, Aktenvernichtung und Endreinigung. Vorlauf je nach Umfang zwei bis drei Wochen, meist ist auch noch Platz für Eiltermine. Räumungsdauer einen Tag für eine normale Wohnung, zwei Tage für ein größeres Haus."
              :bg-image   "/img/moving_3.jpeg"})

       (card {:id         "card_04"
              :card-class "vertical bg_yellow mb_84_res"
              :title      "Leistungsumfang und Termine"
              :left-text  ""
              :right-text "Nach Ihren Vorgaben. Von der Teilräumung bis zum Komplettpaket inkl. Renovierung, Aktenvernichtung und Endreinigung. Vorlauf je nach Umfang zwei bis drei Wochen, meist ist auch noch Platz für Eiltermine. Räumungsdauer einen Tag für eine normale Wohnung, zwei Tage für ein größeres Haus."
              :bg-image   "/img/moving_4.jpg"})]

      [:div.grid_2_col.gap_x_84_res
       (card {:id         "card_05"
              :card-class "vertical bg_yellow mb_84_res"
              :title      "Leistungsumfang und Termine"
              :left-text  ""
              :right-text "Nach Ihren Vorgaben. Von der Teilräumung bis zum Komplettpaket inkl. Renovierung, Aktenvernichtung und Endreinigung. Vorlauf je nach Umfang zwei bis drei Wochen, meist ist auch noch Platz für Eiltermine. Räumungsdauer einen Tag für eine normale Wohnung, zwei Tage für ein größeres Haus."
              :bg-image   "/img/moving_7.webp"})

       (card {:id         "card_06"
              :card-class "vertical bg_yellow mb_84_res"
              :title      "Leistungsumfang und Termine"
              :left-text  ""
              :right-text "Nach Ihren Vorgaben. Von der Teilräumung bis zum Komplettpaket inkl. Renovierung, Aktenvernichtung und Endreinigung. Vorlauf je nach Umfang zwei bis drei Wochen, meist ist auch noch Platz für Eiltermine. Räumungsdauer einen Tag für eine normale Wohnung, zwei Tage für ein größeres Haus."
              :bg-image   "/img/moving_12.jpg"})]]]

    [:div.bg_yellow
     [:div.container.container_py
      (appointment-top)

      [:div.cards_container.mb_84_res
       (card-time {:title "30min" :sub-title "Jeder" :text "Kennlernen oder kurze Abstimmung"})
       (card-time {:title "60min" :sub-title "Jeder" :text "Ausgedehntes Kennenlernen"})
       (card-time {:title "2 Std." :sub-title "Kunden" :text "Eine kurze Arbeitssession"})
       (card-time {:title "3+ Std." :sub-title "Kunden" :text "Eine längere Arbeitssession"})]



      [:div.max_w_768.mx_a.text_align_c_not_mob
       [:p.p_mb.c_light.lh_1d4 "Wenn Du die Terminbuchung nicht verwenden möchtest, kannst Du gerne den Kalender als Referenz für verfügbare Zeitslots nutzen und uns deine Einladung stattdessen an "
        [:span.fw_700 "termin@räumungsmeister.de"]
        " senden."]]]]

    [:div.bg_dark
     [:div.container.py_140
      (contact-form)]]

    (footer)]])
