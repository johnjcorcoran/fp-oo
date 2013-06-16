;; 1.6
;; Implement (prefix-of? candidate sequence)

(defn prefix-of? [candidate sequence]
  (= candidate
     (take (count candidate) sequence)))