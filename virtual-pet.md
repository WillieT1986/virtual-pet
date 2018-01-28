virtual-pet

Overview:
For my second weekend project,
I am creating a virtual pet similar to the one seen in the late 1990's. The virtual pet is named Hold and Hold will be able to inform its owner when it needs various tasks to be completed. For example, when Hold is either hungry or thirsty. It is up to the Owner of Hold to keep their virtual pet happy. 


How The Game Will Look Upon Start:

Hold the Dog

Hunger:    50
Water:     50
Waste:     50
Bored:     50
Tiredness: 50

Which option would you like to choose?
1. Feed Hold
2. Water Hold
3. Take Hold to your mean Neighbors yard for Potty
4. Play with Hold
5. Put Hold to Sleep
6. Do nothing...
7. Terminate Pet...


Details:
When the user first runs the game the user will be prompted with...




Classes:

	Required:      
[X] VirtualPet
[X] VirtualPetApp

	Stretch:
[X] VirtualPetTest (Created to practice testing)



Details:

	Attributes
[X] Hunger
[X] Water
[X] Waste
[X] Bored
[X] Tired

	Methods
[X] feedPet 
	  Hunger + 2
	  Water  - 2
	  Waste  + 2
	  Tired  - 1

[X] sipWater
	  Water  + 1
	  Waste  + 1

[X] hasWaste
	  Waste  - 3
	  Tired  + 1

[X] isBored
	  Bored  - 1
	  Tired  + 1

[X] sleepy
	  Tired  - 1


