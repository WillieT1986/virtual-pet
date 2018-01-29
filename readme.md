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
When the user first runs the game the user will be prompted with "Hold the Dog" along with Hold's five stats hunger, water, waste, bored and tiredness. The owner will need to input each option in order to take care of Hold in order for Hold to live a nice life of numbers. However, if you are tired of taking care of Hold then you can always choose to terminate Hold by pressing option "7" to which then the owner will giver Hold to their friend and later that night enjoy some meat pies. 

Hunger example:
User enters in option "1" which will feed hold 2 points but then make Hold thirsty by 1 point thus adding 2 points to waste and making Hold tired by 1 point. 

Terminate example:
User enters in option "7" which will promt the user to enter in "Yes"
or "No" to make sure that the User would like to confirm the termination of Hold or if it was a mistake and to continue taking care of Hold.



How The App Functions:
For the design of this App I decided to go with a While Loop utilizing If, Else If, Else Statments with the tick() built into the While Loop and placed at the very end of the loop.



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
[X] feedPet: 
	  Hunger + 2
	  Water  - 2
	  Waste  + 2
	  Tired  - 1

[X] sipWater:
	  Water  + 1
	  Waste  + 1

[X] hasWaste:
	  Waste  - 3
	  Tired  + 1

[X] isBored:
	  Bored  - 1
	  Tired  + 1

[X] sleepy:
	  Tired  - 1


Code Directly From The Main App:

Example of Option "1":
if (optionEntered.equals("1")) {
	myPet.feedPet();
	System.out.println("Fed Hold " + hunger + " biscuit.");
	System.out.println("Feeding Hold a bisucuit took away " + water + " water while adding " + waste
	+ " to waste and making Hold tired by " + tired);

Eample of Option "7":
else {
	optionEntered.equals("7");
	System.out.println("Are you sure you wish to Terminate Hold and quit program?");
	System.out.println("Enter Yes or No");
	decision = input.nextLine();
		if (decision.equalsIgnoreCase("Yes")) {
		System.out.println("Hold sadly went to your friend with the look of betrayal.");
		System.out.println("Had meat pies that night...");
		} else {
			decision.equalsIgnoreCase("No");
			System.out.println("Thanks for not terminating your friend.");
			System.out.println("Dinner shall come another day...");
				}


