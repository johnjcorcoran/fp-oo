;;; 1.5
;;; Think of a problem and solve it with the given function.

;; filter
;; Take the first 3 elements from a list.

(take 3 [10 15 20 25 30])

;; distinct
;; Return the unique values in a vector.

(distinct [1 1 1 2 3 1 1 1 4 9])

;; concat 
;; Find the values that are unique across two vectors.

(distinct (concat [1 2 3] [3 3 4 5]))

;; repeat
;; Say thanks three times.

(repeat 3 "Thanks!")

;; interleave
;; Map field names to their values.

(interleave 
 ["First: ", "Middle: ", "Surname: "] 
 ["John", "James", "Corcoran"])

;; drop
;; From the names list return the last 2 items.

(drop 4 
  (interleave 
   ["First: ", "Middle: ", "Surname: "] 
   ["John", "James", "Corcoran"]))

;; drop-last
;; From the names list return the first 2 items.

(drop-last 4 
  (interleave 
   ["First: ", "Middle: ", "Surname: "] 
   ["John", "James", "Corcoran"]))

;; flatten
;; Flatted messy sequential.

(flatten '(1 2 [3 4 5 (6 7)] 8 9))

;; partition
;; Split into lists of numbers into triples.

(partition 3 (range 10))

;; every?
;; Evaluate if every number in a list is even.

(every? even? '(2 4 6 8 9))

;; remove
;; Remove all evil values.

(remove (fn [n] (= n 666)) [1 2 3 666 5 666 7]) 
