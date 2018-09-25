import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.instanceOf;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class OrganicDogTest {
	PetShelter underTest;
	OrganicPet	dog1;
	OrganicPet	dog2;


	@Before
	public void shouldBeAnInstanceofRoboticDog() {
		underTest = new PetShelter();
		 dog1 = new OrganicDog("Tommy","Brown",10,20,30,40);
		 dog2 = new OrganicDog("Filo", "Has grey spots", 50, 60,70, 80);
		assertThat(dog1, instanceOf(OrganicPet.class));
		assertThat(dog2, instanceOf(OrganicPet.class));
	}
	
	@Test
	public void shouldRenderProperties() {
		String name = dog1.getPetName();
		String description = dog1.getPetDescription();
		int hungerLevel = dog1.getHungerLevel();
		int thirstLevel =dog1.getThirstLevel();
		int boredomLevel = dog2.getHappinessLevel();
		int wellnessLevel = dog1.getHealthLevel();
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
		VirtualPet allowPetIntake = underTest.findPet("Tommy");
		assertThat(allowPetIntake, is(dog1));
	}

	@Test
	public void shouldBeAbleToFeedAllDogs(){
		underTest.add(dog1);
		underTest.add(dog2);
		underTest.FeedAllLivePets();
		assertThat(dog1.getHungerLevel(),is(3));
		assertThat(dog2.getHungerLevel(),is(43));
	}

	@Test
	public void shouldBeAbleToWaterAllDogs(){
		underTest.add(dog1);
		underTest.add(dog2);
		underTest.waterAllLivePets();
		assertThat(dog1.getThirstLevel(),is(13));
		assertThat(dog2.getThirstLevel(),is(53));
	}	
	@Test
	public void shouldBeAbleToPlayWithAPet() {
		
		underTest.add(dog2);
		underTest.playWithPet(dog2.getPetName(),5);
		assertThat(dog2.getHappinessLevel(),is(65));
	}
	@Test
	public void shouldBeAbleToReduceBoredFrom30To28ByPlayingWithdog1(){
		underTest.add(dog1);
		underTest.playWithPet(dog1.getPetName(),2);
		assertThat(dog1.getHappinessLevel(),is(28));
		
	}
	
	@Test
	public void shouldBeAbleToIncreaseWellnessLevelFrom80To92ByCleaninLitter(){
		underTest.add(dog2);
		underTest.cleanAllCages();
		assertThat(dog2.getHealthLevel(),is(92));
		
	}

	@Test
	public void shouldIncreaseHungerThirstBoredomShouldGoUpWithOneTick() {
		underTest.tick();
		dog1.increaseHunger();
		dog1.increaseThirst();
		dog1.increaseBoredom();
		dog1.increaseWasteLevel();
		assertThat(dog1.getHungerLevel(),is(42));
		assertThat(dog1.getThirstLevel(),is(43));
		assertThat(dog1.getHappinessLevel(),is(44));
	}
	
	@Test
	public void shouldBeAbleToReduceBoredomLevelByWalkingAllDogs() {
		underTest.add(dog1);
		underTest.add(dog2);
		underTest.walkAllDogs();
		assertThat(dog1.getHappinessLevel(),is(20));
		assertThat(dog2.getHappinessLevel(),is(60));
	}
}
