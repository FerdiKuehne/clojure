(ns aphyr-clojure-guide.chapter-6-state.exercise-1)

(defn delay-eval-time
  "Chapter 6 State
   Exercise 1
   Use delay to compute this sum lazily; show that it takes no time to return the delay,
   but roughly 1 second to deref."
  []
  (let [start 0 end 1e7]
    (-> (delay (reduce + (range start end)))
        (time) (deref) (time))))


