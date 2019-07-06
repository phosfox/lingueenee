(ns lingueenee.client-test
  (:require [clojure.test :refer :all]
            [lingueenee.client :as client]))

(deftest base-url-is-correct
  (testing "if the base url is correct"
    (is (= client/base-url "https://www.linguee.de/deutsch-englisch/search?query=gerne"))))

(deftest request-is-correct
  (testing "if the request is correct"
    (is (= {} client/do-request ""))))
