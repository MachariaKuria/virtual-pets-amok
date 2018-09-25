
public class OrganicCat extends OrganicPet {


	public OrganicCat(String petName, String petDescription, int hungerLevel, int thirstLevel,int wasteLevel, int happinessLevel) {
		this.petName = petName;
		this.petDescription = petDescription;
		this.hungerLevel = hungerLevel;
		this.thirstLevel = thirstLevel;
		this.wasteLevel = wasteLevel;
		this.happinessLevel = happinessLevel;
	}


	public void cleanLitterBoxes() {
		happinessLevel +=12;
		wasteLevel -=11;
	}

}
