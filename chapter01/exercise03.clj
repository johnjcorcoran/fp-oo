;;; 1.3
;;; Implement add-squares.

(defn add-squares [& numbers] 
  (apply + (map * numbers numbers)))
