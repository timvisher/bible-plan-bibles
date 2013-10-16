(defproject bible-plan-bibles "0.1.0-SNAPSHOT"
  :description  "Bibles for Bible Plan"
  :url          "http://github.com/timvisher/bible-plan-bibles"
  :license      {:name "Eclipse Public License"
                 :url "http://www.eclipse.org/legal/epl-v10.html"}
  :source-paths ["src/clj" "src/cljs"]
  :dependencies [[org.clojure/clojure       "1.5.1"]
                 [org.clojure/clojurescript "0.0-1913"]]
  :profiles     {:dev {:repl-options {:init-ns dev-server}
                       :plugins      [[com.cemerick/austin "0.1.1"]
                                      [lein-cljsbuild      "0.3.3"]]
                       :cljsbuild    {:builds [{:source-paths   ["src/cljs"]
                                                :notify-command ["terminal-notifier"
                                                                 "-title"
                                                                 "bible-plan-bibles"
                                                                 "-subtitle"
                                                                 "whitespace"
                                                                 "-group"
                                                                 "bible-plan-bibles-build"
                                                                 "-activate"
                                                                 "com.googlecode.iTerm2"
                                                                 "-message"]
                                                :compiler       {:pretty-print  true
                                                                 :output-to     "resources/public/whitespace/js/bible-plan-bibles.js"
                                                                 :optimizations :whitespace}}
                                               {:source-paths   ["src/cljs"]
                                                :notify-command ["terminal-notifier"
                                                                 "-title"
                                                                 "bible-plan-bibles"
                                                                 "-subtitle"
                                                                 "simple"
                                                                 "-group"
                                                                 "bible-plan-bibles-build"
                                                                 "-activate"
                                                                 "com.googlecode.iTerm2"
                                                                 "-message"]
                                                :compiler       {:pretty-print  true
                                                                 :output-to     "resources/public/simple/js/bible-plan-bibles.js"
                                                                 :optimizations :simple}}
                                               {:source-paths   ["src/cljs"]
                                                :notify-command ["terminal-notifier"
                                                                 "-title"
                                                                 "bible-plan-bibles"
                                                                 "-subtitle"
                                                                 "advanced"
                                                                 "-group"
                                                                 "bible-plan-bibles-build"
                                                                 "-activate"
                                                                 "com.googlecode.iTerm2"
                                                                 "-message"]
                                                :compiler       {:pretty-print  false
                                                                 :output-to     "resources/public/js/bible-plan-bibles.js"
                                                                 :optimizations :advanced}}]}}})
