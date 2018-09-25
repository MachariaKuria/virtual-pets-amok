import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.Matchers.instanceOf;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class OrganicCatTest {

	PetShelter underTest;
	OrganicPet cat1;
	OrganicPet cat2;

	@Before
	public void shouldBeAnInstanceofOrganicCat() {
		underTest = new PetShelter();
		 cat1 = new OrganicCat("Panther","Black",10,20,45,30);
		 cat2 = new OrganicCat("Chui", "Has dark spots", 50, 60,45,70);
		assertThat(cat1, instanceOf(OrganicPet.class));
		assertThat(cat2, instanceOf(OrganicPet.class));
	}	
	@Test
	public void shouldRenderProperties() {
		String name = cat1.getPetName();
		String description = cat1.getPetDescription();
		int hungerLevel = cat1.getHungerLevel();
		int thirstLevel =cat1.getThirstLevel();
		int wasteLevel =cat1.getWasteLevel();
		int healthLevel = cat2.getHappinessLevel();
		assertThat(name ,is("Panther"));
		assertThat(description ,is("Black"));
		assertThat(hungerLevel ,is(10));
		assertThat(thirstLevel ,is(20));
		assertThat(wasteLevel ,is(45));
		assertThat(healthLevel ,is(70));
	}
	
	@Test
	public void shouldBeAbleToReturnNullOnAddingARoboticPet() {
		underTest.add(cat1);
		VirtualPet allowPetIntake = underTest.findPet("Tommy");
		assertThat(allowPetIntake, is(nullValue()));
	}	
	@Test
	public void shouldBeAbleToAddAPet() {
		underTest.add(cat1);
		VirtualPet allowPetIntake = underTest.findPet("Panther");
		assertThat(allowPetIntake, is(cat1));
	}

	@Test
	public void shouldBeAbleToFeedAllCats(){
		underTest.add(cat1);
		underTest.add(cat2);
		underTest.FeedAllLivePets();
		assertThat(cat1.getHungerLevel(),is(3));
		assertThat(cat2.getHungerLevel(),is(43));
	}

	@Test
	public void shouldBeAbleToWaterAllCats(){
		underTest.add(cat1);
		underTest.add(cat2);
		underTest.waterAllLivePets();
		assertThat(cat1.getThirstLevel(),is(13));
		assertThat(cat2.getThirstLevel(),is(53));
	}	
	@Test
	public void shouldBeAbleToPlayWithAPet() {
		
		underTest.add(cat2);
		underTest.playWithPet(cat2.getPetName(),5);
		assertThat(cat2.getHappinessLevel(),is(85));
	}
	
	@Test
	public void shouldBeAbleToIncreaseHapinessLevelFrom70To89ByCleaninLitter(){
		underTest.add(cat2);
		((OrganicCat)cat2).cleanLitterBoxes();
		assertThat(cat2.getHappinessLevel(),is(89));
		
	}

	@Test
	public void shouldIncreaseHungerThirstReduceHappinessWithOneTick() {
		underTest.tick();
		cat1.increaseHunger();
		cat1.increaseThirst();
		cat1.increaseWasteLevel();
		cat1.increaseBoredom();	
		assertThat(cat1.getHungerLevel(),is(42));
		assertThat(cat1.getThirstLevel(),is(43));
		assertThat(cat1.getWasteLevel(),is(55));
		assertThat(cat1.getHappinessLevel(),is(1));
	}
}
