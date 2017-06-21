(ns aphyr-clojure-guide.chapter-5-macros.exercise-4)

(def logging-enabled false)

(defmacro log
  "Chapter 5 Macros
   Exercise 4
   Write a macro log which uses a var, logging-enabled,
   to determine whether or not to print an expression to the console at compile time.
   If logging-enabled is false, (log :hi) should macroexpand to nil.
   If logging-enabled is true, (log :hi) should macroexpand to (prn :hi).
   Why would you want to do this check during compilation,
   instead of when running the program? What might you lose?"
  [args]
  (case logging-enabled
    true (prn args)
    false nil))

(log :hi)
 
