------------------------------------------------------------------------
Ceci est le fichier LISEZMOI (README) du projet.  Décrivez-y votre projet.
Dites au lecteur (qui ne sait rien du projet) ce qu'il a besoin de savoir.
Au minimum, remplissez cette description :
------------------------------------------------------------------------

TITRE DU PROJET : World Of Ants
BUT POURSUIVI : Design a game 
VERSION ou DATE : V1
COMMENT INVOQUER CE PROJET : 
AUTEURS : Group 8 (Angélique Gombert, Marion Guernote, Alix Nagot, Thibault Crouzet, Fanny Barbe, Ambre Dumontet and Dylan Mielot)
INSTRUCTIONS A L'USAGER : 


Rules of the game :
Minimum number of package to deliver/steal in the given time. 

The principle is as follows : the ants live in an underground world. We can be a delivery or the thief. She are  a "postman" and has to bring parcels into houses (the human world), which are in the higher world. She therefore sails from house to house through the underground world. She has to deliver a number of packages in a limited time. 
Another ants, known as a "thief", takes the parcels that have been left in the houses. 


Possible game-over :
Ant Thief : Losing all life points (hit by the delivery ant or crushed by a human)
Ant Delivery : losing all of her honor points (lose honor when a package is stolen) or meet the thieving ants. 
 
———————————————————————————————————————

We imagine a story:

The world :
It is an ants world, in two levels : with the ground world  and the underground world. 

The plan (mapping) : 
It’s map with two levels. First the underground gallery network. Where the ants can go anywhere. And the surface level where the humans live in houses. The ants can only go in houses at this level. 

Classes
main 
map 
game 
timer 
player (little ant thief- big ant delivery) => Movement + Action
 
Items (bag for the stock)
Package
 
The presence of others ants/objects in a specific place
Verification
Drop/Steal an item

Inventory (aggregation of item object inside a player object - we can take or drop items)

    -NPC (non player character / human)
have item and house
we can interacted with them
can have specific actions/produce some event
(ex: give cookies, hit the player)

Idea retained: Delivery/Thief Ant 

The ant can move through the sewers / galleries / underground ..

Delivery:
She will be able to move and to deliver package in houses.
Goals : Drop the highest number of packages in the limited time (timer).
She can kill the Thief ant.
she can commit suicide if she does not deliver the minimum number of package in time (loose honor).

Thief:
She will be able to move (faster than the delivery ant) and steal a minimum number of packages in houses in time.(beware the traps, dogs or the NPC).
Goals : Steal the highest number of packages in the limited time, and be careful not to cross the delivery ant.
She can die by taking a shot by delivery ant.
     






