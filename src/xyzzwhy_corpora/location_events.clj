(ns xyzzwhy-corpora.location-events)

(def location-events
  [
   {:text "%0 prevents you from going %1 to %2."
    :sub {0 {:class :obstacle}
          1 {:class :direction}
          2 {:class :location :config #{:no-prep}}}}
   {:text "A double bounce on a trampoline lands you %0."
    :sub {0 {:class :location}}}
   {:text "After %0 at your %1, you are relocated by FEMA to %2."
    :sub {0 {:class :disaster}
          1 {:class :location :config #{:no-prep :no-article}}
          2 {:class :location :config #{:no-prep}}}}
   {:text "After being shot out of a cannon, you land %0."
    :sub {0 {:class :location}}}
   {:text "After pushing your way through a dense crowd, you arrive %0."
    :sub {0 {:class :location}}}
   {:text "After scrambling through some dense underbrush, you find yourself %0."
    :sub {0 {:class :location}}}
   {:text "After the shoot-out, you make your escape to %0."
    :sub {0 {:class :location :config #{:no-prep}}}}
   {:text "After walking for a long time, you find yourself %0."
    :sub {0 {:class :location}}}
   {:text "A tornado deposits you %0."
    :sub {0 {:class :location}}}
   {:text "The bridge game turned violent so you went to %0."
    :sub {0 {:class :location :config #{:no-prep}}}}
   {:text "The drugs are wearing off. You are %0."
    :sub {0 {:class :location}}}
   {:text "Google Maps leads you to %0."
    :sub {0 {:class :location :config #{:no-prep}}}}
   {:text "Hands on your hips, you survey %0 %1."
    :sub {0 {:class :location :config #{:no-prep}}
          1 {:class :adverb}}}
   {:text "No matter how hard you try, you still end up %0."
    :sub {0 {:class :location}}}
   {:text "Right on cue, you pop up out of the jack-in-the-box. You're %0."
    :sub {0 {:class :location}}}
   {:text "The drugs are starting to take hold. Casually you saunter over to %0."
    :sub {0 {:class :location :config #{:no-prep}}}}
   {:text "The elevator doors open to reveal %0."
    :sub {0 {:class :location :config #{:no-prep}}}}
   {:text "The fog clears and you find yourself %0."
    :sub {0 {:class :location}}}
   {:text "The merry-go-round spins faster and faster until you're flung off and land %0."
    :sub {0 {:class :location}}}
   {:text "The metro bus unceremoniously dumps you %0."
    :sub {0 {:class :location}}}
   {:text "The spell effects are wearing off. You are %0."
    :sub {0 {:class :location}}}
   {:text "The taxi driver randomly drops you off %0."
    :sub {0 {:class :location}}}
   {:text "The trapdoor drops open beneath you and you land %0."
    :sub {0 {:class :location}}}
   {:text "Using a vine to swing across the pit, you land %0."
    :sub {0 {:class :location}}}
   {:text "You are %0."
    :sub {0 {:class :location}}}
   {:text "You are magically teleported to %0!"
    :sub {0 {:class :location :config #{:no-prep}}}}
   {:text "You are serving jury duty."
    :follow-up {:optional? false
                :option [{:text "The prosecuting attorney insists on speaking through a broken bullhorn."}
                         {:text "They hand out Chicken McNuggets but they're stone cold."}
                         {:text "The judge is dressed like Dr. Frankenfurter."}
                         {:text "You're unsure why they insist the jury sit in a vat of carbonated %0."
                          :sub {0 {:class :drink :config #{:no-article}}}}]}}
   {:text "You are standing %0 of %1."
    :sub {0 {:class :direction}
          1 {:class :location :config #{:no-prep}}}}
   {:text "You arrive %0."
    :sub {0 {:class :location}}}
   {:text "You arrive for your first day at college only to find your roommate is %0."
    :sub {0 {:class :actor}}}
   {:text "You blow into the cartridge too hard and are teleported to %0."
    :sub {0 {:class :location :config #{:no-prep}}}}
   {:text "You climb down a tree and find yourself %0."
    :sub {0 {:class :location}}}
   {:text "You climb out of the treasure chest. You are now %0."
    :sub {0 {:class :location}}}
   {:text "You climb up a flight of stairs. You are now %0."
    :sub {0 {:class :location}}}
   {:text "You come across %0."
    :sub {0 {:class :location :config #{:no-prep}}}}
   {:text "You come to %0."
    :sub {0 {:class :location}}}
   {:text "You cripwalk %0 to %1."
    :sub {0 {:class :direction}
          1 {:class :location}}}
   {:text "You emerge %0."
    :sub {0 {:class :location}}}
   {:text "You fall down a flight of stairs and into %0."
    :sub {0 {:class :location :config #{:no-prep}}}}
   {:text "You fall through the ceiling and land %0."
    :sub {0 {:class :location}}}
   {:text "You find yourself %0."
    :sub {0 {:class :location}}}
   {:text "You find your way blindly and end up %0."
    :sub {0 {:class :location}}}
   {:text "You flip the Game Select selector and find yourself %0."
    :sub {0 {:class :location}}}
   {:text "You follow %0 to %1."
    :sub {0 {:class :actor}
          1 {:class :location :config #{:no-prep}}}}
   {:text "You follow a sloping path %0. You find yourself %1."
    :sub {0 {:class :direction}
          1 {:class :location}}}
   {:text "You follow a treasure map to %0."
    :sub {0 {:class :location :config #{:no-prep}}}}
   {:text "You follow a winding path %0 only to find yourself %1."
    :sub {0 {:class :direction}
          1 {:class :location}}}
   {:text "You get tangled up in a revolving door. You stumble out into %0."
    :sub {0 {:class :location :config #{:no-prep}}}}
   {:text "You go %0 and find yourself at %1."
    :sub {0 {:class :direction}
          1 {:class :location :config #{:no-prep}}}}
   {:text "You have entered %0."
    :sub {0 {:class :location
             :config #}{:no-prep}}}
   {:text "You head %0 and arrive at %1."
    :sub {0 {:class :direction}
          1 {:class :location :config #{:no-prep}}}}
   {:text "You jump out of a moving car, roll down a hill, and find yourself %0."
    :sub {0 {:class :location}}}
   {:text "You open the secret door only to see %0."
    :sub {0 {:class :location :config #{:no-prep}}}}
   {:text "You ride %0 to %1."
    :sub {0 {:class :animal}
          1 {:class :location :config #{:no-prep}}}}
   {:text "You run screaming into %0."
    :sub {0 {:class :location :config #{:no-prep}}}}
   {:text "You're %0."
    :sub {0 {:class :location}}}
   {:text "Your parachute gently plops you %0."
    :sub {0 {:class :location}}}
   {:text "You shuffle down a flight of stairs and enter %0."
    :sub {0 {:class :location :config #{:no-prep}}}}
   {:text "You slide down a fireman's pole and land %0."
    :sub {0 {:class :location}}}
   {:text "You squeeze out of the sewage outflow and tumble into %0."
    :sub {0 {:class :location :config #{:no-prep}}}}
   {:text "You start doing the worm until you find yourself %0."
    :sub {0 {:class :location}}}
   {:text "You step through a magic mirror and end up %0."
    :sub {0 {:class :location}}}
   {:text "You strut %0 and end up %1."
    :sub {0 {:class :direction}
          1 {:class :location}}}
   {:text "You stumble into %0."
    :sub {0 {:class :location :config #{:no-prep}}}}
   {:text "You tunnel through the soil and pop up %0."
    :sub {0 {:class :location}}}
   {:text "You try to go %0 but your way is blocked by %1."
    :sub {0 {:class :direction}
          1 {:class :obstacle}}}
   {:text "You wake up %0."
    :sub {0 {:class :location}}}
   {:text "You wake up in front of %0's house. You have no clue how you got there."
    :sub {0 {:class :person}}}
   {:text "You wake up from an odd dream. You are %0."
    :sub {0 {:class :location}}}
   {:text "You walk %0 and arrive at %1."
    :sub {0 {:class :direction}
          1 {:class :location :config #{:no-prep}}}}
   ])












