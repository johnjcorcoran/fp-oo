;; 1.7
;; Implement (tails sequence):
;; Returns a sequence of successively subsequences of the argument.

(def tails
     (fn [seq]
       (map drop
            (range (inc (count seq)))
            (repeat (inc (count seq)) seq))))

(tails '(1 2 3))

(range 4)

(repeat 4 '(1 2 3))


