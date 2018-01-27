package virtual.pet;

public class VirtualPet {
	private int hunger;
	private int water;
	private int waste;
	private int bored;
	private int tired;

	// Constructor
	public VirtualPet(int hunger, int water, int waste, int bored, int tired) {
		this.hunger = hunger;
		this.water = water;
		this.waste = waste;
		this.bored = bored;
		this.tired = tired;
	}

	// Getter
	public int getHunger() {
		return hunger;
	}

	public int getWater() {
		return water;
	}

	public int getWaste() {
		return waste;
	}

	public int getBored() {
		return bored;
	}

	public int getTired() {
		return tired;
	}

	public void feedPet(int hunger) {
		this.hunger += 1;
		this.water -= 1;
		this.waste += 1;
		this.tired -= 1;
	}

	public void sipWater(int water) {
		this.water += 1;
		this.waste += 1;
	}

	public void hasWaste(int waste) {
		this.waste -= 2;
		this.tired += 1;

	}

	public void isBored(int bored) {
		this.bored -= 1;
		this.tired += 1;
	}

	public void sleepy(int tired) {
		this.tired -= 1;
	}

}
