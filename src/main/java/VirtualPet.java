
public abstract class VirtualPet {

	protected String petName;
	protected String petDescription;
	protected int wellnessLevel;
	protected int boredomLevel;


	public String getPetName() {
		
		return petName;
	}

	public String getPetDescription() {
		
		return petDescription;
	}

	public int getWellnessLevel() {
		
		return wellnessLevel;
	}

	public void petPlay(int play) {
		boredomLevel -= play;
		
	}

	public void increaseBoredom() {
		this.boredomLevel +=14;
		
	}

}