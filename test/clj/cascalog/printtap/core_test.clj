(ns cascalog.printtap.core-test
  (:use cascalog.api
        cascalog.printtap.core
        clojure.test))

(def people [["ben" 35] ["jerry" 41]])

(deftest test-stdout-prn
  (?- (stdout-prn)
      (<- [?name ?age]
          (people ?name ?age)
          (< ?age 40))))

(deftest test-stdout-prn-separator
  (?- (stdout-prn "\t")
      (<- [?name ?age]
          (people ?name ?age)
          (< ?age 40))))
