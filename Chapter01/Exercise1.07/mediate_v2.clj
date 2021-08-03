(defn meditate
  "The function will print a transformation of the string passed as a
second argument based on the `calmness-level` value."
  [s calmness-level]
  (println "Clojure Meditate v2.0")
  (if (< calmness-level 5)
    (str (clojure.string/upper-case s) ", I TELL YA!")
    (if (<= 5 calmness-level 9)
      (clojure.string/capitalize s)
      (if (= 10 calmness-level)
        (clojure.string/reverse s)
        nil))))

(defn meditate
  "The function will print a transformation of the string passed as a
second argument based on the `calmness-level` value."
  [s calmness-level]
  (println "Clojure Meditate v2.0")
  (cond
    (< calmness-level 5) (str (clojure.string/upper-case s) ", I TELL YA!")
    (<= 5 calmness-level 9) (clojure.string/capitalize s)
    (= 10 calmness-level) (clojure.string/reverse s)))
