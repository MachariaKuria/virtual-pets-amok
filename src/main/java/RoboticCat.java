
public class RoboticCat extends RoboticPet{

	public RoboticCat(String petName, String petDescription, int rustLevel, int healthLevel) {
		this.petName = petName;
		this.petDescription = petDescription;
		this.rustLevel = rustLevel;
		this.healthLevel = healthLevel;
	}
	public int getRustLevel() {
		return rustLevel;
	}
}
