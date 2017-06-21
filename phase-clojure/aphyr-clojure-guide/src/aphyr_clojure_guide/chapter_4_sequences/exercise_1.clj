(ns aphyr-clojure-guide.chapter-4-sequences.exercise-1)


(defn palindrome-check
  "chapter-4 Sequences
   Exercise 1
   Write a function to find out if a string is a palindrome–that is,
   if it looks the same forwards and backwards."
  [input-string]
  (if (= input-string (apply str (reverse input-string)))
    true
    false))
