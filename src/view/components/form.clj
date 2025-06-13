(ns view.components.form)

(defn raw-contact-form
  ([report-msg {:keys [username email message]}]
   [:form.relative {:autocomplete "off"
                    :hx-post      "/contact-form"
                    :hx-target    "this"
                    :hx-swap      "outerHTML settle:5s"}
    [:div.control.mb_16
     [:input {:name "username" :value username :autocomplete "on" :placeholder "Name" :minlength 2 :required true}]]

    [:div.control.mb_16
     [:input {:type "email" :name "email" :value email :autocomplete "on" :placeholder "E-Mail-Adresse" :required true}]]

    [:div.control.mb_16
     [:textarea {:type "text" :name "message" :rows 2 :autocomplete "on" :placeholder "Ihre Nachricht" :maxlength 2000 :required true} message]]

    [:div.flex.align_c.mb_24
     [:input#agreement.flex_shrink_0.mr_10 {:type "checkbox" :required true}]

     [:label.cur_pointer {:for "agreement"} "Ich habe die Datenschutzerklärung zur Kenntnis genommen."]]

    [:button#btn-submit.w_100.shadow_22 {:type "submit"}
     "Senden"]
    report-msg])
  ([] (raw-contact-form nil nil)))

(defn contact-form [{:keys [title desc mod] :or {mod :light}}]
  (let [[form-cnt-cls img-src] (case mod
                                 :light ["form_l" "/svg/newsletter_l.svg"]
                                 :dark ["form_d" "/svg/newsletter_d.svg"])]
    [:div.contact_form.my_48 {:class form-cnt-cls}
     [:div
      [:h2.h_mb.fs_38.fw_800 title]

      [:div.flex.align_c
       [:img.mr_12 {:decoding "async" :width 100 :height 100 :src img-src}]

       [:p.w_60.fw_400.fs_20.lh_1d6 desc]]]

     (raw-contact-form)]))

(defn success-msg []
  [:div#contact_form_toast.flex.align_c.w_100.p_6.border_r_8.border_light_shadow.bg_light {:role "alert"}
   [:div.inline_flex.align_c.justify_c.flex_shrink_0.size_30.border_r_8.bg_green_700
    [:svg {:width 18 :high 18 :fill "#fff" :viewBox "0 0 20 20"}
     [:path {:d "M10 .5a9.5 9.5 0 1 0 9.5 9.5A9.51 9.51 0 0 0 10 .5Zm3.707 8.207-4 4a1 1 0 0 1-1.414 0l-2-2a1 1 0 0 1 1.414-1.414L9 10.586l3.293-3.293a1 1 0 0 1 1.414 1.414Z"}]]]

   [:div.fw_300.fst_it.ml_10 "Ihre Nachricht wurde zugestellt."]])


(defn failure-msg []
  [:div#contact_form_toast.flex.align_c.w_100.p_6.border_r_8.border_light_shadow.bg_light {:role "alert"}
   [:div.inline_flex.align_c.justify_c.flex_shrink_0.size_30.border_r_8.bg_red_800
    [:svg {:width 18 :high 18 :fill "#fff" :viewBox "0 0 20 20"}
     [:path {:d "M10 .5a9.5 9.5 0 1 0 9.5 9.5A9.51 9.51 0 0 0 10 .5Zm3.707 11.793a1 1 0 1 1-1.414 1.414L10 11.414l-2.293 2.293a1 1 0 0 1-1.414-1.414L8.586 10 6.293 7.707a1 1 0 0 1 1.414-1.414L10 8.586l2.293-2.293a1 1 0 0 1 1.414 1.414L11.414 10l2.293 2.293Z"}]]]

   [:div.fw_300.fst_it.ml_10 "Etwas ist schiefgelaufen, bitte versuchen Sie es erneut."]])

