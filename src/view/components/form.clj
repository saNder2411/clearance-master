(ns view.components.form)

(defn contact-form [{:keys [title desc convention mod] :or {mod :light}}]
  (let [classes (case mod
                  :light ["" "input_l" "checkbox_l" "button_d shadow_22 c_dark" "/svg/newsletter_l.svg"]
                  :dark ["c_dark" "input_d" "checkbox_d" "button_yellow bg_yellow c_light" "/svg/newsletter_d.svg"])
        [txt-cls input-cls checkbox-cls btn-cls img-src] classes]
    [:div.contact_form.my_48
     [:div
      [:h2.h_mb.fs_38.fw_800 {:class txt-cls} title]

      [:div.flex.align_c
       [:img.mr_12 {:decoding "async" :width 100 :height 100 :src img-src}]

       [:p.w_60.fw_400.fs_20.lh_1d6 {:class txt-cls} desc]]]

     [:form {:autocomplete "off"}
      [:div.control.mb_16
       [:input {:class input-cls :name "username" :autocomplete "on" :placeholder "Name"}]]

      [:div.control.mb_16
       [:input {:class input-cls :type "email" :name "email" :autocomplete "on" :placeholder "E-Mail-Adresse"}]]

      [:div.control.mb_16
       [:textarea {:class input-cls :type "text" :name "message" :rows 2 :autocomplete "on" :placeholder "Ihre Nachricht"}]]

      [:div.flex.align_c.mb_24
       [:input#agreement.flex_shrink_0.mr_10 {:class checkbox-cls :type "checkbox"}]

       [:label.cur_pointer {:class txt-cls :for "agreement"} convention]]

      [:button.w_100 {:class btn-cls :type "submit"}
       "Senden"]]]))



