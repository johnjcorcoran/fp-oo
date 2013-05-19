;;; 1.4
;;; Implement a bizarre version of factorial that uses neither iteration nor recursion.

(defn factorial [n]
  (apply * (range 1 (+ n 1))))
