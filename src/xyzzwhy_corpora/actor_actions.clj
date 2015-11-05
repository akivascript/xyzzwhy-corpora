(ns xyzzwhy-corpora.actor-actions)

(def actor-actions
  [
   {:text "%0 playing the organ."
    :sub {0 {:class :adverb}}}
   {:text "being chased around by a %0."
    :sub {0 {:class :animal}}}
   {:text "being chased by %0."
    :sub {0 {:class :person}}}
   {:text "being chased by %0 which is attached to them by a string."
    :sub {0 {:class :item}}}
   {:text "being chased by a swarm of balloon animals."}
   {:text "being menaced by %0."
    :sub {0 {:class :animal}}}
   {:text "clutching a DVD of %0."
    :sub {0 {:class :movie}}}
   {:text "dancing extremely slowly."}
   {:text "dancing furiously."}
   {:text "dancing in a small circle."}
   {:text "defiantly eating Scrabble tiles, one by one."}
   {:text "doing the Kenosha Kid."}
   {:text "drooling uncontrollably."}
   {:text "examining %0 with great confusion."
    :sub {0 {:class :item}}}
   {:text "having a coughing fit."}
   {:text "having a sneezing fit."}
   {:text "having a Guru Meditation Error."}
   {:text "hiding under a sofa."}
   {:text "hiding under a table."}
   {:text "hiding in the bushes."}
   {:text "looking %0."
    :sub {0 {:class :adjective}}}
   {:text "juggling some balls."}
   {:text "munching on %0."
    :sub {0 {:class :food}}}
   {:text "organizing matches."}
   {:text "pretending to be invisible."}
   {:text "ready to start some shit."}
   {:text "shouting at an imaginary helicopter."}
   {:text "stooping up and down like a rapper in concert."}
   {:text "thinking %0 about %1."
    :sub {0 {:class :adverb}
          1 {:class :actor}}}
   {:text "wearing an eyepatch."}
   {:text "wearing two eyepatches and stumbling around blindly."}
   ])
