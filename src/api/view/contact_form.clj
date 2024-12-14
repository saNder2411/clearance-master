(ns api.view.contact-form)

(defn contact-form []
  [:div {:class "contact_form"}
   [:div
    [:h2 {:class "fs_38 fw_800 c_dark mb_10"}
     "Bereit für was Neues - ähm nen Newsletter?"]

    [:div {:class "flex align_c"}
     [:img {:class "mr_12" :alt "team" :width 100 :height 100 :src "/img/newsletter.webp"}]

     [:p {:class "w_60 fw_400 c_dark lh_1d6"}
      "Unser Newsletter. Kein Spam, nur hin und wieder Updates zur Welt von No-Code, Workflows und Digitalisierung!"]]]

   [:form {:autocomplete "off"}
    [:div {:class "control mb_24"}
     [:input {:class "input_d" :name "username" :placeholder "Name"}]]

    [:div {:class "control mb_16"}
     [:input {:class "input_d" :type "email" :name "email" :placeholder "E-Mail-Adresse"}]]

    [:div {:class "flex align_c mb_32"}
     [:input {:id "agreement" :class "checkbox_d flex_shrink_0 mr_10" :type "checkbox"}]

     [:label {:class "c_dark cur_pointer" :for "agreement"}
      "Ich habe die Datenschutzerklärung zur Kenntnis genommen."]]

    [:button {:class "button_yellow bg_yellow c_light w_100" :type "submit"}
     "Anmelden"]]])
