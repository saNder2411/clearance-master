(ns api.view.card-img-left)

(defn card-img-left []
  [:div {:class "card_img_left bg_light border_r_12"}
   [:div {:class "card_img_left_text p_60_res"}
    [:h2 {:class "h_mb fs_28 fw_600"} "Leistungsumfang und Termine"]
    [:p {:class "p_mb c_light_sec"} "Nach Ihren Vorgaben. Von der Teilräumung bis zum Komplettpaket inkl. Renovierung, Aktenvernichtung und Endreinigung. Vorlauf je nach Umfang zwei bis drei Wochen, meist ist auch noch Platz für Eiltermine. Räumungsdauer einen Tag für eine normale Wohnung, zwei Tage für ein größeres Haus."]
    [:p {:class "c_light_sec"} "Unsere Nachlassauflösung bietet Ihnen eine einfühlsame und professionelle Lösung. Wir kümmern uns um die Entsorgung von Erbstücken und hinterlassen Ihre Räume besenrein. Vertrauen Sie auf unsere Expertise für einen respektvollen und effizienten Abschluss."]]

   [:div.card_img_left_img]])
