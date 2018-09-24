import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class OrganicDogTest {
	PetShelter underTest;
	OrganicPet	dog1;
	OrganicPet	dog2;
	
	@Before
	public void setUp() {
		underTest = new PetShelter();
		dog1 = new OrganicDog("Tommy","Brown",10,20,30,40);
		dog2 = new OrganicDog("Filo", "Has grey spots", 50, 60,70, 80);
	}
	
	@Test
	public void shouldRenderProperties() {
		String name = dog1.getPetName();
		String description = dog1.getPetDescription();
		int hungerLevel = dog1.getHungerLevel();
		int thirstLevel =dog1.getThirstLevel();
		int boredomLevel = dog2.getBoredomLevel();
		int wellnessLevel = dog1.getWellnessLevel();
		assertThat(name ,is("Tommy"));
		assertThat(description ,is("Brown"));
		assertThat(hungerLevel ,is(10));
		assertThat(thirstLevel ,is(20));
		assertThat(boredomLevel ,is(70));
		assertThat(wellnessLevel ,is(40));
	}
	
	@Test
	public void shouldBeAbleToAddAPet() {
		underTest.add(dog1);
		OrganicPet allowPetIntake = underTest.findPet("Tommy");
		assertThat(allowPetIntake, is(dog1));
	}

//	@Test
//	public void shouldBeAbleToFeedAllDogs(){
//		underTest.add(dog1);
//		underTest.add(dog2);
//		Collection<OrganicPet> livePets = underTest.FeedAllLivePets();
//
//	}

//	@Test
//	public void shouldBeAbleToWaterAllDogs(){
//		underTest.add(dog1);
//		underTest.add(dog2);
//		underTest.waterAllLivePets();
//		assertThat(dog1.getThirstLevel(),is(10));
//		assertThat(dog2.getThirstLevel(),is(50));
//	}	
//	@Test
//	public void shouldBeAbleToPlayWithAPet() {
//		
//		underTest.add(dog2);
//		underTest.playWithPet(dog2.getPetName(),5);
//		assertThat(dog2.getBoredomLevel(),is(67));
//	}
	
//	@Test
//	public void shouldBeAbleToIncreaseWellnessLevelFrom80To92ByCleaninCages(){
//		underTest.add(dog2);
//		underTest.cleanAllCages();
//		assertThat(dog2.getWellnessLevel(),is(90));
//		
//	}
	
	@Test
	public void shouldIncreaseHungerThirstBoredomShouldGoUpWithOneTick() {
		underTest.tick();
		dog1.increaseHunger();
		dog1.increaseThirst();
		dog1.increaseBoredom();
		dog1.increaseWasteLevel();
		assertThat(dog1.getHungerLevel(),is(32));
		assertThat(dog1.getThirstLevel(),is(43));
		assertThat(dog1.getBoredomLevel(),is(44));
		assertThat(dog1.getWellnessLevel(),is(30));
	}
}
