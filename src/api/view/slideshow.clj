(ns api.view.slideshow)

(defn gen-mover-items [path]
  (map (fn [index]
         [:div {:class "mover_item"}
          [:img {:src (str path index ".png")}]]) (range 0 6)))

(defn gen-mover [class items]
  (into [:div {:class class}] (concat items items)))

(defn slideshow []
  [:div {:class "slideshow"}
   (gen-mover "mover mover_a mb_28"
              (gen-mover-items "/img/slider_a_"))

   (gen-mover "mover mover_b mb_28"
              (gen-mover-items "/img/slider_b_"))

   (gen-mover "mover mover_c mb_28"
              (gen-mover-items "/img/slider_c_"))

   [:div {:class "slideshow_mask"}]])
