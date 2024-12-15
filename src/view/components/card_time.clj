(ns view.components.card-time)

(defn card-time [{:keys [title sub-title text]}]
  [:div.card_time.border_r_25.p_18.bg_light
   [:div.card_time_inner.px_26.pt_26
    [:h3.mb_24.fs_12.fw_600.uppercase.c_social sub-title]
    [:h3.mb_24.fs_26.fw_600 title]
    [:p.fs_14 text]]

   [:div.show_modal_btn]])
