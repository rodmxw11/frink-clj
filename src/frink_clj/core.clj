(ns frink-clj.core
  (:import frink.parser.Frink)
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!")
  (let [
         frink (new frink.parser.Frink)
         results (.parseString frink "2 + 3/4 + 9/17")
       ]
       (println results)
   )  
)
