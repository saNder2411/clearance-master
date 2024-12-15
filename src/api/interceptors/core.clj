(ns api.interceptors.core
  (:require [io.pedestal.interceptor :as i]))

(defn inject-deps [deps]
  (i/interceptor
    {:name  ::inject-dependencies
     :enter #(assoc % :dependencies deps)}))

(def not-found (i/interceptor
                 {:name  ::not-found
                  :leave (fn [ctx]
                           (if (:response ctx)
                             ctx
                             (assoc ctx :response {:status 404 :body "Sorry, this page not found!"})))}))
