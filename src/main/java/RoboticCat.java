
public class RoboticCat extends RoboticPet{

	public RoboticCat(String petName, String petDescription, int rustLevel, int healthLevel, int happinessLevel) {
		this.petName = petName;
		this.petDescription = petDescription;
		this.rustLevel = rustLevel;
		this.healthLevel = healthLevel;
		this.happinessLevel = happinessLevel;
	}
	public int getRustLevel() {
		return rustLevel;
	}
}
