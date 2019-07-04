(ns lingueenee.client
  (:require [clj-http.client :as client]))

(def base-url "https://www.linguee.de/%s-%s/")

(def search-url-part "search?query=")

(defn from-to-langs [from to]
  (format base-url from to))

(defn add-query-to-base-url [search-term]
  (str base-url))
