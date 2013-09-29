(ns bible-plan.plan
  (:require [bible-plan.plan.mcheyne :as mcheyne]))

(def plans {:mcheyne mcheyne/mcheyne})

(defn order-by-book [plan]
  plan)

(comment
  (in-ns 'bible-plan.plan)
  )
