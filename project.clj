(defproject keyboard-sketch "0.1.0-SNAPSHOT"
  :description "An Etch-A-Sketch like sketch tool"
  :url "https://pirosuke.github.io/games/keyboard-sketch/"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [quil "2.6.0"]
                 [org.clojure/clojurescript "1.9.473"]]

  :plugins [[lein-cljsbuild "1.1.5"]]
  :hooks [leiningen.cljsbuild]

  :cljsbuild
  {:builds [{:source-paths ["src"]
             :compiler
             {:output-to "js/main.js"
              :output-dir "out"
              :main "keyboard_sketch.core"
              :optimizations :none
              :pretty-print true}}]})
