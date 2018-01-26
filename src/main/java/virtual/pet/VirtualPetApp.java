package virtual.pet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		VirtualPet myPet = new VirtualPet(10, 10, 10, 10, 10);

		System.out.println("Hold the Dog");
		System.out.println("Hunger:    " + myPet.getHunger());
		System.out.println("Water:     " + myPet.getWater());
		System.out.println("Waste:     " + myPet.getWaste());
		System.out.println("Tiredness: " + myPet.getTired());
		System.out.println("Bored      " + myPet.getBored());

		String optionEntered = "";

		System.out.println("\nWhich option would you like to choose?");
		System.out.println("1. Feed Hold");
		System.out.println("2. Water Hold");
		System.out.println("3. Play with Hold");
		System.out.println("4. Put Hold to sleep");
		System.out.println("5. Do nothing...");
		optionEntered = input.nextLine();

		if (optionEntered.equals("1")) {
			int hunger = 1;
			myPet.feedPet(hunger);
			System.out.println("Fed Hold " + hunger + " biscuit.");
			System.out.println("Feeding Hold a bisucuit took away 1 ");
		}
		// if

		input.close();
	}

}
