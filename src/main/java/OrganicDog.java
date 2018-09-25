
public class OrganicDog extends OrganicPet implements IDog{

	public OrganicDog(String petName, String petDescription, int hungerLevel, int thirstLevel, int boredomLevel,
			int wellnessLevel) {
		this.petName = petName;
		this.petDescription = petDescription;
		this.hungerLevel = hungerLevel;
		this.thirstLevel = thirstLevel;
		this.boredomLevel = boredomLevel;
		this.wellnessLevel = wellnessLevel;
	}


	public void emptyCages() {
		wellnessLevel += 12;
	}


	public void walkDog() {
		boredomLevel -= 10;
	    
		
	}

}
