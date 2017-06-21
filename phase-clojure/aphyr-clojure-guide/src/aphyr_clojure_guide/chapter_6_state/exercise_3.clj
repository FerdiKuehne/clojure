(ns aphyr-clojure-guide.chapter-6-state.exercise-3)

(defn sum [start end] (reduce + (range start end)))

(defn multi-against-single
  "Chapter 6 State
   Exercise 3
   If your computer has two cores, you can do this expensive computation twice as fast by splitting it i   nto two parts: (sum 0 (/ 1e7 2)), and (sum (/ 1e7 2) 1e7), then adding those parts together. Use futu   re to do both parts at once, and show that this strategy gets the same answer as the single-threaded    version, but takes roughly half the time."
  []
  (prn "multi threading")
  (time (let [a (future (sum 0 (/ 1e7 2))) b (future (sum (/ 1e7 2) 1e7))] (+ @a @b)))
  (prn "single threading")
  (time (sum 0 1e7)))

