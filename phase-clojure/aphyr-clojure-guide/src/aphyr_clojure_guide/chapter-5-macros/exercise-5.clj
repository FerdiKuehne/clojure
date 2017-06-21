(ns aphyr-clojure-guide.chapter-5-macros.exercise-5)

(defmacro exact
  "Chapter 5 Macros
   Exercise 5
   (Advanced) Using the rationalize function,
   write a macro exact which rewrites any use of +, -, *, or /
   to force the use of ratios instead of floating-point numbers.
   (* 2452.45 100) returns 245244.99999999997,
   but (exact (* 2452.45 100)) should return 245245N"
  [f & args]
  ([] nil)
  ([x] (cast Number x))
  ([x y & more]))




