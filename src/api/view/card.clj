(ns api.view.card)

(defn card [{:keys [id card-class left-class right-class title left-text right-text bg-image]}]
  [:div.card.border_r_12 {:class card-class}
   [:style
    (str
      "#" id ":checked ~ .card_left .show_icon {transform: rotate(135deg)}"
      "#" id ":checked ~ .card_left .show_label {transform: translateX(-100%);opacity: 0}"
      "#" id ":checked ~ .card_right .card_img {opacity: 0}")]
   [:input.hidden {:id id :type "checkbox"}]
   [:div.card_left.p_60_res {:class left-class}
    [:h3 {:class "h_mb fs_28 fw_400"} title]
    [:p {:class "p_mb c_light_sec"} left-text]

    [:label {:class "show_toggle mb_-32_res" :for id}
     [:div.show_icon]
     [:span.show_label.fs_16 "Mehr"]]]

   [:div.card_right.p_60_res {:class right-class}
    [:div.card_img {:style (format "background-image: url(%s)" bg-image)}]
    [:p right-text]]])
