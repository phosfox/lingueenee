(ns lingueenee.client
  (:require [clj-http.client :as http]
            [clojure.pprint :as pprint]
            [clojure.xml :as xml]
            [clojure.zip :as zip]))

(def base-url "https://www.linguee.de/deutsch-englisch/search?query=gerne")

(defn get-body-of
  "Returns the html-body of the given url"
  [url]
  (:body (http/get url)))

(defn parse-body
  "Returns a tree of the xml/elemnt struct-map"
  [body]
  (xml/parse body))
