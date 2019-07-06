(ns lingueenee.client
  (:require [clj-http.client :as http]
            [clojure.pprint :as pprint]
            [hickory.core :as hickory]
            [hickory.select :as selector]))

(def base-url "https://www.linguee.de/deutsch-englisch/search?source=auto&query=gerne")

(defn get-body-of
  "Returns the html-body of the given url"
  [url]
  (:body (http/get url)
          {:headers {"User-Agent" "Mozilla/5.0 Gecko/20100101"
                     :insecure? true}}))

(defn parse-body
  "Returns a tree of the xml/elemnt struct-map"
  [body]
  (hickory/parse body))

(defn select-dictLink
  "Selects 'dictLink'"
  [parsed]
  (selector/select (selector/child (selector/class "dictLink"))  parsed))

(defn get-content
  "Returns the content of the selected elements"
  [selections]
  (take 5 (map :content selections)))

(def run
  "Does everything"
  (-> base-url get-body-of parse-body hickory/as-hickory select-dictLink get-content))
