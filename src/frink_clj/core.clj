(ns frink-clj.core
  (:import frink.parser.Frink)
  (:gen-class)
)

(defn frink[input]
   (let [
           parser (new frink.parser.Frink)
        ]
        (.parseString parser input)
   )
)


(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (frink "2 + 5/22 + 1234/56789379"))
)
