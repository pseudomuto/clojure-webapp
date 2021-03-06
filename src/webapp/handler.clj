(ns webapp.handler
  (:require [compojure.core :refer :all]
            [compojure.handler :as handler]
            [compojure.route :as route]))

(defroutes app-routes
  (GET "/" [] "Hello World")
  (GET "/test" [] "Test Page")
  (route/resources "/")
  (route/not-found "Not Found"))

(def app
  (handler/site app-routes))
