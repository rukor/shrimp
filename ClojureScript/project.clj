(defproject shrimp "0.1.0-SNAPSHOT"
            :description "Demo project for Goby."
            :dependencies [[org.clojure/clojure "1.6.0"]
                           [org.clojure/clojurescript "0.0-2760"]
                           [org.clojure/core.async "0.1.346.0-17112a-alpha"]
                           [goby "0.1.0"]
                           [weasel "0.5.0"]]
            :plugins [[lein-cljsbuild "1.0.3"]
                      [jarohen/simple-brepl "0.2.1"]]
            :source-paths ["src"]
            :brepl {:ip "127.0.0.1"}
            :cljsbuild {:builds {:dev
                                  {:source-paths ["src"
                                                  "dev-src"]
                                   :compiler     {:output-to     "js/main.js"
                                                  :optimizations :whitespace
                                                  :externs       ["externs.js"]
                                                  :pretty-print  true}}
                                 :rel
                                  {:source-paths ["src"
                                                  "rel-src"]
                                   :compiler     {:output-to     "js/main.js"
                                                  :optimizations :advanced
                                                  :externs       ["externs.js"]
                                                  :pretty-print  false
                                                  :pseudo-names  false}}}})
