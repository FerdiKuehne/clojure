(ns aphyr-clojure-guide.chapter-4-sequences.exercise-3)

(defn my-own-filter
  "Chapter 4 Sequences
   Problem 3
   Write your own version of filter."
  [f data-set]
  (if (first data-set)
     (if (= true (f (first data-set)))
      (cons (first data-set) (my-own-filter f (rest data-set)))
      (my-own-filter f (rest data-set)))
     (list)))


