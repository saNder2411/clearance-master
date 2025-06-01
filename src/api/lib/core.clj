(ns api.lib.core)

(defn random-int-id
  ([prefix n] (apply str prefix "-" (repeatedly n #(rand-int 10))))
  ([prefix] (random-int-id prefix 6))
  ([] (random-int-id "" 6)))
