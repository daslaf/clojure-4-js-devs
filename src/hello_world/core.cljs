(ns hello-world.core)

(def message "Hello, World! 👋")
(def root (.getElementById js/document "root"))

(println message)
(.log js/console message)
