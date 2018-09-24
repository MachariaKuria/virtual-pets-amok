import java.util.HashMap;
import java.util.Map;

public class PetShelter {

	Map<String, OrganicPet> livePets = new HashMap<>();

	public void adopt(OrganicPet cat) {
		livePets.put(cat.getPetName(), cat);

	}

	public OrganicPet findPet(String petName) {

		return livePets.get(petName);
	}

	public void tick() {
		int wasteLevel = 0;
		if ((int) (Math.random() * 10) + 1 < 5) {
			for (OrganicPet livePet : livePets.values()) {
				livePet.increaseHunger();
				livePet.increaseThirst();
				livePet.increaseBoredom();
				if (wasteLevel >= 10) {

				}
			}

		}

	}

	public void add(OrganicPet dog) {
		livePets.put(dog.getPetName(), dog);

	}

	public void FeedAllLivePets() {

		for (OrganicPet livePet : livePets.values()) {
			livePet.feedPets();
		}
	}

	public void emptyLitterBoxes() {
		for (OrganicPet livePet : livePets.values()) {
			if (livePet instanceof OrganicCat) {
				((OrganicCat) livePet).cleanLitterBoxes();
			}
		}

	}

	public void waterAllLivePets() {
		for (OrganicPet livePet : livePets.values()) {
			livePet.waterPets();
		}

	}

	public void playWithPet(String petName, int play) {
		
		VirtualPet petToPlayWith = findPet(petName);
		petToPlayWith.petPlay(play);
	}

}
