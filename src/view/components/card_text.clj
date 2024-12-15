(ns view.components.card-text)

(defn card-text [{:keys [title text image-path]}]
  [:div.flex.direction_col.bg_light.border_r_12.p_42_res
   [:img.ml_a {:width 100 :src image-path}]
   [:h2.h_mb.fs_28.fw_600  title]
   [:p  text]])
