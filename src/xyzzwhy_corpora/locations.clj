(ns xyzzwhy-corpora.locations)

(def locations
  [
   {:text "airplane"
    :type :interior
    :prep "in"
    :follow-up {:option [{:text "There's no one else on board."}
                         {:text "You hear strange noises coming from the restroom."}
                         {:text "Somehow you have a dozen packets of pretzels."}
                         {:text "Someone drank your Fresca while you were napping."}
                         {:text "It's pitch black outside. Can grues fly?"}
                         {:text "The pilot says, 'We've reached our cruising altitude of 30 feet.'"}
                         {:text "The plane has been going straight up for hours now."}]}}
   {:text "all-you-can-eat buffet"
    :type :interior
    :prep "at"
    :follow-up {:option [{:text "It looks abandoned."}
                         {:text "Bullet time means more eggrolls."}
                         {:text "Steam crowds the air."}
                         {:text "It's all gluten-free and vegan. You leave immediately."}
                         {:text "It smells of freedom and gluttony."}
                         {:text "All of the food has been replaced with wax replicas."}
                         {:text "It's in complete disarray and hasn't been tended for some time."}]}}
   {:text "Apple Store"
    :type :exterior
    :prep ["at" "in" "near" "behind" "in front of"]}
   {:text "AT&T Store"
    :type :exterior
    :prep ["at" "in" "near" "behind" "in front of"]}
   {:text "ballpit"
    :type :interior
    :prep ["in" "near"]
    :follow-up {:option [{:text "Oddly, all of the balls here are the same color: orange."}
                         {:text "The ballpit seems unusually deep. You can't feel the bottom."}
                         {:text "It's been filled with Rubik's Cubes."}
                         {:text "It's empty except for one orange ball at the bottom."}
                         {:text "It contains only one ball: orange and 12' across."}
                         {:text "You get the feeling someone is swimming around in there."}]}}
   {:text "bedroom"
    :type :interior
    :article "your"
    :prep "in"
    :follow-up {:option [{:text "It hasn't been cleaned in a long time."}
                         {:text "There's a pleasantly disgusting smell here."}
                         {:text "It's small and lightly furnished. The bed is unmade."}
                         {:text "There is nothing special about it."}
                         {:text "You notice an unusual stain in the carpet."}
                         {:text "There's an unusual stain in the carpet next to a usual stain."}
                         {:text "The ceiling fan is spinning dangerously fast."}
                         {:text "The walls are covered with %0 posters."
                          :sub {0 {:class :person}}}
                         {:text "There's a pile of clothes nearby."}]}}
   {:text "breezy cave"
    :type :exterior
    :prep ["in" "near" "in front of"]
    :follow-up {:option [{:text "There's a constant breeze rising up from the depths."}
                         {:text "Wide and low, the cave gently slopes %0-%1 here."
                          :sub {0 {:class :direction}
                                1 {:class :direction}}}
                         {:text "It smells of warm packing peanuts."}
                         {:text "It's really breezy. Gale-force breezy."}
                         {:text "It's seems over-oxygenated. You get light-headed."}
                         {:text "The cave seems to be breathing rapidly."}]}}
   {:text "Burning Man"
    :type :exterior
    :prep "at"
    :follow-up {:option [{:text "Oddly, no one appears to be here."}
                         {:text "A tumbleweed made out of human hair stumbles by."}
                         {:text "A dust storm is approaching."}
                         {:text "It looks like it might rain soon."}
                         {:text "Snow is gently falling."}
                         {:text "%0 is here, looking %1."
                          :sub {0 {:class :person}
                                 1 {:class :adjective}}}
                         {:text "Clearly the drugs have begun to take hold."}]}}
   {:text "coffin"
    :type :interior
    :prep ["in" "near" "in front of"]
    :follow-up {:option [{:text "It is well upholstered."}
                         {:text "It smells of cotton candy in here for some reason."}
                         {:text "It smells of Aquanet in here. Makes sense."}
                         {:text "It's pitch black. It probably doesn't matter if ther's a grue here."}]}}
   {:text "dark area"
    :type :interior
    :prep "in"
    :follow-up {:option [{:text "It is pitch black here. You're likely to be eaten by %0."
                          :sub {0 {:class :actor}}}
                         {:text "It's really dark here. Like... REALLY dark."}
                         {:text "It just got slightly darker somehow."}
                         {:text "It's so dark you can taste it. Tastes like dark."}
                         {:text "It's dark here. DARK AS YOUR SOUL."}]}}
   {:text "dead-end"
     :type :interior
     :prep ["at" "in front of"]
     :follow-up {:option [{:text "You start to moonwalk away."}
                          {:text "Someone has painted a giant sad face here."}]}}
   {:text "dildo bonfire"
    :type :exterior
    :prep ["at" "near" "behind" "in front of"]
    :follow-up {:option [{:text "You look closely but don't recognize any of them."}
                         {:text "The plastic hisses and creaks in the blaze."}
                         {:text "The smoke smells of vanilla."}
                         {:text "The air is dense with the echoes of unreached orgasms."}]}}
   {:text "ditch"
    :type :exterior
    :prep "in"
    :follow-up {:option [{:text "The dusty stench of aged sewage gives you a hug."}
                         {:text "It is completely blocked here by a giant boulder."}
                         {:text "A trickle of clear water runs down the middle of it."}]}}
   {:text "dump"
    :type :exterior
    :article "the"
    :prep ["at" "near" "behind" "in front of"]
    :follow-up {:option [{:text "In the distance, you see a hazy castle."}
                         {:text "The hill of trash shifts dangerously beneath your feet."}]}}
   {:text "dump truck"
    :type :exterior
    :prep ["in" "near" "behind" "in front of" "underneath"]
    :follow-up {:option [{:text "It's covered with a patina of black filth."}
                         {:text "Fresh off the line, it gleams bright red."}
                         {:text "The engine rumbles roughly to itself. The doors are locked."}]}}
   {:text "forest"
    :type :exterior
    :prep ["in" "near" "in front of"]
    :follow-up {:option [{:text "It is a dense, dark, and tangled choke of gnarled trees, thorny underbrush, and spiky thickets."}
                         {:text "Shot through with shafts of light, the forest before you looks serene."}
                         {:text "The trees, mostly oak and spruce, sway gently in the occasional breeze."}
                         {:text "It's currently on fire."}
                         {:text "The trees are all inflated plastic."}
                         {:text "The trees ignore your incessant crying."}
                         {:text "Birds are chirping and rodents scamper through the underbrush."}]}}
   {:text "full-contact Bible study group"
    :type :interior
    :prep ["near" "behind" "in front of" "in"]
    :follow-up {:option [{:text "No one is here."}
                         {:text "They stare at you and begin to crowl."}
                         {:text "They're all covered with cuts and bruises."}
                         {:text "They're currently scrumming over a Bible."}]}}
   {:text "graveyard"
    :type :exterior
    :prep ["at" "in" "near" "behind" "in front of"]
    :follow-up {:option [{:text "There is a freshly laid grave nearby."}
                         {:text "There is an open grave nearby. It's empty."}
                         {:text "There is an open grave nearby. There's a phone book in it."}
                         {:text "There is an open grave nearby. It's full of %0."
                          :sub {0 {:class :drink :config #{:no-article}}}}
                         {:text "There is an open grave nearby. It's full of molten peanut butter."}
                         {:text "There are fresh footprints here."}
                         {:text "A lazy mist drifts amongst the tombstones."}
                         {:text "The tombstones have been replaced by durable plastic bricks."}
                         {:text "The Christmas lights sure make it look festive."}
                         {:text "A disco ball spins sadly from a gnarled tree."}]}}
   {:text "grotto"
    :type :exterior
    :prep ["in" "near" "behind" "in front of"]
    :follow-up {:option [{:text "The ceiling is sparkling with reflected light."}
                         {:text "The water is darkened with greenish-gray algae."}
                         {:text "The pool of water seems unusually deep. A lean, black fish swims in a circle."}]}}
   {:text "haunted house"
    :type :exterior
    :prep ["at" "in" "near" "behind" "in front of"]
    :follow-up {:option [{:text "The house shrugs under its own entropy."}
                         {:text "An orange light wanders from window to window."}
                         {:text "A sign here reads: 'As seen on TV."}
                         {:text "Endless amounts of blood pour from the windows."}
                         {:text "Looks inviting except for the corpses littering the lawn."}]}}
   {:text "hot tub"
    :type :interior
    :prep ["in" "near"]
    :follow-up {:option [{:text "The water roils and steams like water roils and steams."}
                         {:text "It's frozen solid."}
                         {:text "A basketball dances on the bubbles."}
                         {:text "You see a staircase beneath the water."}
                         {:text "Is it water or is it hydrocarbons?"}
                         {:text "It smells delicious because someone filled it with chicken soup."}]}}
   {:text "hugbox"
    :type :interior
    :prep "in"
    :follow-up {:option [{:text "You feel at home again."}
                         {:text "It's very warm in here. Perhaps too warm."}
                         {:text "It smells of stale sweat and lies, lies, lies..."}]}}
   {:text "ice skating rink"
    :type :exterior
    :prep ["at" "in front of" "on"]
    :follow-up {:option [{:text "It's currently on fire."}
                         {:text "Unfortunately, it's made of dry ice."}
                         {:text "A solid-gold curling stone is nearby."}
                         {:text "There are three hungry-looking zambonies here."}]}}
   {:text "Luby's"
    :type :exterior
    :prep ["at" "in" "near" "behind" "in front of"]}
   {:text "maze of twisty little passages, all alike"
    :type :interior
    :prep "in"}
   {:text "McDonald's"
    :type :exterior
    :prep ["at" "in" "near" "behind" "in front of"]}
   {:text "meeting"
    :type :interior
    :prep "in"
    :follow-up {:option [{:text "The room is crowded by tripods holding colorful charts."}
                         {:text "The projector is on, showing random photos of cats at play."}
                         {:text "The table is covered with a chalk outline."}
                         {:text "The chairs are all occupied by cobweb-encrusted skeletons."}
                         {:text "The room is almost full of balloons."}]}}
   {:text "movie set"
    :type :exterior
    :prep "on"
    :follow-up {:option [{:text "The crafts table is covered with another, smaller crafts table."}
                         {:text "A nude man strolls by."}
                         {:text "A hundred tiny dogs are here, looking menacing."}]}}
   {:text "New York Public Library"
    :type :exterior
    :article "the"
    :prep ["at" "near" "behind" "in front of"]}
   {:text "park restroom stall"
    :type :interior
    :prep "in"
    :follow-up {:option [{:text "The door has been torn off its hinges."}
                         {:text "The walls are covered with violent scratches."}
                         {:text "The toilet is made of solid gold."}
                         {:text "A garden gnome greets you from the bowl."}
                         {:text "The toilet is missing."}
                         {:text "There's a basketball in the bowl."}
                         {:text "Suddenly the lights go out."}
                         {:text "The lingering scents of lemon and Lysol haunt the air."}
                         {:text "Someone has scratched your name and number on the wall."}]}}
   {:text "particle board storage facility"
    :type :interior
    :prep ["at" "near" "in front of" "behind" "inside"]}
   {:text "pile of diapers"
    :type :exterior
    :prep ["in" "near" "behind" "in front of" "underneath"]
    :follow-up {:option [{:text "Some of these look awfully familiar."}]}}
   {:text "playground"
    :type :exterior
    :prep ["in" "near" "behind" "in front of"]
    :follow-up {:option [{:text "The equipment looks like it's never been used."}
                         {:text "Most of the equipment is missing or broken."}
                         {:text "You hear the sound of children laughing but no one else is here."}]}}
   {:text "quicksand"
    :type :exterior
    :article "some"
    :prep ["in" "near"]
    :follow-up {:option [{:text "Briefly, you see a fin rise up and cruise back and forth."}
                         {:text "The surface quicksand gently sways, beckoning you..."}
                         {:text "Oddly, it smells like freshly cooked oatmeal."}]}}
   {:text "ravine"
    :type :exterior
    :prep ["in"]
    :follow-up {:option [{:text "It stretches out in front of you, meandering as if drunk."}
                         {:text "A giant marshmallow avalanche blocks the way ahead."}
                         {:text "A small trickle of spaghetti sauce runs down the middle."}]}}
   {:text "riverbed"
    :type :exterior
    :prep ["in" "near"]
    :follow-up {:option [{:text "It's dry and littered with rocks and branches."}
                         {:text "The water steadfastedly refuses to flow. It just sits there."}
                         {:text "Nearby two bears are standing on the water, defiantly."}
                         {:text "The river immediately parts and just keeps on parting."}
                         {:text "It's mostly dry, the flow of the water blocked by a beaver dams upstream."}]}}
   {:text "sauna"
    :type :interior
    :prep "in"
    :follow-up {:option [{:text "The wood paneling sweats sweetly in the oppressive heat."}
                         {:text "Great thunderheads of steam rise up from the rock basin, making it hard to see."}
                         {:text "The room is cold and dark. No one has been here in years."}
                         {:text "The floor is covered with cute little mushrooms."}]}}
   {:text "Shrim Healing Center"
    :type :exterior
    :prep ["in" "at" "in front of" "behind"]
    :follow-up {:option [{:text "There are TVs in the window, all turned off."}
                         {:text "Someone has spray-painted 'I crave brown baths' here."}
                         {:text "Inside you hear the sound of repulsed joy."}
                         {:text "The door has been boarded up."}
                         {:text "%0 is patiently waiting in line by %1."
                          :sub {0 {:class :person}
                                1 {:class :gender
                                   :case :compound}}}
                         {:text "The building looks like it has been condemned."}]}}
   {:text "Starbucks"
    :type :exterior
    :prep ["in" "near" "behind" "in front of"]
    :follow-up {:option [{:text "It is packed tightly with hipsters."}
                         {:text "There is a surprising lack of hipsters here."}
                         {:text "It reeks of slightly burnt coffee here."}]}}

   {:text "swimming pool"
    :type :exterior
    :prep ["in" "at" "near"]
    :follow-up {:option [{:text "The surface of the pool is almost entirely still. You are afraid to disturb it."}
                         {:text "The water has turned slightly murky; it does not look inviting."}
                         {:text "The surface of the pool is littered with leaves."}
                         {:text "The pool is empty."}
                         {:text "The pool is empty. A broken skateboard is nearby."}
                         {:text "A dead bird floats by."}
                         {:text "An abandoned plastic float with a dinosaur's head floats lonely nearby."}]}}
   {:text "Taco Bell"
    :type :exterior
    :prep ["at" "in" "near" "behind" "in front of"]}
   {:text "tire fire"
    :type :exterior
    :prep ["at" "near" "behind" "in front of"]
    :follow-up {:option [{:text "It is warm and welcoming."}
                         {:text "Someone had been roasting marshmallows here."}
                         {:text "The air here is black with despair and entropy."}
                         {:text "The sky is darkened by the hellish smoke."}]}}
   {:text "trunk of a car"
    :type :interior
    :article "the"
    :prep "in"
    :follow-up {:option [{:text "It is well upholstered."}
                         {:text "A tire iron is digging into your back a little bit."}
                         {:text "There's a half-eaten bag of Bugles here."}
                         {:text "With all the trash in here, there's barely any room for you."}
                         {:text "It's pitch black. No room for a grue, luckily."}]}}
   {:text "White Castle"
    :type :exterior
    :prep ["at" "in" "near" "behind" "in front of"]
    :follow-up {:option [{:text "It's white and vaguely castle-shaped."}
                         {:text "It smells squarely delicious."}]}}
   ])
