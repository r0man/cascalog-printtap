(ns printtap.core
  (:import ad.nugg.tap.PrintTap))

(defn stdout-prn
  "Like cascalog's `stdout` tap, but uses `prn`."
  [] (ad.nugg.tap.PrintTap.))
