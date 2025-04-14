(ns view.pages.main
  (:require [view.components.layout :refer [layout]]
            [view.components.main-banner :refer [main-banner]]
            [view.components.breadcrumbs :refer [breadcrumbs]]
            [view.components.slideshow :refer [slideshow]]
            [view.components.card-img-left :refer [card-img-left]]
            [view.components.card :refer [card]]
            [view.components.appointment-top :refer [appointment-top]]
            [view.components.card-time :refer [card-time]]
            [view.components.card-text :refer [card-text]]
            [view.components.slogan-banner :refer [slogan-banner]]
            [view.components.contact-form :refer [contact-form]]))

(defn main-view [route]
  (layout route
          [:main
           (main-banner)

           [:div.container.py_0
            (breadcrumbs route)]

           [:div.max_w_1280.mx_a.my_40
            (slideshow)]

           [:div.bg_yellow
            [:div.container
             (card-img-left)]]

           [:div.bg_light_242
            [:div.container
             [:div.max_w_800.mx_a.text_align_c_not_mob.mb_60_res
              [:h2.h_mb.fs_28.w_600 "Leistungsumfang und Termine"]
              [:p "Nach Ihren Vorgaben. Von der Teilräumung bis zum Komplettpaket inkl. Renovierung, Aktenvernichtung und Endreinigung. Vorlauf je nach Umfang zwei bis drei Wochen, meist ist auch noch Platz für Eiltermine. Räumungsdauer einen Tag für eine normale Wohnung, zwei Tage für ein größeres Haus."]]

             (card {:id          "card_00"
                    :card-class  "bg_light mb_84_res"
                    :right-class "bg_light_245"
                    :title       "Entrümpelung"
                    :left-text   ""
                    :right-text  "Fachgerechte Entrümpelung     von Wohnungen, Häusern, Kellern, Dachböden, Garagen und anderen Räumen.\n Inklusive Grobreinigung nach der Räumung."
                    :bg-image    "/img/moving_0.jpeg"})

             (card {:id          "card_01"
                    :card-class  "bg_light mb_84_res"
                    :right-class "bg_light_245"
                    :title       "Haushaltsauflösung"
                    :left-text   ""
                    :right-text  "Komplette Auflösung von Haushalten, inklusive Möbelabbau und Entsorgung\n\nInklusive Grobreinigung nach der Auflösung."
                    :bg-image    "/img/moving_1.jpg"})

             (card {:id          "card_02"
                    :card-class  "bg_light mb_84_res"
                    :right-class "bg_light_245"
                    :title       "Räumung von Gewerbeobjekten"
                    :left-text   ""
                    :right-text  "Räumung von Büros, Lagerhallen, Geschäftsräumen und anderen Gewerbeflächen Inklusive Grobreinigung nach der Räumung"
                    :bg-image    "/img/moving_2.jpg"})

             (card {:id          "card_03"
                    :card-class  "bg_light mb_84_res"
                    :right-class "bg_light_245"
                    :title       "Grundreinigung"
                    :left-text   ""
                    :right-text  "Gründliche Reinigung von Wohnungen, Häusern und Gewerbeobjekten nach Räumung"
                    :bg-image    "/img/moving_2.jpg"})

             [:div.max_w_800.mx_a.text_align_c_not_mob
              [:p.p_mb "Nach Ihren Vorgaben. Von der Teilräumung bis zum Komplettpaket inkl. Renovierung, Aktenvernichtung und Endreinigung. Vorlauf je nach Umfang zwei bis drei Wochen, meist ist auch noch Platz für Eiltermine. Räumungsdauer einen Tag für eine normale Wohnung, zwei Tage für ein größeres Haus."]

              [:button.button_d.mob_w_100.my_16.c_dark.border_r_22.shadow_22.py_6.px_22 {:type "button"}
               "Jetzt starten"]]]]

           [:div.bg_light
            [:div.container
             [:div.max_w_800.mb_60_res
              [:h2.h_mb.fs_28.fw_600 "Leistungsumfang und Termine"]
              [:p "Nach Ihren Vorgaben. Von der Teilräumung bis zum Komplettpaket inkl. Renovierung, Aktenvernichtung und Endreinigung. Vorlauf je nach Umfang zwei bis drei Wochen, meist ist auch noch Platz für Eiltermine. Räumungsdauer einen Tag für eine normale Wohnung, zwei Tage für ein größeres Haus."]]

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
            [:div.container
             (appointment-top)

             [:div.cards_container.mb_84_res
              (card-time {:title "30min" :sub-title "Jeder" :text "Kennlernen oder kurze Abstimmung"})
              (card-time {:title "60min" :sub-title "Jeder" :text "Ausgedehntes Kennenlernen"})
              (card-time {:title "2 Std." :sub-title "Kunden" :text "Eine kurze Arbeitssession"})
              (card-time {:title "3+ Std." :sub-title "Kunden" :text "Eine längere Arbeitssession"})]

             [:div.max_w_768.mx_a.text_align_c_not_mob
              [:p.c_light.lh_1d4 "Wenn Du die Terminbuchung nicht verwenden möchtest, kannst Du gerne den Kalender als Referenz für verfügbare Zeitslots nutzen und uns deine Einladung stattdessen an "
               [:span.fw_700 "termin@räumungsmeister.de"]
               " senden."]]]]

           [:div.bg_dark
            [:div.container
             [:div.flex_2_col.align_c
              [:div.flex_grow_1.mt_12.mb_26
               (slogan-banner)]

              [:div.pl_60.p_0_mob
               [:h2.h_mb.fs_40.fw_900.c_dark "Was macht uns einzigartig"]
               [:p.c_dark.p_mb "Bei loskan.io konzentrieren wir uns auf eine nahtlose und dynamische Integration von No-Code, Low-Code und Full-Stack-Entwicklung. Unser Ansatz ermöglicht es uns, einfache Automatisierungen zu übertreffen und komplexe, maßgeschneiderte Geschäftsprozesse zu unterstützen."]
               [:p.c_dark.p_mb "Unser Alleinstellungsmerkmal ist die intensive Verbindung von No-Code-Methoden mit individueller Softwareentwicklung, was eine schnelle Projektumsetzung und eine erhebliche Steigerung der betrieblichen Effizienz ermöglicht. Unsere speziell entwickelten Web-Dashboards und Apps sind flexibel und passen sich perfekt in Ihre\nArbeitsabläufe ein."]
               [:p.c_dark.p_mb "Entdecke wie Deine Geschäftsprozesse durch individuell angepasste Automatisierungslösungen transformiert werden können."]

               [:button.button_yellow.bg_yellow.c_light.mob_w_100.mt_24.mb_12.border_r_22.py_6.px_22 {:type "button"}
                "Erstgespräch anfragen"]]]]]

           [:div.bg_yellow
            [:div.container
             [:h2.fs_28.w_600.mb_60_res "Bei uns sind folgende Modelle möglich"]

             [:div.grid_2_col.gap_32.mb_60_res
              (card-text {:title      "Festpreis Projekte"
                          :text       "Dieses Modell bietet Dienstleistungen in Entwicklung, Automatisierung und Kl-Optimierung zu einem festgelegten Preis. Es ist ideal für Projekte mit klaren Zielen, wie MVP-Entwicklung oder spezifische Automatisierungsaufgaben, und bietet Budgetsicherheit durch eine vorab definierte Kostenstruktur sowie Laufzeit."
                          :image-path "/img/target.svg"})

              (card-text {:title      "Team as a Service"
                          :text       "Hierbei wird ein spezialisiertes Team bereitgestellt, das eng mit dem Kunden für kontinuierliche Entwicklung, Automatisierung und Integration zusammenarbeitet. Dieses flexible Modell eignet sich für langfristige Projekte und ermöglicht es Kunden, von erweiterter technischer Expertise und laufenden innovativen Lösungen zu profitieren."
                          :image-path "/img/clock.svg"})]

             [:h2.fs_28.w_600.mb_60_res "Leistungsbausteine"]

             [:div.flex.flex_wrap.align_c
              [:div.tag "Anforderungsanalyse"]
              [:div.tag "Projektmanagement"]
              [:div.tag "Prototyping"]
              [:div.tag "No-Code"]
              [:div.tag "Low-Code"]
              [:div.tag "Prozessorchestrierung"]
              [:div.tag "Process-Mining"]
              [:div.tag "End-2-End Prozessautomatisierung"]
              [:div.tag "Robotic Process Automation (RPA)"]
              [:div.tag "Business Process Model and Notation (BPMN)"]
              [:div.tag "API-Entwicklung"]
              [:div.tag "Mobile Apps"]
              [:div.tag "Web-Anwendungen"]
              [:div.tag "Frontend Entwicklung"]
              [:div.tag "Backend Entwicklung"]
              [:div.tag "Internet of Things"]]]]

           [:div.bg_dark
            [:div.container
             (contact-form)]]]))
