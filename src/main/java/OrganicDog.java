
public class OrganicDog extends OrganicPet {

	public OrganicDog(String petName, String petDescription, int hungerLevel, int thirstLevel, int boredomLevel,
			int wellnessLevel) {
		this.petName = petName;
		this.petDescription = petDescription;
		this.hungerLevel = hungerLevel;
		this.thirstLevel = thirstLevel;
		this.boredomLevel = boredomLevel;
		this.wellnessLevel = wellnessLevel;
	}

	public void feedDogs() {
		hungerLevel -= 1;

	}

	public void waterDogs() {
		thirstLevel -= 10;

	}

	@Override
	public void increaseHunger() {
		hungerLevel += 22;

	}

	@Override
	public void increaseThirst() {
		thirstLevel += 23;

	}

	@Override
	public void increaseBoredom() {
		boredomLevel += 14;

	}

	@Override
	public void increaseWasteLevel() {
		wellnessLevel -= 10;

	}

	public void CleanAllCages() {
		wellnessLevel += 10;
	}

	public void petPlay(int play) {
		boredomLevel -= 3;

	}

}
