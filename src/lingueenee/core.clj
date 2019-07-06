(ns lingueenee.core
  (:require [lingueenee.client :as client]
            [clojure.pprint :as pprint])
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Results:")
  (let [response client/run]
    (println response)))
