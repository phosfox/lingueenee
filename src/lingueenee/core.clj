(ns lingueenee.core
  (:require [lingueenee.client :as client])
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!")
  (def url (client/from-to-langs "deutsch" "englisch" ))
  (println url))
