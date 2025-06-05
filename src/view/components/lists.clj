(ns view.components.lists)

(defn link-list [{:keys [ul-cls li-cls links] :or {ul-cls "fs_14" li-cls "mb_20"}}]
  [:ul {:class ul-cls}
   (map (fn [[href label]]
          [:li {:class li-cls}
           [:a {:href href} label]]) links)])

(defn tag-list [{:keys [tags]}]
  [:div.flex.flex_wrap.align_c
   (map #(vector :div.tag %) tags)])