(ns view.pages.pricing
  (:require [view.components.layout :refer [layout]]
            [view.components.sections :refer [main-banner breadcrumbs]]
            [view.components.cards :refer [card-price]]
            [view.components.form :refer [contact-form]]))

(defn pricing-page [route]
  (layout route
          [:main
           (main-banner {:title   "Preisübersicht für Räumungsarbeiten"
                         :p1      "Individuelle Kostenentstehung: Umfang, Etage, Küchenausbau, Teppichböden, Laufwege usw."
                         :p2      "Einen Kostenrechner bieten wir nicht an. Die sind eine nette Spielerei, zeigen aber unzuverlässige und oft zu niedrige Preise an. Für einen seriösen Festpreis ist eine Besichtigung hilfreich. Dann ist auch wirklich alles berücksichtigt."
                         :img-src "/img/pricing_c.png"})

           [:div.bg_yellow
            [:div.container.py_4
             (breadcrumbs route)]]

           [:div.bg_light_242
            [:div.container
             [:div.max_w_700.mx_a.mb_60_res
              [:h2.fs_28.w_600.px_4.pb_20
               "Die Preise variieren je nach Zustand des Objekts:"]
              [:dl
               [:div.grid.grid_cols_3.gap_4.px_4.py_10
                [:dt.fw_600 "Normal bestückt"]
                [:dd.col_span_2 "Geringe Menge an Möbeln und Gegenständen"]]
               [:div.grid.grid_cols_3.gap_4.px_4.py_10
                [:dt.fw_600 "Stark bestückt"]
                [:dd.col_span_2 "Hohe Menge an Möbeln, Inventar oder Unrat"]]
               [:div.grid.grid_cols_3.gap_4.px_4.py_10
                [:dt.fw_600 "Extrem bestückt / Messie"]
                [:dd.col_span_2 "Sehr starker Befall mit Unrat und Müll"]]]]



             [:div.cards_container_2.mb_84_res
              (card-price {:title   "Wohnung (50 m²)"
                           :entries [["Normal bestückt" "ab 750,00 €"]
                                     ["Stark bestückt" "ab 1.250,00 €"]
                                     ["Extrem bestückt" "ab 2.500,00 €"]]})

              (card-price {:title   "Haus (100 m²)"
                           :entries [["Normal bestückt" "ab 1.500,00 €"]
                                     ["Stark bestückt" "ab 2.400,00 €"]
                                     ["Extrem bestückt" "ab 4.900,00 €"]]})

              (card-price {:title   "Keller (16 m²)"
                           :entries [["Normal bestückt" "ab 240,00 €"]
                                     ["Stark bestückt" "ab 480,00 €"]
                                     ["Extrem bestückt" "ab 770,00 €"]]})

              (card-price {:title   "Garage (16 m²)"
                           :entries [["Normal bestückt" "ab 240,00 €"]
                                     ["Stark bestückt" "ab 480,00 €"]
                                     ["Extrem bestückt" " ab 770,00 €"]]})

              (card-price {:title   "Dachboden (26 m²)"
                           :entries [["Normal bestückt" "ab 390,00 €"]
                                     ["Stark bestückt" "ab 780,00 €"]
                                     ["Extrem bestückt" "ab 1.250,00 €"]]})

              (card-price {:title   "Küche (18 m²)"
                           :entries [["Normal bestückt" "ab 450,00 €"]
                                     ["Stark bestückt" "ab 595,00 €"]
                                     ["Extrem bestückt" "ab 990,00 €"]]})

              (card-price {:title   "Gartenschuppen (18 m²)"
                           :entries [["Normal bestückt" "ab 270,00 €"]
                                     ["Stark bestückt" "ab 540,00 €"]
                                     ["Extrem bestückt" "ab 865,00 €"]]})]]]

           [:div.bg_yellow
            [:div.container
             (contact-form {:mod        :light
                            :title      "Kontaktieren Sie uns noch heute!"
                            :desc       "Wir freuen uns darauf, Ihnen zu helfen und Ihre Räume wieder frei zu machen!"
                            :convention "Ich habe die Datenschutzerklärung zur Kenntnis genommen."})]]]))
