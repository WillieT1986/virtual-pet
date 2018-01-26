package virtual.pet;

public class VirtualPet {
	private int hunger;
	private int water;
	private int waste;
	boolean tired;
	boolean bored;
	boolean sickness;

	// Constructor
	public VirtualPet(int hunger, int water, int waste) {
		this.hunger = hunger;
		this.water = water;
		this.waste = waste;
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

	// Setter
	public void setHunger(int hunger) {
		this.hunger = hunger;
	}

	public void setWater(int water) {
		this.water = water;
	}

	public void setWaste(int waste) {
		this.waste = waste;
	}

}
