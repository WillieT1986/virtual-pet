package virtual.pet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		VirtualPet myPet = new VirtualPet(15, 15, 15, 15, 15);

		System.out.println("Hold the Dog");
		System.out.println("Hunger:    " + myPet.getHunger());
		System.out.println("Water:     " + myPet.getWater());
		System.out.println("Waste:     " + myPet.getWaste());
		System.out.println("Bored:     " + myPet.getBored());
		System.out.println("Tiredness: " + myPet.getTired());

		String optionEntered = "";

		System.out.println("\nWhich option would you like to choose?");
		System.out.println("1. Feed Hold");
		System.out.println("2. Water Hold");
		System.out.println("3. Take Hold to your mean Neighbors yard for Potty");
		System.out.println("4. Play with Hold");
		System.out.println("5. Put Hold to Sleep");
		System.out.println("6. Do nothing...");
		System.out.println("7. Terminate Pet...");
		optionEntered = input.nextLine();

		while (!optionEntered.equals("7")) {
			if (optionEntered.equals("1")) {
				int hunger = 1;
				int water;
				int waste;
				int tired;
				myPet.feedPet(hunger);
				myPet.sipWater(water);
				myPet.hasWaste(waste);
				myPet.sleepy(tired);
				System.out.println("Fed Hold " + hunger + " biscuit.");
				System.out.println("Feeding Hold a bisucuit took away " + water + " water while adding " + waste
						+ " to waste and making Hold tired by " + tired);

			} else if (optionEntered.equals("2")) {
				int water = 1;
				int waste;
				myPet.sipWater(water);
				System.out.println("Gave Hold " + water + " water and now Hold feels rejuvinated.");
				System.out.println("Added " + waste + " to waste.");

			} else if (optionEntered.equals("3")) {
				int waste = 1;
				myPet.hasWaste(waste);
				System.out.println("The neighbor has been mean as of late.");
				System.out.println("Took Hold to potty in the neighbors yard. -" + waste);
				System.out.println("Hold is now a little sleepy. +" + tired);
			} else if (optionEntered.equals("4")) {
				int bored = 1;
				myPet.isBored(bored);
				System.out.println("Decided to play with Hold. Hold barks and chasses tail.");
				System.out.println("Playing with Hold added " + bored);
				System.out.println("Hold is now a little sleepy. +" + tired);
			} else if (optionEntered.equals("5")) {
				int tired = 1;
				myPet.sleepy(tired);
				System.out.println("Hold is very sleep and curls up in his bed...");
				System.out.println("Hold is now sleeping and it took -" + tired);
			} else if (optionEntered.equals("6")) {
				String doNothing;
			} else {
				optionEntered.equals("7");
				System.out.println("Are you sure you wish to Terminate Hold and quit program?");
				String decision = input.nextLine();
				if (decision.equals("Yes")) {
					System.out.println("Hold sadly went to your friend with the look of betrayal.");
					System.out.println("Had meat pies that night...");
				} else {
					decision.equals("No");
					System.out.println("Thanks for not terminating your friend.");
					System.out.println("Dinner shall come another day...");
				}
			}
		}

		input.close();
	}

}
