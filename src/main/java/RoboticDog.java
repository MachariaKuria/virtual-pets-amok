
public class RoboticDog extends RoboticPet implements IDog {

	public RoboticDog(String petName, String petDescription, int rustLevel, int healthLevel, int happinessLevel) {
		this.petName = petName;
		this.petDescription = petDescription;
		this.rustLevel = rustLevel;
		this.healthLevel = healthLevel;
		this.happinessLevel = happinessLevel;
	}


	public void walkDog() {
		happinessLevel += 51;
		healthLevel += 32;

	}
}
