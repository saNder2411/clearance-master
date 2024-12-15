(ns view.components.appointment-top)

(defn appointment-top []
  [:div.appointment_top
   [:div.appointment_top_text.max_w_580
    [:h2.fs_28.fw_900.mb_8 "Kontakt"]
    [:h2.h_mb.fs_28.fw_900 "Wie lange brauchen wir?"]
    [:p.c_light.lh_1d4 "Mit dem Buchungssystem kannst du bequem und schnell verfügbare Zeitslots einsehen und deinen Termin direkt online buchen."]]

   [:img {:src "/img/appointment.svg" :width 308}]])
