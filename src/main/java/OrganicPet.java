
public class OrganicPet extends VirtualPet {

	protected int hungerLevel;
	protected int thirstLevel;
	protected int boredomLevel;
	public int getHungerLevel() {
	
		return hungerLevel;
	}

	public int getThirstLevel() {
		
		return thirstLevel;
	}

	public int getBoredomLevel() {
		
		return boredomLevel;
	}

	public void increaseHunger() {
		hungerLevel +=22;
		
	}

	public void increaseThirst() {
		thirstLevel +=23;
		
	}

	public void increaseWasteLevel() {
		
		hungerLevel += 10;
		
	}

	public void feedPets() {
		hungerLevel -= 7;
		
	}

	public void waterPets() {
		thirstLevel -=7;
		
	}

	public void petPlay(int play) {
		boredomLevel -= play;
		
	}



}