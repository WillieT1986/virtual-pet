package virtual.pet;

public class VirtualPet {
	private int hunger;
	private int water;
	private int waste;
	private int tired;
	private int bored;

	// Constructor
	public VirtualPet(int hunger, int water, int waste, int tired, int bored) {
		this.hunger = hunger;
		this.water = water;
		this.waste = waste;
		this.tired = tired;
		this.bored = bored;
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

	public int getTired() {
		return tired;
	}

	public int getBored() {
		return bored;
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

	public void sleepy(int tired) {
		this.tired -= 1;
	}

	public void isBored(int bored) {
		this.bored -= 1;
		this.tired += 1;
	}

}
