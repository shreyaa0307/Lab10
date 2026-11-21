
;; Experiment 18: Sequence Transformations

;; Collection 1
(println "----- COLLECTION 1 -----")
(def numbers [1 2 3 4 5 6])

(println "Original numbers:" numbers)
(println "Squares:" (map #(* % %) numbers))
(println "Even numbers:" (filter even? numbers))
(println "Sum:" (reduce + numbers))
(println "First 3 numbers:" (take 3 numbers))
(println "After dropping 3 numbers:" (drop 3 numbers))

;; Using threading macro
(println "Chained result:"
         (->> numbers
              (filter even?)
              (map #(* % %))
              (take 2)))


;; Collection 2
(println "\n----- COLLECTION 2 -----")
(def numbers2 [10 15 20 25 30])

(println "Original numbers:" numbers2)
(println "Squares:" (map #(* % %) numbers2))
(println "Numbers greater than 15:" (filter #(> % 15) numbers2))
(println "Maximum number:" (reduce max numbers2))
(println "First 2 numbers:" (take 2 numbers2))
(println "After dropping 2 numbers:" (drop 2 numbers2))

;; Using threading macro
(println "Chained result:"
         (->> numbers2
              (filter #(> % 15))
              (map #(* % 2))
              (take 3)))
