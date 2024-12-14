(ns api.view.header)

(defn header [route]
  [:header {:class "sticky top_0 z_50 bg_blur"}
   [:div {:class "container flex align_c justify_sb py_20 relative"}
    [:a {:href "/"}
     [:img {:alt "logo" :width 30 :height 30 :src "/logo/min_logo.svg"}]]

    [:nav {:class "desc_nav"}
     [:a.nav_i.fw_600 {:class (if (= route "private-move") " nav_i_active" "") :href "/private-move"}
      "Privatumzug"]

     [:a.nav_i.fw_600.ml_32 {:class (if (= route "company-move") " nav_i_active" "") :href "/company-move"}
      "Firmenumzug"]

     [:a.nav_i.fw_600.ml_32 {:class (if (= route "price") " nav_i_active" "") :href "/price"}
      "Preisanfrage"]

     [:a.nav_i.fw_600.ml_32 {:class (if (= route "household-clearances") " nav_i_active" "") :href "/household-clearances"}
      "Haushaltsauflösungen"]]

    [:input {:id "mob_nav_switch" :type "checkbox"}]
    [:label {:class "toggle" :for "mob_nav_switch"}
     [:div {:id "bar1" :class "bars"}]
     [:div {:id "bar2" :class "bars"}]
     [:div {:id "bar3" :class "bars"}]]

    [:div {:class "mobile_nav_container"}
     [:nav {:class "mobile_nav"}
      [:a.flex.py_6.c_light.fw_500.fs_14.lh_1d6 {:class (if (= route "private-move") " mob_nav_active" "") :href "/private-move"} "Privatumzug"]
      [:a.flex.py_6.c_light.fw_500.fs_14.lh_1d6 {:class (if (= route "company-move") " mob_nav_active" "") :href "/company-move"} "Firmenumzug"]
      [:a.flex.py_6.c_light.fw_500.fs_14.lh_1d6 {:class (if (= route "price") " mob_nav_active" "") :href "/price"} "Preisanfrage"]
      [:a.flex.py_6.c_light.fw_500.fs_14.lh_1d6 {:class (if (= route "household-clearances") " mob_nav_active" "") :href "/household-clearances"} "Haushaltsauflösungen"]]]]])
