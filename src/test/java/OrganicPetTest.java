import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class OrganicPetTest {

	PetShelter underTest;
	OrganicPet cat1;
	OrganicPet cat2;

	@Before
	public void setUp() {
		underTest = new PetShelter();
		cat1 = new OrganicCat("Panther","Black",10,20,30,40);
		cat2 = new OrganicCat("Chui", "Has dark spots", 50, 60,70, 80);
	}
	
	@Test
	public void shouldRenderProperties() {
		String name = cat1.getPetName();
		String description = cat1.getPetDescription();
		int hungerLevel = cat1.getHungerLevel();
		int thirstLevel =cat1.getThirstLevel();
		int boredomLevel = cat2.getBoredomLevel();
		int wellnessLevel = cat1.getWellnessLevel();
		assertThat(name ,is("Panther"));
		assertThat(description ,is("Black"));
		assertThat(hungerLevel ,is(10));
		assertThat(thirstLevel ,is(20));
		assertThat(boredomLevel ,is(70));
		assertThat(wellnessLevel ,is(40));
	}
	
	@Test
	public void shouldBeAbleToAddAPet() {
		underTest.add(cat1);
		OrganicCat allowPetIntake = underTest.findCat("Panther");
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
		assertThat(cat1.getThirstLevel(),is(14));
		assertThat(cat2.getThirstLevel(),is(54));
	}	
	@Test
	public void shouldBeAbleToPlayWithAPet() {
		
		underTest.add(cat2);
		underTest.playWithCat(cat2.getPetName(),5);
		assertThat(cat2.getBoredomLevel(),is(65));
	}
	@Test
	public void shouldBeAbleToReduceBoredFrom30To28ByPlayingWithCat1(){
		underTest.add(cat1);
		underTest.playWithCat(cat1.getPetName(),2);
		assertThat(cat1.getBoredomLevel(),is(28));
		
	}
	
	@Test
	public void shouldBeAbleToIncreaseWellnessLevelFrom80To92ByCleaninLitter(){
		underTest.add(cat2);
		underTest.cleanLitter();
		assertThat(cat2.getWellnessLevel(),is(92));
		
	}
	
	@Test
	public void shouldIncreaseHungerThirstBoredomShouldGoUpWithOneTick() {
		underTest.tick();
		cat1.increaseHunger();
		cat1.increaseThirst();
		cat1.increaseBoredom();
		cat1.increaseWasteLevel();
		assertThat(cat1.getHungerLevel(),is(42));
		assertThat(cat1.getThirstLevel(),is(43));
		assertThat(cat1.getBoredomLevel(),is(44));
	}
}
