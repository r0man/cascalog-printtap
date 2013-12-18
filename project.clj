(defproject cascalog-printtap "0.1.4"
  :description "A Cascalog tap that prints tuples via Clojure's pr-str function."
  :url "https://github.com/r0man/cascalog-printtap"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :repositories {"conjars" "http://conjars.org/repo/"
                 "cloudera" "https://repository.cloudera.com/artifactory/cloudera-repos"}
  :profiles {:dev {:dependencies [[org.apache.hadoop/hadoop-core "0.20.2-cdh3u5"]]}}
  :dependencies [[cascalog "2.0.0"]
                 [org.clojure/clojure "1.5.1"]]
  :source-paths ["src/clj"]
  :test-paths ["test/clj"]
  :java-source-paths ["src/jvm"]
  :jvm-opts ["-XX:MaxPermSize=128m" "-Xmx1024m" "-XX:-UseGCOverheadLimit"]
  :javac-options ["-target" "1.6" "-source" "1.6"]
  :lein-release {:deploy-via :clojars})
