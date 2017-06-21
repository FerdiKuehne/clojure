(ns aphyr-clojure-guide.chapter-5-macros.exercise-2)

(defn palindrome-numbers
  "Chapter 5 Macros
   Exercise 2
   Using the threading macros, find how many numbers from 0 to 9999 are palindromes:
   identical when written forwards and backwards. 121 is a palindrome,
   as is 7447 and 5, but not 12 or 953."
  ([]
   (->> (range 1000)
        (filter
         #(= (str %) (apply str (reverse (str %)))))
        (count)))
  ([var]
   (->> (range var)
        (filter
         #(= (str %) (apply str (reverse (str %)))))
        (count))))
