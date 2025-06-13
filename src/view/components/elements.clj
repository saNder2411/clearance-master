(ns view.components.elements)

(defn icon-text-row [{:keys [img-alt img-w img-src text] :or {img-alt "icon" img-w 18}}]
  [:div.flex.align_c
   [:img {:decoding "async" :alt img-alt :width img-w :src img-src}]
   [:span.ml_8 text]])

