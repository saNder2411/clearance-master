(ns dev
  (:require [com.stuartsierra.component.repl :as component-repl]
            [api.core :as core]))

(component-repl/set-init
  (fn [_old-system]
    (core/services-system {:env    :dev
                           :server {:port 8080 :host "0.0.0.0"}})))
