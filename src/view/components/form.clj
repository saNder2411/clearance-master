(ns view.components.form)



(defn raw-contact-form
  ([success-elm] [:form.relative {:autocomplete "off"
                                  :hx-post      "/contact-form"
                                  :hx-target    "this"
                                  :hx-swap      "outerHTML settle:4s"}
                  [:div.control.mb_16
                   [:input {:name "username" :autocomplete "on" :placeholder "Name" :minlength 2 :required true}]]

                  [:div.control.mb_16
                   [:input {:type "email" :name "email" :autocomplete "on" :placeholder "E-Mail-Adresse" :required true}]]

                  [:div.control.mb_16
                   [:textarea {:type "text" :name "message" :rows 2 :autocomplete "on" :placeholder "Ihre Nachricht" :maxlength 2000 :required true}]]

                  [:div.flex.align_c.mb_24
                   [:input#agreement.flex_shrink_0.mr_10 {:type "checkbox" :required true}]

                   [:label.cur_pointer {:for "agreement"} "Ich habe die Datenschutzerklärung zur Kenntnis genommen."]]

                  [:button#btn-submit.w_100.shadow_22 {:type "submit"}
                   "Senden"]
                  success-elm])
  ([] (raw-contact-form nil)))

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

(defn success-toast []
  [:div.success_toast
   [:svg {:width 120 :height 120 :viewBox "0 0 400 400"}
    [:circle.circle {:fill "none" :stroke "#68E534" :stroke-width "20" :cx "200" :cy "200" :r "190" :stroke-linecap "round" :transform "rotate(-90 200 200)"}]
    [:polyline.tick {:fill "none" :stroke "#68E534" :points "88,214 173,284 304,138" :stroke-width "24" :stroke-linecap "round" :stroke-linejoin "round"}]]])





