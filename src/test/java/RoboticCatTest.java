
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.instanceOf;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class RoboticCatTest {
	
	PetShelter underTest;
	RoboticPet cat1;
	RoboticPet cat2;

	@Before
	public void shouldBeAnInstanceofRoboticCat() {
		underTest = new PetShelter();
		cat1 = new RoboticCat("Robo","White",102,202);
		cat2 = new RoboticCat("Teko", "Blue with neon lights",708, 801);
		assertThat(cat1, instanceOf(RoboticCat.class));
		assertThat(cat2, instanceOf(RoboticCat.class));
	}
	
	@Test
	public void shouldBeAbleToRenderProperties() {
		String name = cat1.getPetName();
		String description = cat1.getPetDescription();
		int healthLevel = cat1.getHealthLevel();
		int rustLevel = cat1.getRustLevel();
		assertThat(name ,is("Robo"));
		assertThat(description ,is("White"));
		assertThat(rustLevel ,is(102));
		assertThat(healthLevel ,is(202));
	}
	
	@Test
	public void shouldBeAbleToReduceRustByOilingCats() {
		
		underTest.add(cat1);
		underTest.add(cat2);
		underTest.oilAllPets();
		assertThat(cat1.getRustLevel(),is(90));
		assertThat(cat2.getRustLevel(),is(696));
		
	}
	@Test
	public void shouldNotBeAbleToAddAnOrganicPet() {
		underTest.add(cat1);
		VirtualPet allowPetIntake = underTest.findPet("Panther");
		assertThat(allowPetIntake, is(cat1));
	}
}
