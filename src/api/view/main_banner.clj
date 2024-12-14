(ns api.view.main-banner)

(defn main-banner []
  [:div {:class "container main_banner mb_44"}
   [:div {:class "main_banner_text"}
    [:h1 {:class "h_mb fw_900"} "Professionelle Haushaltsauflösungen"]
    [:p {:class "p_mb c_light_sec"} "Vielen Dank, dass wir uns kurz vorstellen dürfen. Vom kleinen Appartement  über Messiwohnungen bis zum mehrstöckigen Bürogebäude haben wir schon alles geräumt."]
    [:p {:class "c_light_sec"} "Persönlich für Sie da Neben Privatkunden arbeiten wir auch oft mit Firmen, Berufsbetreuern, Gemeinden, Hausverwaltungen und Sozialämtern zusammen. Ihre Haushaltsauflösung wird zügig und störungsfrei ablaufen. Machen Sie es sich leicht."]
    [:button {:class "button_d c_dark border_r_22 shadow_22 py_6 px_22" :type "button"}
     "Erfahren Sie mehr über uns"]]

   [:img.w_100.border_r_12 {:src "/img/main_top_0.webp"}]])
