(ns view.components.layout
  (:require [hiccup.page :as hp]
            [view.components.lists :refer [link-list item-list]]
            [view.components.elements :refer [icon-text-row]]))

(defn- contact-tab []
  [:div.sticky.top_0.z_50.bg_d_blur
   [:div.container.flex.align_c.justify_e.c_dark.py_4.fs_14_mob
    [:img {:alt "email" :width 16 :src "/img/mail_l.svg"}]
    [:a.mr_14.ml_6.c_dark {:href "mailto:info@raemungsmeister.de"} "info@raemungsmeister.de"]
    [:img {:alt "phone" :width 16 :src "/img/phone_l.svg"}]
    [:span.ml_6 "+49 155 61383039"]]])

(defn- header [route]
  [:header.sticky.top_24p5.z_50.bg_blur
   [:div.container.flex.align_c.justify_sb.pt_20.pb_20.relative
    [:a {:href "/"}
     [:img {:alt "logo" :width 30 :height 30 :src "/logo/min_logo.svg"}]]

    [:nav.desc_nav
     [:a.nav_i.fw_600 {:class (if (= route "/house-clearing") " nav_i_active" "") :href "/house-clearing"}
      "Privat Hausauflösung"]

     [:a.nav_i.fw_600.ml_32 {:class (if (= route "/commercial-clearing") " nav_i_active" "") :href "/commercial-clearing"}
      "Gewerbliche Räumung"]

     [:a.nav_i.fw_600.ml_32 {:class (if (= route "/pricing") " nav_i_active" "") :href "/pricing"}
      "Preisanfrage"]

     [:a.nav_i.fw_600.ml_32 {:class (if (= route "/privacy-policy") " nav_i_active" "") :href "/privacy-policy"}
      "Datenschutzerklärung"]]

    [:input#mob_nav_switch {:type "checkbox"}]
    [:label.toggle {:for "mob_nav_switch"}
     [:div#bar1.bars]
     [:div#bar2.bars]
     [:div#bar3.bars]]

    [:div.mobile_nav_container
     [:nav.mobile_nav
      [:a.flex.py_6.c_light.fw_500.fs_14.lh_1d6 {:class (if (= route "house-clearing") " mob_nav_active" "") :href "/house-clearing"} "Privat Hausauflösung"]
      [:a.flex.py_6.c_light.fw_500.fs_14.lh_1d6 {:class (if (= route "commercial-clearing") " mob_nav_active" "") :href "/commercial-clearing"} "Gewerbliche Räumung"]
      [:a.flex.py_6.c_light.fw_500.fs_14.lh_1d6 {:class (if (= route "price") " mob_nav_active" "") :href "/pricing"} "Preisanfrage"]
      [:a.flex.py_6.c_light.fw_500.fs_14.lh_1d6 {:class (if (= route "privacy-policy") " mob_nav_active" "") :href "/privacy-policy"} "Datenschutzerklärung"]]]]])

(defn- footer []
  [:footer.container
   [:h2.mt_20.mb_60
    [:a {:href "/"}
     [:img {:alt "logo" :width 360 :src "/logo/main_logo_1.svg"}]]]

   [:div.footer_links.mb_80
    [:div.mb_32
     [:h2.mb_24 "Vorteile"]
     (item-list {:items [(icon-text-row {:img-src "/img/shield-ban.svg" :text "100% versicherter Umzug"})
                         (icon-text-row {:img-src "/img/file-text.svg" :text "100% kostenloses Angebot"})
                         (icon-text-row {:img-src "/img/package-open.svg" :text "Packservice"})
                         (icon-text-row {:img-src "/img/map.svg" :text "wir fahren in jede Region"})
                         (icon-text-row {:img-src "/img/calendar-check.svg" :text "schnelle Termine"})]})]

    [:div.mb_32
     [:h2.mb_24 "Services"]

     (link-list {:links [["/house-clearing" "Privat Hausauflösung"] ["/commercial-clearing" "Gewerbliche Räumung"] ["/pricing" "Preisanfrage"] ["/privacy-policy" "Datenschutzerklärung"]]})]

    [:div.mb_32
     [:h2.mb_24 "Öffnungszeiten"]

     (item-list {:items [(icon-text-row {:img-src "/img/calendar.svg" :text "Montag - Freitag"})
                         (icon-text-row {:img-src "/img/clock-9.svg" :text "08.00 - 16.00 Uhr"})]})]

    [:div.mb_32
     [:h2.mb_24 "Kontakt"]

     (item-list {:items [(icon-text-row {:img-src "/img/mail.svg" :text [:a {:href "mailto:info@raemungsmeister.de"} "info@raemungsmeister.de"]})
                         (icon-text-row {:img-src "/img/phone.svg" :text "+49 155 61383039"})
                         (icon-text-row {:img-src "/img/map-pin-house.svg" :text "Nefflenallee 21, 74523 Schwäbisch Hall"})
                         (icon-text-row {:img-src "/img/graduation-cap.svg" :text "DE326222601"})]})]]

   [:div.flex.flex_wrap.align_c.justify_sb
    [:span.c_social.mb_20.mr_32 "© 2016-2023 räumungsmeister"]

    [:div.flex.align_c.justify_e.mb_20
     [:a.flex.c_social {:target "_blanc" :href "https://www.linkedin.com"}
      [:svg {:viewBox "64 64 896 896" :focusable "false" :data-icon "linkedin" :width 20 :height 20 :fill "currentColor" :aria-hidden "true"}
       [:path {:d "M880 112H144c-17.7 0-32 14.3-32 32v736c0 17.7 14.3 32 32 32h736c17.7 0 32-14.3 32-32V144c0-17.7-14.3-32-32-32zM349.3 793.7H230.6V411.9h118.7v381.8zm-59.3-434a68.8 68.8 0 1168.8-68.8c-.1 38-30.9 68.8-68.8 68.8zm503.7 434H675.1V608c0-44.3-.8-101.2-61.7-101.2-61.7 0-71.2 48.2-71.2 98v188.9H423.7V411.9h113.8v52.2h1.6c15.8-30 54.5-61.7 112.3-61.7 120.2 0 142.3 79.1 142.3 181.9v209.4z"}]]]

     [:a.flex.c_social.ml_20 {:target "_blanc" :href "https://www.instagram.com"}
      [:svg {:viewBox "64 64 896 896" :focusable "false" :data-icon "instagram" :width 20 :height 20 :fill "currentColor" :aria-hidden "true"}
       [:path {:d "M512 378.7c-73.4 0-133.3 59.9-133.3 133.3S438.6 645.3 512 645.3 645.3 585.4 645.3 512 585.4 378.7 512 378.7zM911.8 512c0-55.2.5-109.9-2.6-165-3.1-64-17.7-120.8-64.5-167.6-46.9-46.9-103.6-61.4-167.6-64.5-55.2-3.1-109.9-2.6-165-2.6-55.2 0-109.9-.5-165 2.6-64 3.1-120.8 17.7-167.6 64.5C132.6 226.3 118.1 283 115 347c-3.1 55.2-2.6 109.9-2.6 165s-.5 109.9 2.6 165c3.1 64 17.7 120.8 64.5 167.6 46.9 46.9 103.6 61.4 167.6 64.5 55.2 3.1 109.9 2.6 165 2.6 55.2 0 109.9.5 165-2.6 64-3.1 120.8-17.7 167.6-64.5 46.9-46.9 61.4-103.6 64.5-167.6 3.2-55.1 2.6-109.8 2.6-165zM512 717.1c-113.5 0-205.1-91.6-205.1-205.1S398.5 306.9 512 306.9 717.1 398.5 717.1 512 625.5 717.1 512 717.1zm213.5-370.7c-26.5 0-47.9-21.4-47.9-47.9s21.4-47.9 47.9-47.9 47.9 21.4 47.9 47.9a47.84 47.84 0 01-47.9 47.9z"}]]]

     [:a.flex.c_social.ml_20 {:target "_blanc" :href "https://twitter.com"}
      [:svg {:viewBox "64 64 896 896" :focusable "false" :data-icon "twitter-square" :width 20 :height 20 :fill "currentColor" :aria-hidden "true"}
       [:path {:d "M880 112H144c-17.7 0-32 14.3-32 32v736c0 17.7 14.3 32 32 32h736c17.7 0 32-14.3 32-32V144c0-17.7-14.3-32-32-32zM727.3 401.7c.3 4.7.3 9.6.3 14.4 0 146.8-111.8 315.9-316.1 315.9-63 0-121.4-18.3-170.6-49.8 9 1 17.6 1.4 26.8 1.4 52 0 99.8-17.6 137.9-47.4-48.8-1-89.8-33-103.8-77 17.1 2.5 32.5 2.5 50.1-2a111 111 0 01-88.9-109v-1.4c14.7 8.3 32 13.4 50.1 14.1a111.13 111.13 0 01-49.5-92.4c0-20.7 5.4-39.6 15.1-56a315.28 315.28 0 00229 116.1C492 353.1 548.4 292 616.2 292c32 0 60.8 13.4 81.1 35 25.1-4.7 49.1-14.1 70.5-26.7-8.3 25.7-25.7 47.4-48.8 61.1 22.4-2.4 44-8.6 64-17.3-15.1 22.2-34 41.9-55.7 57.6z"}]]]

     [:a.flex.c_social.ml_20 {:target "_blanc" :href "https://facebook.com"}
      [:svg {:viewBox "64 64 896 896" :focusable "false" :data-icon "facebook" :width 20 :height 20 :fill "currentColor" :aria-hidden "true"}
       [:path {:d "M880 112H144c-17.7 0-32 14.3-32 32v736c0 17.7 14.3 32 32 32h736c17.7 0 32-14.3 32-32V144c0-17.7-14.3-32-32-32zm-92.4 233.5h-63.9c-50.1 0-59.8 23.8-59.8 58.8v77.1h119.6l-15.6 120.7h-104V912H539.2V602.2H434.9V481.4h104.3v-89c0-103.3 63.1-159.6 155.3-159.6 44.2 0 82.1 3.3 93.2 4.8v107.9z"}]]]]]])


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
    (contact-tab)
    (header route)
    page
    (footer)]])
