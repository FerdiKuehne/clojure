(ns aphyr-clojure-guide.chapter-6-state.exercise-2)

;;Chapter 6 State
;;Exercise 2
;;We can do the computation in a new thread directly, using
;;(.start (Thread.(fn [] (sum 0 1e7)))
;;–but this simply runs the (sum) function and discards the results.
;;Use a promise to hand the result back out of the thread.
;;Use this technique to write your own version of the future macro.

(defmacro i-am-future
  "Chapter 6 State
   Exercise 2
   We can do the computation in a new thread directly, using
   (.start (Thread.(fn [] (sum 0 1e7)))
   –but this simply runs the (sum) function and discards the results.
   Use a promise to hand the result back out of the thread.
   Use this technique to write your own version of the future macro"
  [f & args]
  (promise))

(defn sum [start end] (reduce + (range start end)))

(.start (Thread. (fn [] (sum 0 1e7))))
