package virtual.pet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Hold the Dog");
		System.out.println("Insert Hunger");
		System.out.println("Insert Thirst");
		System.out.println("Insert Bordem");
		System.out.println("Insert Tireness \n");

		System.out.println("Which option would you like to choose?");
		System.out.println("1. Feed Hold");
		System.out.println("2. Water Hold");
		System.out.println("3. Play with Hold");
		System.out.println("4. Put Hold to sleep");
		System.out.println("5 Do nothing...");
		String optionEntered = input.nextLine();

		input.close();
	}

}
