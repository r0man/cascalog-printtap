(ns cascalog.printtap.core
  (:import cascalog.printtap.Stdout))

(defn stdout-prn
  "Like cascalog's `stdout` tap, but uses `prn`."
  ([] (Stdout.))
  ([separator] (Stdout. separator)))
