;; 1. List
(println "----- LIST -----")
(def my-list '(10 20 30))

(println "Original list:" my-list)
(println "First element:" (first my-list))
(println "Remaining elements:" (rest my-list))
(println "New list:" (conj my-list 5))
(println "Original list remains:" my-list)


;; 2. Vector
(println "\n----- VECTOR -----")
(def my-vector [10 20 30])

(println "Original vector:" my-vector)
(println "New vector:" (conj my-vector 40))
(println "Element at index 1:" (get my-vector 1))
(println "Total elements:" (count my-vector))
(println "Original vector remains:" my-vector)


;; 3. Map
(println "\n----- MAP -----")
(def my-map {:name "Shreya" :age 22})

(println "Original map:" my-map)
(println "New map after adding city:" (assoc my-map :city "Delhi"))
(println "New map after removing age:" (dissoc my-map :age))
(println "Name:" (get my-map :name))
(println "Original map remains:" my-map)


;; 4. Set
(println "\n----- SET -----")
(def my-set #{10 20 30})

(println "Original set:" my-set)
(println "New set after adding 40:" (conj my-set 40))
(println "New set after removing 20:" (disj my-set 20))
(println "Contains 10:" (contains? my-set 10))
(println "Original set remains:" my-set)
