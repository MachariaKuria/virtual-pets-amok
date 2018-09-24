
public class OrganicCat extends OrganicPet {

	public OrganicCat(String petName, String petDescription, int hungerLevel, int thirstLevel, int boredomLevel,int wellnessLevel) {
		this.petName = petName;
		this.petDescription = petDescription;
		this.hungerLevel = hungerLevel;
		this.thirstLevel = thirstLevel;
		this.boredomLevel = boredomLevel;
		this.wellnessLevel = wellnessLevel;
	}

	public void CleanAllCats() {
		wellnessLevel +=12;
		
	}

	public void feedCats() {
		hungerLevel -= 7;
		
	}

	public void waterCats() {
		thirstLevel -=6;
		
	}


}
