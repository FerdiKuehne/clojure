(ns aphyr-clojure-guide.chapter-6-state.exercise-4)

(defn sum [start end] (reduce + (range start end)))




(defn sum-atom
  "Chapter 6 State
   Exercise 4
   Instead of using reduce,
   store the sum in an atom and use two futures
   to add each number from the lower and upper range to that atom.
   Wait for both futures to complete using deref,
   then check that the atom contains the right number.
   Is this technique faster or slower than reduce? Why do you think that might be?"
  [start end]
  let [x 0 y 0 z (atom 0)]
  (if (number? (+ @x @y))
    (swap! z + @x @y))
  (future x);;thread 1
  (future y);;thread 2
  (+ @x @y)
  (range start end))

(range 0 4)

(def x (atom 0))

(swap! x + 1 1)

