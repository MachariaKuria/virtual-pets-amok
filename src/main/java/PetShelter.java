import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PetShelter {

	Map<String, OrganicPet> livePets = new HashMap<>();
	// Map<String, RoboticPet> roboPets = new HashMap<>();

	public void adopt(OrganicPet cat) {
		livePets.put(cat.getPetName(), cat);

	}

	public void playWithCat(String petName, int play) {

		OrganicPet catToPlayWith = findPet(petName);
		catToPlayWith.petPlay(play);

	}

	public OrganicPet findPet(String petName) {

		return livePets.get(petName);
	}


	public void tick() {
		int wasteLevel = 0;
		if ((int) (Math.random() * 10) + 1 < 5) {
			for (OrganicPet cat : livePets.values()) {
				cat.increaseHunger();
				cat.increaseThirst();
				cat.increaseBoredom();
				if (wasteLevel >= 10) {

				}
			}

		}

	}

	public void add(OrganicPet dog) {
		livePets.put(dog.getPetName(), dog);
		
	}

}
