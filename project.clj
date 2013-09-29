(defproject bible-plan "0.1.0-SNAPSHOT"
  :description  "A Tool to Generate Bible Reading Plans"
  :url          "http://bibleplan.twonegatives.com"
  :license      {:name "Eclipse Public License"
                 :url "http://www.eclipse.org/legal/epl-v10.html"}
  :source-paths ["src/clj" "src/cljs"]
  :dependencies [[org.clojure/clojure             "1.5.1"]
                 [org.clojure/clojurescript       "0.0-1909"]
                 [prismatic/dommy                 "0.1.1"]
                 [ring                            "1.2.0"]
                 [compojure                       "1.1.5"]
                 [enlive                          "1.1.1"]
                 [com.cemerick/clojurescript.test "0.0.4"]]
  :profiles     {:dev {:repl-options {:init-ns dev-server}
                       :plugins      [[com.cemerick/austin "0.1.1"]
                                      [lein-cljsbuild      "0.3.3"]]
                       :cljsbuild    {:builds [{:source-paths   ["src/cljs"]
                                                :notify-command ["terminal-notifier"
                                                                 "-title"
                                                                 "bible-plan"
                                                                 "-subtitle"
                                                                 "whitespace"
                                                                 "-group"
                                                                 "bible-plan-build"
                                                                 "-activate"
                                                                 "com.googlecode.iTerm2"
                                                                 "-message"]
                                                :compiler       {:pretty-print  true
                                                                 :output-to     "resources/public/whitespace/bible-plan.js"
                                                                 :optimizations :whitespace}}
                                               {:source-paths   ["src/cljs"]
                                                :notify-command ["terminal-notifier"
                                                                 "-title"
                                                                 "bible-plan"
                                                                 "-subtitle"
                                                                 "advanced"
                                                                 "-group"
                                                                 "bible-plan-build"
                                                                 "-activate"
                                                                 "com.googlecode.iTerm2"
                                                                 "-message"]
                                                :compiler       {:pretty-print  false
                                                                 :output-to     "resources/public/bible-plan.js"
                                                                 :optimizations :advanced}}]}}})
