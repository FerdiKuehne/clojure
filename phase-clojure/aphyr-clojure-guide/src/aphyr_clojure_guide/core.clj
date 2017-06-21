(ns aphyr-clojure-guide.core
  (:require
   [aphyr-clojure-guide.chapter-4-sequences.exercise-1 :refer :all]
   [aphyr-clojure-guide.chapter-4-sequences.exercise-2 :refer :all]
   [aphyr-clojure-guide.chapter-4-sequences.exercise-3 :refer :all]
   [aphyr-clojure-guide.chapter-5-macros.exercise-1 :refer :all]
   [aphyr-clojure-guide.chapter-5-macros.exercise-2 :refer :all]
   [aphyr-clojure-guide.chapter-6-state.exercise-1 :refer :all]
   [aphyr-clojure-guide.chapter-6-state.exercise-3 :refer :all]))


;;Exercise-1
;;function that check if string is palindrome
(palindrome-check "stanley yelnats")
;;Exercise 2
;;function that check how many sequences are in a string
(count-of-value-in-string "qwerae" "e")
;;Exercise 3
;;own filter
(my-own-filter pos? [1 2 -3])
;;Chapter 5 Macros
;;Exercise 1 schedule
(schedule 12)
;;Exercise 2 number of palindromes
(palindrome-numbers)
;;Exercise 1
(delay-eval-time)
;;Exercise 3
(multi-against-single)
