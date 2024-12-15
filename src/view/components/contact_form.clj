(ns view.components.contact-form)

(defn contact-form []
  [:div.contact_form.my_48
   [:div
    [:h2.h_mb.fs_38.fw_800.c_dark "Bereit für was Neues - ähm nen Newsletter?"]

    [:div.flex.align_c
     [:img.mr_12 {:width 100 :height 100 :src "/img/newsletter.webp"}]

     [:p.w_60.fw_400.c_dark.lh_1d6
      "Unser Newsletter. Kein Spam, nur hin und wieder Updates zur Welt von No-Code, Workflows und Digitalisierung!"]]]

   [:form {:autocomplete "off"}
    [:div.control.mb_24
     [:input.input_d {:name "username" :placeholder "Name"}]]

    [:div.control.mb_16
     [:input.input_d {:type "email" :name "email" :placeholder "E-Mail-Adresse"}]]

    [:div.flex.align_c.mb_32
     [:input#agreement.checkbox_d.flex_shrink_0.mr_10 {:type "checkbox"}]

     [:label.c_dark.cur_pointer {:for "agreement"}
      "Ich habe die Datenschutzerklärung zur Kenntnis genommen."]]

    [:button.button_yellow.bg_yellow.c_light.w_100 {:type "submit"}
     "Anmelden"]]])
