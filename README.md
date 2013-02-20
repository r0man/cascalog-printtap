# Cascalog Printtap [![Build Status](https://travis-ci.org/r0man/cascalog-printtap.png)](https://travis-ci.org/r0man/cascalog-printtap)

A Cascalog tap that prints tuples via Clojure's pr-str function.

## Installation

Via Clojars: https://clojars.org/cascalog-printtap

## Usage

    (def people [["ben" 35] ["jerry" 41]])

    (?- (stdout-prn)
        (<- [?name ?age]
            (people ?name ?age)
            (< ?age 40)))

## License

Copyright © 2013 Roman Scherer, Sebastian Nadorp

Distributed under the Eclipse Public License, the same as Clojure.
