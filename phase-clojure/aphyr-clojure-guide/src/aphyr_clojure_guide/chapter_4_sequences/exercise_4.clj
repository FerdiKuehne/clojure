(ns aphyr-clojure-guide.chapter-4-sequences.exercise-4)


(defn first-100-prime-numbers
  "Chapter 4 Sequences
   Problem 4
   Find the first 100 prime numbers: 2, 3, 5, 7, 11, 13, 17, …."
  []
  (take 50 (filter odd? (iterate inc 0))))

(first-100-prime-numbers)
