(ns view.components.elements)

(defn icon-text-row [{:keys [img-alt img-w img-src text] :or {img-alt "icon" img-w 18}}]
  [:div.flex.flex_wrap.align_c
   [:img {:alt img-alt :width img-w :src img-src}]
   [:span.ml_8 text]])
