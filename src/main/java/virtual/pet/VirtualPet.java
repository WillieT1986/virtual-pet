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

	public void tick() {
		hunger++;
		water++;
		waste--;
		bored--;
		tired--;
	}

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

	public void feedPet() {
		this.hunger += 2;
		this.water -= 2;
		this.waste += 2;
		this.tired -= 1;
	}

	public void sipWater() {
		this.water += 1;
		this.waste += 1;
	}

	public void hasWaste() {
		this.waste -= 3;
		this.tired += 1;

	}

	public void isBored() {
		this.bored -= 1;
		this.tired += 1;
	}

	public void sleepy() {
		this.tired -= 1;
	}

}
