(defproject jepsen.agency "0.1.0-SNAPSHOT"
  :description "Jepsen test for ArangoDB's Agency (highly reliable distributed configuration server)"
  :url "http://www.arangodb.com/"
  :license {:name "Apache2 Public License"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [jepsen "0.0.9"]
                 [cheshire "5.6.3"]
                 [clj-http "1.1.2"]
                 [base64-clj "0.1.1"]])
