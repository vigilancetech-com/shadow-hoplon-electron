(ns app.main
  (:require ["electron" :as e :refer (app BrowserWindow)]
            ["path" :as path]
            ["url" :as url]))

(defonce win-ref (atom nil))

(defn create-window []
  (let [win
        (BrowserWindow. #js {:width 800
                             :height 600})
        url
        (url/format #js {:pathname (path/join js/__dirname "index.html")
                         :protocol "file:"
                         :slashes true})]
    (.loadURL win "http://localhost:8080")
    (.. win -webContents (openDevTools))
    (reset! win-ref win)
    (.on win "closed"
      (fn [e]
        (reset! win-ref nil)))))

(defn maybe-quit []
  (when (not= js/process.platform "darwin")
    (.quit app)))

(defn maybe-create-window []
  (when-not @win-ref
    (create-window)))

(defn main []
  (.on app "ready" create-window)
  (.on app "activate" maybe-create-window)
  (.on app "window-all-closed" maybe-quit))

;; (require '[fs :as f])
;; (def foo (f/readdirSync. "/"))
