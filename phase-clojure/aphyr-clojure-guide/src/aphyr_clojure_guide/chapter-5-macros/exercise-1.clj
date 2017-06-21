(ns aphyr-clojure-guide.chapter-5-macros.exercise-1)

(defn schedule
  "Chapter 5 Macros
  Exercise 1
  Using the control flow constructs we’ve learned, write a schedule function which,
  given an hour of the day, returns what you’ll be doing at that time.
  (schedule 18), for me, returns :dinner."
  ([]
   (println "pls enter a number 0-24"))
  ([time]
   (case time
     8  :breakfast
     9  :walking
     12 :lunch
     14 :working
     18 :dinner
     20 :reading
     22 :sleeping
     :nothing)))
