
public abstract class VirtualPet {

	protected String petName;
	protected String petDescription;
	protected int happinessLevel;
	protected int healthLevel;


	public String getPetName() {
		
		return petName;
	}
	
	public String getPetDescription() {
		
		return petDescription;
	}
	public int getHappinessLevel() {
		return happinessLevel;
	}

	public int getHealthLevel() {
		
		return healthLevel;
	}

	public void petPlay(int play) {
		happinessLevel += play;
		healthLevel +=69;

	}

	public void increaseBoredom() {
		happinessLevel -=24;
		
	}

	public void decreaseHappinessLevel() {
		
		happinessLevel -=29;
	}	
	public void decreaseHealthLevel() {
	
		healthLevel -=23;

	}
}