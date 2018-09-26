
public class OrganicCat extends OrganicPet implements ICat {


	public OrganicCat(String petName, String petDescription, int hungerLevel, int thirstLevel,int wasteLevel, int happinessLevel, int healthLevel) {
		this.petName = petName;
		this.petDescription = petDescription;
		this.hungerLevel = hungerLevel;
		this.thirstLevel = thirstLevel;
		this.wasteLevel = wasteLevel;
		this.happinessLevel = happinessLevel;
		this.healthLevel = healthLevel;
	}

	public void cleanLitterBoxes() {
		wasteLevel -=21;
		happinessLevel +=19;
	}

}
