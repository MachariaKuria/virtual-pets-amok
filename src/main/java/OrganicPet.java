public abstract class OrganicPet extends VirtualPet {

	protected int hungerLevel;
	protected int thirstLevel;
	protected int boredomLevel;
	protected int wasteLevel;

	public int getHungerLevel() {

		return hungerLevel;
	}

	public int getThirstLevel() {

		return thirstLevel;
	}

	public int getBoredomLevel() {

		return boredomLevel;
	}

	public int getWasteLevel() {

		return wasteLevel;
	}

	public void increaseHunger() {
		hungerLevel += 22;

	}

	public void increaseThirst() {
		thirstLevel += 23;

	}

	public void increaseWasteLevel() {
		wasteLevel += 10;
		hungerLevel += 10;

	}

	public void feedPets() {
		hungerLevel -= 7;

	}

	public void waterPets() {
		thirstLevel -= 7;

	}

	@Override
	public void increaseBoredom() {
		this.boredomLevel += 14;

	}

}