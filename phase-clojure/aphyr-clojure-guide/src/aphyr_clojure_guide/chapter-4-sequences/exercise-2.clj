(ns aphyr-clojure-guide.chapter-4-sequences.exercise-2)

(defn count-of-value-in-string
  "Chapter 4 Sequences
   Exercise 2
   Find the number of ‘c’s in “abracadabra”."
  [search-string search-value]
  (map (frequencies search-string) (seq search-value)))

(count-of-value-in-string "qwerqwerqwer" "w")
