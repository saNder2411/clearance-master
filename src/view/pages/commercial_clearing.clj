(ns view.pages.commercial-clearing
  (:require [view.components.layout :refer [layout]]
            [view.components.sections :refer [main-banner breadcrumbs feature-row smooth-testimonials]]
            [view.components.form :refer [contact-form]]))

(defn commercial-clearing-page [route]
  (layout route
          [:main
           (main-banner {:route route
                         :title   "Gewerbliche Räumung"
                         :p1      "Möchten Sie Ihre Geschäftsräume schnell, professionell und zuverlässig räumen lassen?"
                         :p2      "Dann profitieren Sie jetzt von unserem speziellen Angebot für Firmenkunden!"
                         :img-src "/img/commercial-clearance.png"})

           [:div.bg_yellow
            [:div.container.py_4
             (breadcrumbs route)]]

           [:div.bg_dark
            [:div.container.py_20
             [:div.max_w_900.mx_a.c_dark.mt_14
              (feature-row {:icon  [:img.flex_shrink_0.mr_12 {:decoding "async" :alt "icon" :width 40 :src "/svg/calendar-days_y.svg"}]
                            :title "Flexible Terminplanung."
                            :desc  "Wir passen uns Ihren Geschäftszeiten an, um Betriebsunterbrechungen zu minimieren."})

              (feature-row {:icon  [:img.flex_shrink_0.mr_12 {:decoding "async" :alt "icon" :width 40 :src "/svg/file-text_y.svg"}]
                            :title "Kostenlose Beratung und Besichtigung vor Ort."
                            :desc  "Individuell auf Ihre Bedürfnisse abgestimmt."})

              (feature-row {:icon  [:img.flex_shrink_0.mr_12 {:decoding "async" :alt "icon" :width 40 :src "/svg/rotate-ccw_y.svg"}]
                            :title "Schnelle und professionelle Abwicklung."
                            :desc  "Damit Ihr Unternehmen schnell wieder einsatzbereit ist."})

              (feature-row {:icon  [:img.flex_shrink_0.mr_12 {:decoding "async" :alt "icon" :width 40 :src "/svg/handshake_y.svg"}]
                            :title "Diskrete und zuverlässige Betreuung."
                            :desc  "Wir respektieren Ihre Geschäftsgeheimnisse und Eigentum."})]]]


           [:div.bg_yellow
            [:div.container.py_0
             (smooth-testimonials {:img-src "/img/bg-commercial-cln-0.png"
                                   :p1      "Verlassen Sie sich auf unsere Erfahrung, Kompetenz und unsere Loyalität gegenüber Firmenkunden.
                                   Wir sorgen dafür, dass Ihre Räumung reibungslos, effizient und zu Ihrer vollsten Zufriedenheit verläuft – damit Sie sich auf Ihr Kerngeschäft konzentrieren können!"
                                   :p2      "Wir freuen uns darauf, Ihr Unternehmen bei der Räumung zu unterstützen."})

             (smooth-testimonials {:img-src "/img/bg-commercial-cln-1.png"
                                   :p1      "Unsere Einzigartigkeit, Ihre Zufriedenheit Bei uns stehen Sie als Kunde im Mittelpunkt.
                                   Was uns von anderen Anbietern unterscheidet, ist unsere einzigartige Kombination aus Zuverlässigkeit, persönlicher Betreuung und einem hohen Maß an Loyalität gegenüber unseren Kunden."
                                   :p2      "Wir legen großen Wert darauf, Ihre Wünsche und Bedürfnisse genau zu verstehen und individuell auf Sie einzugehen."})

             (smooth-testimonials {:img-src "/img/bg-commercial-cln-2.png"
                                   :p1      "Unsere langjährige Erfahrung und unser Engagement für Qualität machen uns zu einem vertrauenswürdigen Partner, auf den Sie sich jederzeit verlassen können.
                                   Wir sind stolz darauf, durch unsere sorgfältige und respektvolle Arbeitsweise eine hohe Kundenzufriedenheit zu gewährleisten."
                                   :p2      "Sie können sich darauf verlassen, dass Sie mit unserer Arbeit vollkommen zufrieden sein werden."})

             (smooth-testimonials {:img-src "/img/bg-commercial-cln-3.png"
                                   :p1      "Unser Ziel ist es, Ihre Räumung so stressfrei und professionell wie möglich zu gestalten – damit Sie sich auf das Wesentliche konzentrieren können."
                                   :p2      "Lassen Sie uns gemeinsam Ihre Räume wieder frei machen – mit Loyalität, Herz und höchster Qualität!"})]]

           [:div#contact-form.bg_dark
            [:div.container
             (contact-form {:mod        :dark
                            :title      "Kontaktieren Sie uns noch heute!"
                            :desc       "Wir freuen uns darauf, Ihnen zu helfen und Ihre Räume wieder frei zu machen!"})]]]))
