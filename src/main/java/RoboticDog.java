
public class RoboticDog extends RoboticPet implements IDog {

	public RoboticDog(String petName, String petDescription, int rustLevel, int healthLevel) {
		this.petName = petName;
		this.petDescription = petDescription;
		this.rustLevel = rustLevel;
		this.healthLevel = healthLevel;
	}

	@Override
	public void walkDog() {
		happinessLevel += 15;
		healthLevel += 15;

	}
}
