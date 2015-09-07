(require '[cljs.build.api :as b])

(b/watch (b/inputs "test" "src")
  {:main 'httpurr.runner
   :target :nodejs
   :output-to "out/tests.js"
   :output-dir "out"
   :verbose true})
