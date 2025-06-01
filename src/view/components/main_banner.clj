(ns view.components.main-banner)

(defn main-banner []
  [:div.container.main_banner
   [:div.main_banner_text
    [:h1.h_mb.fw_900 "Professionelle Haushaltsauflösungen"]
    [:p.p_mb "Benötigen Sie eine komplette Räumung von Häusern, Wohnungen, Büros oder Lagerhallen? Wir sind für Sie da!"]
    [:p "Unser erfahrenes Team sorgt für eine zügige, gründliche und umweltgerechte Müllentsorgung – alles in\nkürzester Zeit und stets in enger Abstimmung mit Ihren Wünschen."]
    [:button.button_d.c_dark.border_r_22.shadow_22.py_6.px_22.mob_w_100 {:type "button"}
     "Erfahren Sie mehr über uns"]]

   [:img.w_100.border_r_12 {:src "/img/main_top_0.webp"}]])
