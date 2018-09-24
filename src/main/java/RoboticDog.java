
public class RoboticDog extends VirtualPet {
	private String petName;
	private String petDescription;
	private int rustLevel;
	private int wellnessLevel;
	public RoboticDog(String petName, String petDescription, int rustLevel, int wellnessLevel) {
		this.petName = petName;
		this.petDescription = petDescription;
		this.rustLevel = rustLevel;
		this.wellnessLevel = wellnessLevel;
	}

	public String getPetName() {

		return petName;
	}

	public String getPetDescription() {

		return petDescription;
	}

	public int getWellnessLevel() {

		return wellnessLevel;
	}

	public int getRustLevel() {
		return rustLevel;
	}

	public void oilDogs() {
		rustLevel -= 12;
		
	}
}
