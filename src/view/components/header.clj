(ns view.components.header)

(defn header [route]
  [:header.sticky.top_0.z_50.bg_blur
   [:div.container.flex.align_c.justify_sb.py_20.relative
    [:a {:href "/"}
     [:img {:alt "logo" :width 30 :height 30 :src "/logo/min_logo.svg"}]]

    [:nav.desc_nav
     [:a.nav_i.fw_600 {:class (if (= route "private-move") " nav_i_active" "") :href "/private-move"}
      "Privatumzug"]

     [:a.nav_i.fw_600.ml_32 {:class (if (= route "company-move") " nav_i_active" "") :href "/company-move"}
      "Firmenumzug"]

     [:a.nav_i.fw_600.ml_32 {:class (if (= route "price") " nav_i_active" "") :href "/price"}
      "Preisanfrage"]

     [:a.nav_i.fw_600.ml_32 {:class (if (= route "privacy-policy") " nav_i_active" "") :href "/privacy-policy"}
      "Datenschutzerklärung"]]

    [:input#mob_nav_switch {:type "checkbox"}]
    [:label.toggle {:for "mob_nav_switch"}
     [:div#bar1.bars]
     [:div#bar2.bars]
     [:div#bar3.bars]]

    [:div.mobile_nav_container
     [:nav.mobile_nav
      [:a.flex.py_6.c_light.fw_500.fs_14.lh_1d6 {:class (if (= route "private-move") " mob_nav_active" "") :href "/private-move"} "Privatumzug"]
      [:a.flex.py_6.c_light.fw_500.fs_14.lh_1d6 {:class (if (= route "company-move") " mob_nav_active" "") :href "/company-move"} "Firmenumzug"]
      [:a.flex.py_6.c_light.fw_500.fs_14.lh_1d6 {:class (if (= route "price") " mob_nav_active" "") :href "/price"} "Preisanfrage"]
      [:a.flex.py_6.c_light.fw_500.fs_14.lh_1d6 {:class (if (= route "privacy-policy") " mob_nav_active" "") :href "/privacy-policy"} "Datenschutzerklärung"]]]]])
