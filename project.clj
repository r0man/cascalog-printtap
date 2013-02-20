(defproject cascalog-printtap "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :repositories {"conjars" "http://conjars.org/repo/"
                 "cloudera" "https://repository.cloudera.com/artifactory/cloudera-repos"}
  :profiles {:dev {:dependencies [[org.apache.hadoop/hadoop-core "0.20.2-cdh3u5"]]}}
  :dependencies [[cascalog "1.10.0"]
                 [org.clojure/clojure "1.4.0"]]
  :source-paths ["src/clj"]
  :java-source-paths ["src/jvm"])
