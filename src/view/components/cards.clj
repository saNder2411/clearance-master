(ns view.components.cards)

(defn card [{:keys [id card-class left-class right-class title left-text right-text bg-image]}]
  [:div.card.border_r_12 {:class card-class}
   [:style
    (str
      "#" id ":checked ~ .card_left .show_icon {transform: rotate(135deg)}"
      "#" id ":checked ~ .card_left .show_label {transform: translateX(-100%);opacity: 0}"
      "#" id ":checked ~ .card_right .card_img {opacity: 0}")]
   [:input.hidden {:id id :type "checkbox"}]
   [:div.card_left.p_60_res {:class left-class}
    [:h3.h_mb.fs_28.fw_400 title]
    [:p.p_mb left-text]

    [:label.show_toggle.mb_-32_res {:for id}
     [:div.show_icon]
     [:span.show_label.fs_16 "Mehr"]]]

   [:div.card_right.p_60_res {:class right-class}
    [:div.card_img {:style (format "background-image: url(%s)" bg-image)}]
    [:p right-text]]])

(defn card-img-left [{:keys [title p1 p2]}]
  [:div.card_img_left.bg_light.border_r_12.my_24
   [:div.card_img_left_text.p_60_res
    [:h2.h_mb.fs_28.fw_600 title]
    [:p.p_mb p1]
    [:p p2]]
   [:div.card_img_left_img]])

(defn card-text [{:keys [title text image-path]}]
  [:div.flex.direction_col.bg_light.border_r_12.p_42_res
   [:img.ml_a {:decoding "async" :width 100 :src image-path}]
   [:h2.h_mb.fs_28.fw_600 title]
   [:p text]])

(defn card-time [{:keys [title sub-title text]}]
  [:div.card_time.border_r_25.p_18.bg_light
   [:div.card_time_inner.px_26.pt_26
    [:h3.mb_24.fs_12.fw_600.uppercase.c_social sub-title]
    [:h3.mb_24.fs_26.fw_600 title]
    [:p.fs_14 text]]
   [:div.show_modal_btn]])

(defn card-price [{:keys [title entries]}]
  (let [[l-k l-v] (last entries)
        bordered (mapv (fn [[k v]]
                         [:div.flex.flex_wrap.align_c.justify_sb.px_4.py_20.border_b_1.border_gray_100
                          [:dt k]
                          [:dd.fw_600 v]]) (butlast entries))
        items (apply list (conj bordered [:div.flex.flex_wrap.align_c.justify_sb.px_4.py_20
                                          [:dt l-k]
                                          [:dd.fw_600 l-v]]))]
    [:div.card_shadow.border_r_12.p_32.bg_light
     [:h3.mb_24.fs_24.fw_600 title]

     [:dl
      items]]))