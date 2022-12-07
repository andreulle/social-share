(ns social-share.core
  (:gen-class)
  (:require [clj-http.client :as client]
            [clojure.data.json :as json]))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  
  (println "Hello, World!")

(println (-> (client/get "https://1d71f464-30c2-4c97-a9a3-a77b08e02539.mock.pstmn.io")
             :body
            (json/read-str :key-fn keyword)
            :gretting)))

