import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.instanceOf;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

import petshelter.VirtualPet;

public class RoboticDogTest {

	PetShelter underTest;
	RoboticPet dog1;
	RoboticPet dog2;

	@Before
	public void shouldBeAnInstanceofRoboticDog() {
		underTest = new PetShelter();
		dog1 = new RoboticDog("RoboTommy", "Neon lights", 102, 103, 100);
		dog2 = new RoboticDog("RoboShepard", "Green lights", 110, 130, 150);
		assertThat(dog1, instanceOf(RoboticDog.class));
		assertThat(dog2, instanceOf(RoboticDog.class));
	}

	@Test
	public void shouldBeAbleToRenderProperties() {
		String name = dog1.getPetName();
		String description = dog1.getPetDescription();
		int wellnessLevel = dog1.getHealthLevel();
		int rustLevel = dog1.getRustLevel();
		assertThat(name, is("RoboTommy"));
		assertThat(description, is("Neon lights"));
		assertThat(rustLevel, is(102));
		assertThat(wellnessLevel, is(103));
	}

	@Test
	public void shouldBeAbleToAdoptAPet() {
		underTest.adopt(dog1);
		VirtualPet allowPetAdoption = underTest.findPet(dog1.getPetName());
		assertThat(allowPetAdoption, is(nullValue()));
	}

	@Test
	public void shouldBeAbleToReturnNullUponAddingAnOrganicPet() {
		VirtualPet allowPetIntake = underTest.findPet("Tommy");
		assertThat(allowPetIntake, is(nullValue()));
	}

	@Test
	public void shouldBeAbleToDecreaseRustLevelBy7AfterOilingRoboticPets() {

		underTest.add(dog1);
		underTest.add(dog2);
		underTest.oilAllPets();
		assertThat(dog1.getRustLevel(), is(90));
		assertThat(dog2.getRustLevel(), is(98));

	}

	@Test
	public void shouldBeAbleToIncreaseHappinessLevelByWalkingAllDogs() {
		underTest.add(dog1);
		underTest.add(dog2);
		underTest.walkAllDogs();
		assertThat(dog1.getHappinessLevel(), is(115));
		assertThat(dog2.getHappinessLevel(), is(165));
	}
}
