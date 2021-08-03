(def base-co2 382)
(def base-year 2006)

(defn co2-estimate
  "Takes one integer parameter called `year` and returns the estimated level of CO2 ppm for that year"
  [year]
  (let [year-diff (- year base-year)]
  (+ base-co2 (* year-diff 2)))
)
