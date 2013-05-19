;;; 1.2
;;; Give two implementations of third.

(def third
  (fn [list] nth list 3))

(def third
  (fn [list] (first 
             (rest (rest list)))))
