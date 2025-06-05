(ns view.pages.privacy-policy
  (:require [view.components.layout :refer [layout]]))

(defn privacy-policy-page [route]
  (layout route
          [:main
           [:div.container
            [:h1.h_mb.fw_900 "Datenschutzerklärung"]
            [:p.mb_10.fw_900 "Räumungsmeister"]
            [:p "Inhaber: Johann Romanenko"]]

           [:div.bg_light_242
            [:div.container
             [:h2.mb_10.fs_28.fw_600 "Allgemeine Hinweise"]
             [:p.mb_42 "Der Schutz Ihrer persönlichen Daten ist uns ein besonderes Anliegen. Wir verarbeiten Ihre Daten daher ausschließlich auf Grundlage der gesetzlichen Bestimmungen (DSGVO, TMG). In dieser Datenschutzerklärung informieren wir Sie über die wichtigsten Aspekte der Datenverarbeitung im Rahmen unserer Website und unserer Dienstleistungen."]

             [:h2.mb_10.fs_28.fw_600 "Verantwortliche Stelle"]
             [:p.mb_6 "Verantwortlich für die Datenverarbeitung ist: "
              [:span.fw_700 "Räumungsmeister"]]
             [:p.mb_6 "Inhaber: Johann Romanenko"]
             [:p.mb_6 "Adresse: Nefflenallee 21, 74523 Schwäbisch Hall"]
             [:p.mb_6 "E-Mail: info@raemungsmeister.de"]
             [:p.mb_42 "Mobil: +49 155 61383039"]

             [:h2.mb_10.fs_28.fw_600 "Erhebung und Verarbeitung personenbezogener Daten"]
             [:p.mb_6 "Wir erheben, verarbeiten und nutzen personenbezogene Daten nur, soweit dies erforderlich ist, um Ihnen unsere Dienstleistungen anzubieten. Dies umfasst insbesondere:"]
             [:ul.mb_42
              [:li.mb_6 "• Kontaktaufnahme per Telefon, E-Mail oder Kontaktformular"]
              [:li.mb_6 "• Angebotserstellung und Vertragsabwicklung"]
              [:li.mb_6 "• Rechnungsstellung und Buchhaltung"]
              [:li.mb_6 "• Kundenbetreuung und Serviceleistungen"]]

             [:h2.mb_10.fs_28.fw_600 "\u2060Rechtsgrundlage der Verarbeitung"]
             [:p.mb_42 "Die Verarbeitung Ihrer Daten erfolgt auf Grundlage von Art. 6 Abs. 1 lit. b DSGVO (Vertragserfüllung) oder Art. 6 Abs. 1 lit. f DSGVO (berechtigtes Interesse an der Geschäftsabwicklung)."]

             [:h2.mb_10.fs_28.fw_600 "Weitergabe von Daten"]
             [:p.mb_42 "Ihre Daten werden nicht an Dritte weitergegeben, es sei denn, dies ist zur Vertragserfüllung notwendig oder aufgrund gesetzlicher Vorschriften erforderlich."]

             [:h2.mb_10.fs_28.fw_600 "Speicherdauer"]
             [:p.mb_42 "Wir speichern Ihre Daten nur so lange, wie es für die Erfüllung der jeweiligen Zwecke erforderlich ist oder gesetzliche Aufbewahrungspflichten bestehen."]

             [:h2.mb_10.fs_28.fw_600 "Ihre Rechte "]
             [:p.mb_6 "Sie haben jederzeit das Recht auf:"]
             [:ul.mb_6
              [:li.mb_6 "• Auskunft über Ihre gespeicherten Date"]
              [:li.mb_6 "• Berichtigung oder Löschung Ihrer Daten"]
              [:li.mb_6 "• Einschränkung der Verarbeitung"]
              [:li.mb_6 "• Widerspruch gegen die Verarbeitung"]
              [:li.mb_6 "• Datenübertragbarkeit"]]
             [:p.mb_42 "Zur Ausübung Ihrer Rechte wenden Sie sich bitte an die oben genannte verantwortliche Stelle."]

             [:h2.mb_10.fs_28.fw_600 "Sicherheit"]
             [:p.mb_42 "Wir setzen technische und organisatorische Maßnahmen ein, um Ihre Daten vor unbefugtem Zugriff, Verlust oder Missbrauch zu schützen."]

             [:h2.mb_10.fs_28.fw_600 "Änderungen der Datenschutzerklärung"]
             [:p.mb_42 "Diese Datenschutzerklärung kann bei Bedarf aktualisiert werden, um gesetzlichen Anforderungen oder Änderungen unserer Dienstleistungen gerecht zu werden."]]]]))
