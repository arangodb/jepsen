(ns jepsen.agency-test
  (:require [clojure.test :refer :all]
            [jepsen.core :as jepsen]
            [jepsen.agency :as ag]))

(deftest ag-test
  (is (:valid? (:results (jepsen/run! (ag/ag-test "3.1.alpha1"))))))
