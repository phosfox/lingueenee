(ns lingueenee.core
  (:require [lingueenee.client :as client]
            [clojure.pprint :as pprint])
  (:gen-class))

(defn -main
  "Starts the programm"
  [& args]
  (if (= (count args) 0)
    (println "Please pass in a german word to translate")
    (do
      (print "Results:")
      (println (client/translate args)))))
