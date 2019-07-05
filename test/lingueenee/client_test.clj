(ns lingueenee.client
  (:require [clojure.test :refer :all]
            [lingueenee.client :refer all]))

(deftest base-url-is-correct
  (testing "if the base url is correct"
    (is (= client/base-url "https://www.linguee.de/deutsch-englisch/search?query=gemütlich"))))
