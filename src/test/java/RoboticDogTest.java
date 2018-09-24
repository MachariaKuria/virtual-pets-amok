import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class RoboticDogTest {
	
	PetShelter underTest;
	RoboticDog dog1;
	RoboticDog dog2;

	@Before
	public void setUp() {
		underTest = new PetShelter();
		dog1 = new RoboticDog("Robo","White",102,202);
		dog2 = new RoboticDog("Teko", "Blue with neon lights",708, 801);
	}
	
	@Test
	public void shouldBeAbleToRenderProperties() {
		String name = dog1.getPetName();
		String description = dog1.getPetDescription();
		int wellnessLevel = dog1.getWellnessLevel();
		int rustLevel = dog1.getRustLevel();
		assertThat(name ,is("Robo"));
		assertThat(description ,is("White"));
		assertThat(rustLevel ,is(102));
		assertThat(wellnessLevel ,is(202));
	}
	
	@Test
	public void shouldBeAbleToAddAPet() {
		underTest.adopt(dog1);
		underTest.adopt(dog2);
		Collection<PetShelter> roboticPets = underTest.getAllRoboticPets();
		assertThat(roboticPets, containsInAnyOrder(dog1, dog2));
	}
	
	@Test
	public void shouldBeAbleToReduceRustByOilingCats() {
		
		underTest.add(dog1);
		underTest.add(dog2);
		underTest.oilAllPets();
		assertThat(dog1.getRustLevel(),is(102));
		assertThat(dog2.getRustLevel(),is(696));
		
	}

}
