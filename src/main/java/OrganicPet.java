
public class OrganicPet {

	protected String petName;
	protected String petDescription;
	protected int hungerLevel;
	protected int thirstLevel;
	protected int boredomLevel;
	protected int wellnessLevel;


	public String getPetName() {
		
		return petName;
	}

	public String getPetDescription() {
		
		return petDescription;
	}

	public int getHungerLevel() {
	
		return hungerLevel;
	}

	public int getThirstLevel() {
		
		return thirstLevel;
	}

	public int getBoredomLevel() {
		
		return boredomLevel;
	}

	public int getWellnessLevel() {
		
		return wellnessLevel;
	}

	public void petPlay(int play) {
		boredomLevel -= play;
		
	}

	public void increaseHunger() {
		hungerLevel +=22;
		
	}

	public void increaseThirst() {
		thirstLevel +=23;
		
	}

	public void increaseBoredom() {
		boredomLevel +=14;
		
	}

	public void increaseWasteLevel() {
		
		hungerLevel += 10;
		
	}


}