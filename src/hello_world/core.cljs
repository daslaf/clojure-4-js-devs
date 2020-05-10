(ns hello-world.core)

(def message "Hello, World! 👋")
(def root (js/document.getElementById "root"))

(println (str "REPL: " message))
(.log js/console (str "Browser: " message))
