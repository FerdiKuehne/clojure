(ns aphyr-clojure-guide.chapter-5-macros.exercise-3)

(defmacro id
  "Chapter 5 Macros
   Exercise 3
   Write a macro id which takes a function and a list of args: (id f a b c),
   and returns an expression which calls that function with the given args: (f a b c)."
  ([] nil)
  ([f & args]
   `(do
      ~@(map (fn [arg] (list f arg)) args))))

(id pos? 1 -3 -2)
