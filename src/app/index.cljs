(ns app.index
  (:require
   [hoplon.core :as h]
   [javelin.core :as j]
   [hoplon.jquery]))

(h/html
 (h/body
  (h/h1 "Hello with fixed, Hoplon!")))

;; just a data structure for you to play around with e.g. in cider-inspect-expr

(j/defc data {:fans
 [{:smooth 0,
   :pwm 0,
   :temp 40,
   :tach 0,
   :color [0 1 0.5],
   :speed 50,
   :name "Fan 1",
   :beg_color [240 1 0.5],
   :end_color [0 1 0.5],
   :type :fan,
   :port 0,
   :id "Fan 0",
   :random 0,
   :device nil,
   :effect "none"}
  {:smooth 0,
   :pwm 0,
   :temp 40,
   :tach 0,
   :color [0 1 0.5],
   :speed 50,
   :name "Fan 2",
   :beg_color [240 1 0.5],
   :end_color [0 1 0.5],
   :type :fan,
   :port 1,
   :id "Fan 1",
   :random 0,
   :device nil,
   :effect "none"}
  {:smooth 0,
   :pwm 0,
   :temp 40,
   :tach 0,
   :color [0 1 0.5],
   :speed 50,
   :name "Fan 3",
   :beg_color [240 1 0.5],
   :end_color [0 1 0.5],
   :type :fan,
   :port 2,
   :id "Fan 2",
   :random 0,
   :device nil,
   :effect "none"}
  {:smooth 0,
   :pwm 0,
   :temp 40,
   :tach 0,
   :color [0 1 0.5],
   :speed 50,
   :name "Fan 4",
   :beg_color [240 1 0.5],
   :end_color [0 1 0.5],
   :type :fan,
   :port 3,
   :id "Fan 3",
   :random 0,
   :device nil,
   :effect "none"}
  {:smooth 0,
   :pwm 0,
   :temp 40,
   :tach 0,
   :color [0 1 0.5],
   :speed 50,
   :name "Fan 5",
   :beg_color [240 1 0.5],
   :end_color [0 1 0.5],
   :type :fan,
   :port 4,
   :id "Fan 4",
   :random 0,
   :device nil,
   :effect "none"}
  {:smooth 0,
   :pwm 0,
   :temp 40,
   :tach 0,
   :color [0 1 0.5],
   :speed 50,
   :name "Fan 6",
   :beg_color [240 1 0.5],
   :end_color [0 1 0.5],
   :type :fan,
   :port 5,
   :id "Fan 5",
   :random 0,
   :device nil,
   :effect "none"}],
 :zone-3
 {:name "South Bridge Thermal Zone",
  :desc "Located next to the memory slots on Intel boards",
  :temp {:value 0}},
 :graphics-cards
 [{:integrated? false,
   :bus-interface
   {:name "Bus Interface", :temp {:value 0, :sensor "Bus Interface"}},
   :name "NVIDIA GeForce GT 230M",
   :gpu
   {:name "GPU",
    :temp {:value 84, :sensor "GPU"},
    :load {:value 17, :sensor "GPU"}},
   :memory {:name "Memory", :load {:value 0}},
   :type :graphics-card,
   :id "gpus 0",
   :video-engine
   {:name "Video Engine", :temp {:value 0, :sensor "Video Engine"}},
   :frame-buffer
   {:name "Frame Buffer", :load {:value 8, :sensor "Frame Buffer"}}}],
 :name "Hewlett-Packard 7001",
 :gpu {:name "NVIDIA GeForce GT 230M"},
 :zone-1
 {:name "CPU Thermal Zone",
  :desc "Located next to the CPU core on Intel boards",
  :temp {:value 0}},
 :memory
 {:name "Hyundai Electronics PC3-12800",
  :type :memory,
  :used {:value 3684835328},
  :total {:value 8579297280}},
 :type :mb,
 :effects
 [{:id "none", :name "Off", :source nil, :types []}
  {:id "static_color",
   :name "Solid Color",
   :source nil,
   :types [:color]}
  {:id "cpu_load",
   :name "CPU Load",
   :source nil,
   :types [:beg-color :end-color]}
  {:id "cpu_temp",
   :name "CPU Temp",
   :source nil,
   :types [:beg-color :end-color]}
  {:id "gpu_load",
   :name "GPU Load",
   :source nil,
   :types [:beg-color :end-color]}
  {:id "gpu_temp",
   :name "GPU Temp",
   :source nil,
   :types [:beg-color :end-color]}
  {:id "rainbow",
   :name "Rainbow",
   :source nil,
   :types [:speed :smooth]}
  {:id "roll",
   :name "Roll",
   :source nil,
   :types [:beg-color :end-color :speed :smooth]}
  {:id "random", :name "Random", :source nil, :types [:speed]}
  {:id "strobing",
   :name "Strobing",
   :source nil,
   :types [:color :speed]}
  {:id "police", :name "Police", :source nil, :types []}
  {:id "breath", :name "Breath", :source nil, :types [:color :speed]}
  {:id "flame", :name "Flame", :source nil, :types []}
  {:id "melt", :name "Melt", :source nil, :types [:speed]}],
 :lights
 [{:smooth 0,
   :color [0 1 0.5],
   :speed 50,
   :scale nil,
   :name "Fan 1",
   :type :fan,
   :beg-color [240 1 0.5],
   :drift nil,
   :id "Fan 0",
   :random 0,
   :effect "none",
   :end-color [0 1 0.5]}
  {:smooth 0,
   :color [0 1 0.5],
   :speed 50,
   :scale nil,
   :name "Fan 2",
   :type :fan,
   :beg-color [240 1 0.5],
   :drift nil,
   :id "Fan 1",
   :random 0,
   :effect "none",
   :end-color [0 1 0.5]}
  {:smooth 0,
   :color [0 1 0.5],
   :speed 50,
   :scale nil,
   :name "Fan 3",
   :type :fan,
   :beg-color [240 1 0.5],
   :drift nil,
   :id "Fan 2",
   :random 0,
   :effect "none",
   :end-color [0 1 0.5]}
  {:smooth 0,
   :color [0 1 0.5],
   :speed 50,
   :scale nil,
   :name "Fan 4",
   :type :fan,
   :beg-color [240 1 0.5],
   :drift nil,
   :id "Fan 3",
   :random 0,
   :effect "none",
   :end-color [0 1 0.5]}
  {:smooth 0,
   :color [0 1 0.5],
   :speed 50,
   :scale nil,
   :name "Fan 5",
   :type :fan,
   :beg-color [240 1 0.5],
   :drift nil,
   :id "Fan 4",
   :random 0,
   :effect "none",
   :end-color [0 1 0.5]}
  {:smooth 0,
   :color [0 1 0.5],
   :speed 50,
   :scale nil,
   :name "Fan 6",
   :type :fan,
   :beg-color [240 1 0.5],
   :drift nil,
   :id "Fan 5",
   :random 0,
   :effect "none",
   :end-color [0 1 0.5]}
  {:smooth 0,
   :color [0 1 0.5],
   :speed 50,
   :scale nil,
   :name "Strip 1",
   :type :strip,
   :beg-color [240 1 0.5],
   :drift nil,
   :id "Strip 0",
   :random 0,
   :effect "none",
   :end-color [0 1 0.5]}
  {:smooth 0,
   :color [nil 1 nil],
   :speed 50,
   :scale nil,
   :name "UV Strip 1",
   :type :uv-strip,
   :beg-color [nil 1 nil],
   :drift nil,
   :id "UV Strip 0",
   :random 0,
   :effect "none",
   :end-color [nil 1 nil]}],
 :hard-drives
 [{:id "hdds 0",
   :name "ST9500420AS",
   :type :hard-drive,
   :temp {:value 88},
   :load {:value 48.87},
   :volumes
   [{:load {:value 48, :sensor "C:"},
     :temp {:value 44, :sensor "Assembly"},
     :name "C:"}]}],
 :zone-2
 {:name "North Bridge Thermal Zone",
  :desc "Located next to the CPU socket on Intel boards",
  :temp {:value 0}},
 :cpus
 [{:id "cpus 0",
   :name "Intel Core i7 720QM",
   :type :cpu,
   :temp {:value 0},
   :load {:value 5, :sensor "UC"},
   :cores
   [{:freq {:value 930, :sensor "Core #0"},
     :temp {:value 83, :sensor "Core #0"},
     :name "Core #0",
     :threads nil}
    {:freq {:value 930, :sensor "Core #1"},
     :temp {:value 84, :sensor "Core #1"},
     :name "Core #1",
     :threads nil}
    {:freq {:value 930, :sensor "Core #2"},
     :temp {:value 83, :sensor "Core #2"},
     :name "Core #2",
     :threads nil}
    {:freq {:value 930, :sensor "Core #3"},
     :temp {:value 83, :sensor "Core #3"},
     :name "Core #3",
     :threads nil}]}]})
