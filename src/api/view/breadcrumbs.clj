(ns api.view.breadcrumbs)

(defn breadcrumbs []
  [:nav {:class "flex align_c fs_14"}
   [:svg {:viewBox "64 64 896 896" :focusable false :data-icon "home" :width 14 :height 14}
    [:path {:fill "rgba(0, 0, 0, 0.45)" :d "M946.5 505L560.1 118.8l-25.9-25.9a31.5 31.5 0 00-44.4 0L77.5 505a63.9 63.9 0 00-18.8 46c.4 35.2 29.7 63.3 64.9 63.3h42.5V940h691.8V614.3h43.4c17.1 0 33.2-6.7 45.3-18.8a63.6 63.6 0 0018.7-45.3c0-17-6.7-33.1-18.8-45.2zM568 868H456V664h112v204zm217.9-325.7V868H632V640c0-22.1-17.9-40-40-40H432c-22.1 0-40 17.9-40 40v228H238.1V542.3h-96l370-369.7 23.1 23.1L882 542.3h-96.1z"}]]

   [:svg {:class "ml_8" :viewBox "64 64 896 896" :focusable "false" :data-icon "right" :width 12 :height 12}
    [:path {:fill "rgba(0, 0, 0, 0.45)" :d "M765.7 486.8L314.9 134.7A7.97 7.97 0 00302 141v77.3c0 4.9 2.3 9.6 6.1 12.6l360 281.1-360 281.1c-3.9 3-6.1 7.7-6.1 12.6V883c0 6.7 7.7 10.4 12.9 6.3l450.8-352.1a31.96 31.96 0 000-50.4z"}]]

   [:a {:class "ml_8 c_light_no_active" :href "/"} "Dienstleistung"]

   [:svg {:class "ml_8" :viewBox "64 64 896 896" :focusable "false" :data-icon "right" :width 12 :height 12}
    [:path {:fill "rgba(0, 0, 0, 0.45)" :d "M765.7 486.8L314.9 134.7A7.97 7.97 0 00302 141v77.3c0 4.9 2.3 9.6 6.1 12.6l360 281.1-360 281.1c-3.9 3-6.1 7.7-6.1 12.6V883c0 6.7 7.7 10.4 12.9 6.3l450.8-352.1a31.96 31.96 0 000-50.4z"}]]

   [:a {:class "ml_8" :href "/"} "Privatumzug"]])
