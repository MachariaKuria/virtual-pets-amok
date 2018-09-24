import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class RoboticCatTest {
	
	PetShelter underTest;
	RoboticCat cat1;
	RoboticCat cat2;

	@Before
	public void setUp() {
		underTest = new PetShelter();
		cat1 = new RoboticCat("Robo","White",102,202);
		cat2 = new RoboticCat("Teko", "Blue with neon lights",708, 801);
	}
	
	@Test
	public void shouldBeAbleToRenderProperties() {
		String name = cat1.getPetName();
		String description = cat1.getPetDescription();
		int wellnessLevel = cat1.getWellnessLevel();
		int rustLevel = cat1.getRustLevel();
		assertThat(name ,is("Robo"));
		assertThat(description ,is("White"));
		assertThat(rustLevel ,is(102));
		assertThat(wellnessLevel ,is(202));
	}
	
	@Test
	public void shouldBeAbleToReduceRustByOilingCats() {
		
		underTest.add(cat1);
		underTest.add(cat2);
		underTest.oilRoboticPets();
		assertThat(cat1.getRustLevel(),is(90));
		assertThat(cat2.getRustLevel(),is(696));
		
	}

}
