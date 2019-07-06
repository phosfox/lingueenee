(ns lingueenee.core
  (:require [lingueenee.client :as client])
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!")
  (let [response (client/get-body-of client/base-url)] 
    (println response))
  (let [parsed (client/parse-body response)]
    (println parsed)))
