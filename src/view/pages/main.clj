(ns view.pages.main
  (:require [view.components.layout :refer [layout]]
            [view.components.sections :refer [main-banner breadcrumbs slogan-label slogan-row]]
            [view.components.slideshow :refer [slideshow]]
            [view.components.form :refer [contact-form]]
            [view.components.cards :refer [card card-img-left]]
            [api.lib.core :refer [random-int-id]]))

(defn main-page [route]
  (layout route
          [:main
           (main-banner {:title "Professionelle Haushaltsauflösungen"
                         :p1    "Benötigen Sie eine komplette Räumung von Häusern, Wohnungen, Büros oder Lagerhallen? Wir sind für Sie da!"
                         :p2    "Unser erfahrenes Team sorgt für eine zügige, gründliche und umweltgerechte Müllentsorgung – alles in\nkürzester Zeit und stets in enger Abstimmung mit Ihren Wünschen."})

           [:div.container.py_0
            (breadcrumbs route)]

           [:div.max_w_1280.mx_a.my_40
            (slideshow)]

           [:div.bg_yellow
            [:div.container
             (card-img-left {:title "Leistungsumfang und Termine"
                             :p1    "Nach Ihren Vorgaben. Von der Teilräumung bis zum Komplettpaket inkl. Renovierung, Aktenvernichtung und Endreinigung. Vorlauf je nach Umfang zwei bis drei Wochen, meist ist auch noch Platz für Eiltermine. Räumungsdauer einen Tag für eine normale Wohnung, zwei Tage für ein größeres Haus."
                             :p2    "Unsere Nachlassauflösung bietet Ihnen eine einfühlsame und professionelle Lösung. Wir kümmern uns um die Entsorgung von Erbstücken und hinterlassen Ihre Räume besenrein. Vertrauen Sie auf unsere Expertise für einen respektvollen und effizienten Abschluss."})]]

           [:div.bg_light_242
            [:div.container
             [:div.max_w_800.mx_a.text_align_c_not_mob.mb_60_res
              [:h2.h_mb.fs_28.w_600 "Leistungsumfang von Räumungsmeister"]
              [:p "Nach Ihren Vorgaben. Von der Teilräumung bis zum Komplettpaket inkl. Renovierung, Aktenvernichtung und Endreinigung. Vorlauf je nach Umfang zwei bis drei Wochen, meist ist auch noch Platz für Eiltermine. Räumungsdauer einen Tag für eine normale Wohnung, zwei Tage für ein größeres Haus."]]

             (card {:id          (random-int-id "crd-0")
                    :card-class  "bg_light mb_84_res"
                    :right-class "bg_light_245 fs_24 fst_it"
                    :title       "Entrümpelung"
                    :left-text   ""
                    :right-text  "Fachgerechte Entrümpelung von Wohnungen, Häusern, Kellern, Dachböden, Garagen und anderen Räumen Inklusive Grobreinigung nach der Räumung."
                    :bg-image    "/img/decluttering.png"})

             (card {:id          (random-int-id "crd-0")
                    :card-class  "bg_light mb_84_res"
                    :right-class "bg_light_245 fs_24 fst_it"
                    :title       "Haushaltsauflösung"
                    :left-text   ""
                    :right-text  "Komplette Auflösung von Haushalten, inklusive Möbelabbau und Entsorgung\n\nInklusive Grobreinigung nach der Auflösung."
                    :bg-image    "/img/household-liquidation-de.png"})

             (card {:id          (random-int-id "crd-0")
                    :card-class  "bg_light mb_84_res"
                    :right-class "bg_light_245 fs_24 fst_it"
                    :title       "Räumung von Gewerbeobjekten"
                    :left-text   ""
                    :right-text  "Räumung von Büros, Lagerhallen, Geschäftsräumen und anderen Gewerbeflächen Inklusive Grobreinigung nach der Räumung"
                    :bg-image    "/img/clearance-of-commercial-properties.png"})

             (card {:id          (random-int-id "crd-0")
                    :card-class  "bg_light mb_84_res"
                    :right-class "bg_light_245 fs_24 fst_it"
                    :title       "Grundreinigung"
                    :left-text   ""
                    :right-text  "Gründliche Reinigung von Wohnungen, Häusern und Gewerbeobjekten nach Räumung"
                    :bg-image    "/img/general-cleaning.png"})

             [:div.max_w_800.mx_a.text_align_c_not_mob
              [:p.p_mb "Nach Ihren Vorgaben. Von der Teilräumung bis zum Komplettpaket inkl. Renovierung, Aktenvernichtung und Endreinigung. Vorlauf je nach Umfang zwei bis drei Wochen, meist ist auch noch Platz für Eiltermine. Räumungsdauer einen Tag für eine normale Wohnung, zwei Tage für ein größeres Haus."]]]]

           [:div.bg_yellow
            [:div.container
             [:div.max_w_800.mb_60_res.mx_a.text_align_c_not_mob
              [:h2.h_mb.fs_28.fw_600 "Ihr zuverlässiger Partner für schnelle, professionelle und individuelle Haushaltsauflösungen!"]
              [:p.p_mb "Benötigen Sie eine komplette Räumung von Häusern, Wohnungen, Büros oder Lagerhallen? Wir sind für Sie da! Unser erfahrenes Team sorgt für eine zügige, gründliche und umweltgerechte Müllentsorgung – alles in kürzester Zeit und stets in enger Abstimmung mit Ihren Wünschen."]
              [:h2.h_mb.fs_22.fw_600 "Was wir für Sie tun"]]

             [:div.grid_2_col.gap_x_84_res
              (card {:id          (random-int-id "crd-1")
                     :card-class  "vertical bg_light mb_84_res"
                     :title       "Komplette Haushaltsauflösungen"
                     :left-text   ""
                     :right-class "bg_light_245 fs_22 fst_it"
                     :right-text  "Wir übernehmen alles, von der Planung bis zur finalen Räumung, damit Sie sich um nichts kümmern müssen."
                     :bg-image    "/img/complete-household-clearances.png"})

              (card {:id          (random-int-id "crd-1")
                     :card-class  "vertical bg_light mb_84_res"
                     :title       "Effiziente Büro und Lagerhallenräumung"
                     :left-text   ""
                     :right-class "bg_light_245 fs_22 fst_it"
                     :right-text  "Schnell, sauber und zuverlässig, damit Ihr Geschäft schnell wieder läuft."
                     :bg-image    "/img/office-and-warehouse.png"})]

             [:div.grid_2_col.gap_x_84_res
              (card {:id          (random-int-id "crd-1")
                     :card-class  "vertical bg_light mb_84_res"
                     :title       "Flexible Termine"
                     :left-text   ""
                     :right-class "bg_light_245 fs_22 fst_it"
                     :right-text  "Wir richten uns nach Ihrem Zeitplan, um die Räumung so bequem wie möglich für Sie zu gestalten."
                     :bg-image    "/img/flexible-appointment.png"})

              (card {:id          (random-int-id "crd-1")
                     :card-class  "vertical bg_light mb_84_res"
                     :title       "Vollständige Müll und Sperrmüllentsorgung"
                     :left-text   ""
                     :right-class "bg_light_245 fs_22 fst_it"
                     :right-text  "Umweltgerecht, fachgerecht und nach den gesetzlichen Vorgaben, inklusive Recycling."
                     :bg-image    "/img/waste-disposal.png"})]

             [:div.grid_2_col.gap_x_84_res
              (card {:id          (random-int-id "crd-1")
                     :card-class  "vertical bg_light mb_84_res"
                     :title       "Diskrete und respektvolle Durchführung"
                     :left-text   ""
                     :right-class "bg_light_245 fs_22 fst_it"
                     :right-text  "Wir behandeln Ihr Eigentum mit Sorgfalt und Respekt, auch bei sensiblen Objekten."
                     :bg-image    "/img/respectful-execution.png"})

              (card {:id          (random-int-id "crd-1")
                     :card-class  "vertical bg_light mb_84_res"
                     :title       "Individuelle Beratung & kostenloses Angebot"
                     :left-text   ""
                     :right-class "bg_light_245 fs_22 fst_it"
                     :right-text  "Wir finden die beste Lösung für Ihre Bedürfnisse und erstellen Ihnen ein unverbindliches Angebot."
                     :bg-image    "/img/free-offer.png"})]]]


           [:div#advantages.bg_dark
            [:div.container
             [:div.flex_2_col.align_c
              [:div.flex_grow_1.mt_12.mb_26
               (slogan-label)]

              [:div.pl_60.p_0_mob
               [:h2.h_mb.fs_40.fw_900.c_dark "Was macht uns einzigartig"]

               (slogan-row {:n-row "01"
                            :title "Schnelligkeit & Zuverlässigkeit."
                            :desc  "Wir erledigen die Räumung zügig, ohne Qualität einzubüßen."})

               (slogan-row {:n-row "02"
                            :title "Transparente Preise."
                            :desc  "Keine versteckten Kosten, faire Konditionen, klare Abrechnung."})

               (slogan-row {:n-row "03"
                            :title "Umweltbewusstsein."
                            :desc  "Wir setzen auf nachhaltige Entsorgung, Recycling und umweltgerechte Verfahren."})

               (slogan-row {:n-row "04"
                            :title "Kundenorientierter Service."
                            :desc  "Ihre Zufriedenheit steht bei uns an erster Stelle. Wir gehen auf Ihre Wünsche ein und sorgen für eine stressfreie Abwicklung."})

               [:p.c_dark.fs_22.fst_it.fw_100
                "Lassen Sie uns gemeinsam Ihre Räumung stressfrei, professionell und nach Ihren individuellen Vorgaben gestalten!"]]]]]


           [:div.bg_yellow
            [:div.container
             (contact-form {:mod        :light
                            :title      "Kontaktieren Sie uns noch heute!"
                            :desc       "Wir freuen uns darauf, Ihnen zu helfen und Ihre Räume wieder frei zu machen!"
                            :convention "Ich habe die Datenschutzerklärung zur Kenntnis genommen."})]]]))
