
public class OrganicDog extends OrganicPet implements IDog{

	public OrganicDog(String petName, String petDescription, int hungerLevel, int thirstLevel, int happinessLevel,
			int healthLevel) {
		this.petName = petName;
		this.petDescription = petDescription;
		this.hungerLevel = hungerLevel;
		this.thirstLevel = thirstLevel;
		this.happinessLevel = happinessLevel;
		this.healthLevel = healthLevel;
	}


	public void emptyCages() {
		healthLevel += 12;
		happinessLevel += 17;
	}


	public void walkDog() {
		healthLevel += 32;
		happinessLevel += 17;
	    
		
	}

}
