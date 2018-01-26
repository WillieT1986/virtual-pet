package virtual.pet;

import org.junit.Assert;
import org.junit.Test;

public class VirtualPetTest {

	// @Test
	// public void passageOfTimeTick() {
	// VirtualPet underTest = new VirtualPet();
	// String tick = underTest.wait(0);
	// Assert.assertEquals(0, tick);
	// }

	@Test
	public void shouldFeedPet() {
		VirtualPet underTest = new VirtualPet(20);
		underTest.feed();
		int hunger = underTest.getHunger();
		Assert.assertEquals(20, hunger);

	}

}
