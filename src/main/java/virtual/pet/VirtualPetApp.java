package virtual.pet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		VirtualPet myPet = new VirtualPet(50, 50, 50, 50, 50);

		String decision = "";
		while (!decision.equalsIgnoreCase("Yes")) {

			System.out.println("\nHold the Dog");
			System.out.println("\nHunger:    " + myPet.getHunger());
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

			int hunger = 1;
			int water = 1;
			int waste = 1;
			int bored = 1;
			int tired = 1;

			if (optionEntered.equals("1")) {
				myPet.feedPet();
				System.out.println("Fed Hold " + hunger + " biscuit.");
				System.out.println("Feeding Hold a bisucuit took away " + water + " water while adding " + waste
						+ " to waste and making Hold tired by " + tired);

			} else if (optionEntered.equals("2")) {
				myPet.sipWater();
				System.out.println("Gave Hold " + water + " water and now Hold feels rejuvinated.");
				System.out.println("Added " + waste + " to waste.");

			} else if (optionEntered.equals("3")) {
				myPet.hasWaste();
				System.out.println("The neighbor has been mean as of late.");
				System.out.println("Took Hold to potty in the neighbors yard. -" + waste + " to waste.");
				System.out.println("Hold is now a little sleepy. +" + tired);

			} else if (optionEntered.equals("4")) {
				myPet.isBored();
				System.out.println("Decided to play with Hold. Hold barks and chases tail.");
				System.out.println("Playing with Hold added " + bored);
				System.out.println("Hold is now a little sleepy. +" + tired);

			} else if (optionEntered.equals("5")) {
				myPet.sleepy();
				System.out.println("Hold is very sleepy and curls up in his bed...");
				System.out.println("Hold is now sleeping and it took -" + tired);

			} else if (optionEntered.equals("6")) {
				System.out.println("By doing nothing. Hold is now confused.");

			} else {
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
			}
			myPet.tick();
		} // end of while

		input.close();
	}

}