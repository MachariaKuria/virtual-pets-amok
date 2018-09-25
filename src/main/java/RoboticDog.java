
public class RoboticDog extends RoboticPet implements IDog {

	public RoboticDog(String petName, String petDescription, int rustLevel, int wellnessLevel) {
		this.petName = petName;
		this.petDescription = petDescription;
		this.rustLevel = rustLevel;
		this.wellnessLevel = wellnessLevel;
	}

	@Override
	public void walkDog() {
		boredomLevel -= 15;
		
	}
}
