
public class RoboticPet extends VirtualPet {

	protected int rustLevel;

	public int getRustLevel() {
		return rustLevel;
	}

	public void oilPets() {
		
		rustLevel -= 32;
		happinessLevel += 25;
		healthLevel +=44;
		
	}

}