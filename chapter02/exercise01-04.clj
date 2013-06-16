;; pasting all of Marick's code here as load-file doesn't seem to be working

(def point {:x 1, :y 2, :__class_symbol__ 'Point})

(def Point
     (fn [x y]
       {:x x,
        :y y
        :__class_symbol__ 'Point}))

(def x :x)
(def y :y)
(def class-of :__class_symbol__)

(def shift
     (fn [this xinc yinc]
       (Point (+ (x this) xinc)
              (+ (y this) yinc))))

(def Triangle
     (fn [point1 point2 point3]
       {:point1 point1, :point2 point2, :point3 point3
        :__class_symbol__ 'Triangle}))


(def right-triangle (Triangle (Point 0 0)
                              (Point 0 1)
                              (Point 1 0)))

(def equal-right-triangle (Triangle (Point 0 0)
                                    (Point 0 1)
                                    (Point 1 0)))

(def different-triangle (Triangle (Point 0 0)
                                  (Point 0 10)
                                  (Point 10 0)))

;; 3.1

(def add
  (fn [first second]
    (Point (+ (x first) (x second))
           (+ (y first) (y second)))))

(add (Point 2 5) (Point 3 6))

(def add-with-shift
  (fn [first second]
    (shift first (x second) (y second))))

(add-with-shift (Point 2 5) (Point 3 6))


;; 3.2

(def make
  (fn [type x y]
    (type x y)))

(make Point 1 2)

(def make2
  (fn [type & args]
    (apply type args)))

(make2 Triangle 1 2 3)

;; 3.3

(def equal-triangles?
  (fn [triangle1 triangle2]
    (= triangle1 triangle2)))

(equal-triangles? right-triangle right-triangle)

(equal-triangles? right-triangle equal-right-triangle)

(equal-triangles? right-triangle different-triangle)

;; 3.4

(def equal-triangles? =)

(equal-triangles? right-triangle right-triangle different-triangle)

(equal-triangles? right-triangle right-triangle right-triangle)







