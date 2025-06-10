(ns view.pages.house-clearing
  (:require [view.components.layout :refer [layout]]
            [view.components.sections :refer [main-banner breadcrumbs smooth-testimonials]]
            [view.components.form :refer [contact-form]]))

(defn house-clearing-page [route]
  (layout route
          [:main
           (main-banner {:title   "Privat Hausauflösung"
                         :p1      "Möchten Sie Ihre Räumlichkeiten schnell, zuverlässig und stressfrei räumen lassen?"
                         :p2      "Dann haben wir genau das Richtige für Sie!"
                         :img-src "/img/privet-house-clearance.png"})

           [:div.bg_yellow
            [:div.container.py_4
             (breadcrumbs route)]]

           [:div.bg_dark
            [:div.container.py_20
             [:div.max_w_900.mx_a.c_dark
              [:div.flex.align_c.mb_14
               [:img.flex_shrink_0.mr_12 {:decoding "async" :alt "icon" :width 36 :src "/svg/file-text_y.svg"}]
               [:h3.fs_18_mob.fw_300 "Kostenlose Besichtigung und individuelle Beratung vor Ort"]]
              [:div.flex.align_c.mb_14
               [:img.flex_shrink_0.mr_12 {:decoding "async" :alt "icon" :width 36 :src "/svg/calendar-check_y.svg"}]
               [:h3.fs_18_mob.fw_300 "Schnelle Terminvereinbarung – wir passen uns Ihren Wünschen an"]]
              [:div.flex.align_c
               [:img.flex_shrink_0.mr_12 {:decoding "async" :alt "icon" :width 36 :src "/svg/heart-handshake_y.svg"}]
               [:h3.fs_18_mob.fw_300 "Persönliche Betreuung mit Herz und Kompetenz"]]]]]


           [:div.bg_yellow
            [:div.container.py_0
             (smooth-testimonials {:img-src "/img/bg-private-cln-0.png"
                                   :p1     "Vertrauen Sie auf unsere Erfahrung und unsere Loyalität gegenüber Privatkunden. Wir sorgen dafür, dass Ihre Räumung reibungslos und zu Ihrer vollsten Zufriedenheit verläuft – damit Sie sich um nichts kümmern müssen!"
                                   :p2 "Wir freuen uns darauf, Ihnen zu helfen und Ihre Räume wieder frei zu machen."})

             (smooth-testimonials {:img-src "/img/bg-private-cln-1.png"
                                   :p1     "Unsere Einzigartigkeit und Ihre Zufriedenheit – unser Versprechen an Sie.
                                   Was uns wirklich auszeichnet, ist unsere unermüdliche Loyalität gegenüber unseren Kunden.
                                   Wir sind nicht nur ein Dienstleister, sondern Ihr vertrauensvoller Partner, der mit Herz und Engagement bei der Sache ist."
                                   :p2 "Unsere Arbeitsweise basiert auf Ehrlichkeit, Transparenz und einem tiefen Verständnis für Ihre individuellen Bedürfnisse."})

             (smooth-testimonials {:img-src "/img/bg-private-cln-2.png"
                                   :p1     "Jede Räumung ist für uns eine persönliche Angelegenheit, bei der wir mit größter Sorgfalt und Respekt vor Ihrem Eigentum vorgehen.
                                   Unser Ziel ist es, Ihnen nicht nur eine schnelle und professionelle Lösung zu bieten, sondern auch Ihr Vertrauen zu gewinnen und langfristig zu erhalten."
                                   :p2 "Sie können sich darauf verlassen, dass Sie mit unserer Arbeit vollkommen zufrieden sein werden."})

             (smooth-testimonials {:img-src "/img/bg-private-cln-3.png"
                                   :p1     "Wir setzen alles daran, Ihre Erwartungen zu übertreffen und eine Lösung zu schaffen, die genau auf Sie zugeschnitten ist.
                                   Ihre Zufriedenheit ist für uns der wichtigste Maßstab – denn nur so können wir unsere hohe Qualität und unsere Einzigartigkeit unter Beweis stellen."
                                   :p2 "Lassen Sie uns gemeinsam Ihre Räume wieder frei machen – mit Loyalität, Kompetenz und dem festen Willen, Sie rundum zufriedenzustellen!"})]]

           [:div.bg_dark
            [:div.container
             (contact-form {:mod        :dark
                            :title      "Kontaktieren Sie uns noch heute!"
                            :desc       "Wir freuen uns darauf, Ihnen zu helfen und Ihre Räume wieder frei zu machen!"
                            :convention "Ich habe die Datenschutzerklärung zur Kenntnis genommen."})]]]))
