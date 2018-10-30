(ns app.index
  (:require
   [hoplon.core :as h]
   [javelin.core :as j]
   [hoplon.jquery]))

(h/html
 (h/body
  (h/h1 "Hello, Hoplon!")))
