(ns xyzzwhy-corpora.animals)

(def animals
  [
   {:text "aardvark"}
   {:text "alligator"}
   {:text "alpaca"}
   {:text "antelope"}
   {:text "ape"}
   {:text "armadillo"}
   {:text "baboon"}
   {:text "badger"}
   {:text "bat"}
   {:text "bear"
    :modifier {:prefix {:option ["grizzly" "brown" "teddy"]}}}
   {:text "beaver"}
   {:text "bison"}
   {:text "boar"}
   {:text "buffalo"}
   {:text "bull"}
   {:text "bunny"}
   {:text "buzzard"}
   {:text "camel"}
   {:text "canary"}
   {:text "capybara"}
   {:text ["cat" "kitten"]
    :modifier {:prefix {:option ["tabby" "gray" "black" "butter" "white"]}
               :ambifix {:option ["purring" "meowing" "growling"]}}
    :sound ["purrs" "meows" "growls"]}
   {:text "chameleon"}
   {:text "cheetah"}
   {:text "chicken"}
   {:text "chimpanzee"}
   {:text "chinchilla"}
   {:text "chipmunk"}
   {:text "cougar"}
   {:text "cow"}
   {:text "coyote"}
   {:text "crocodile"}
   {:text ["crow"]
    :modifier {:prefix {:option ["cawing"]}}
    :sound ["caws" "caws at you" "caws forlornly" "caws quietly"]}
   {:text "dingo"}
   {:text ["dog" "puppy"]
    :modifier {:prefix {:option ["black" "white" "brown"]}
               :ambifix {:option ["barking" "panting" "growling"]}}
    :sound ["barks" "pants" "growls"]}
   {:text "dolphin"}
   {:text "donkey"}
   {:text "duck"
    :modifier {:prefix {:option "quacking"}}
    :sound "quacks"}
   {:text "eagle"}
   {:text "elephant"}
   {:text "ewe"}
   {:text "hawk"}
   {:text "ferret"}
   {:text "finch" :sound "chirps"}
   {:text "fox"}
   {:text "gazelle"}
   {:text "gerbil"}
   {:text "gila monster"}
   {:text "giraffe"}
   {:text "gnu"}
   {:text "goat"}
   {:text "gopher"}
   {:text "gorilla"}
   {:text "groundhog"
    :modifier {:prefix {:option ["repeating" "familiar"]}}}
   {:text "guinea pig"}
   {:text "hamster"}
   {:text "hawk"}
   {:text "hedgehog"
    :modifier {:prefix {:option "prickly"}}}
   {:text "hippopotamus"}
   {:text "hog" 
    :modifier {:prefix {:option ["snorting" "oinking"]}
               :sound ["snorts" "oinks"]}}
   {:text "horse"}
   {:text "hyena"}
   {:text "ibex"}
   {:text "iguana"}
   {:text "impala"}
   {:text "jackal"}
   {:text "jaguar"}
   {:text "kangaroo"}
   {:text "koala"}
   {:text "lamb"}
   {:text "lemur"}
   {:text "leopard"}
   {:text "lion"}
   {:text "lizard"}
   {:text "llama"}
   {:text "lynx"}
   {:text "magpie"}
   {:text "marmot"}
   {:text "mink"}
   {:text "mole"}
   {:text "mongoose"}
   {:text "monkey"}
   {:text "moose"}
   {:text "mule"}
   {:text "muskrat"}
   {:text "moose"}
   {:text "mountain goat"}
   {:text "mouse"}
   {:text "mule"}
   {:text "muskrat"}
   {:text "mynah bird"}
   {:text "newt"}
   {:text "ocelot"}
   {:text "opossum"}
   {:text "orangutan"}
   {:text "otter"}
   {:text "ox"}
   {:text "panda"}
   {:text "panther"}
   {:text "parakeet"}
   {:text "parrot"}
   {:text "pig"}
   {:text "pigeon"}
   {:text "platypus"}
   {:text "polar bear"}
   {:text "porcupine"}
   {:text "porpoise"}
   {:text "prairie dog"}
   {:text "rabbit"}
   {:text "raccoon"}
   {:text "reindeer"}
   {:text "rhinoceros"}
   {:text "salamander"}
   {:text "seal"}
   {:text "serpent"}
   {:text "sheep"}
   {:text "shrew"}
   {:text "skunk"}
   {:text "sloth"}
   {:text "snake"}
   {:text "squirrel"}
   {:text "tapir"}
   {:text "tiger"}
   {:text "toad"}
   {:text "turtle"}
   {:text "walrus"}
   {:text "warthog"}
   {:text "weasel"}
   {:text "wildcat"}
   {:text "wolf"}
   {:text "wolverine"}
   {:text "wombat"}
   {:text "woodchuck"}
   {:text "yak"}
   {:text "zebra"}
   ])
