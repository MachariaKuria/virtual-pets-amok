import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PetShelter {

	Map<String, VirtualPet> pets = new HashMap<>();

	public VirtualPet findPet(String petName) {

		return pets.get(petName);
	}


	public void add(VirtualPet pet) {
		pets.put(pet.getPetName(), pet);

	}

	public void FeedAllLivePets() {

		for (VirtualPet pet : pets.values()) {
			if (pet instanceof OrganicPet) {
				((OrganicPet) pet).feedPets();
			}
		}
	}

	public void emptyLitterBoxes() {
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof OrganicCat) {
				((OrganicCat) pet).cleanLitterBoxes();
			}
		}

	}

	public void waterAllLivePets() {
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof OrganicPet) {
				((OrganicPet) pet).waterPets();
			}
		}
	}

	public void playWithPet(String petName, int play) {

		VirtualPet pet = findPet(petName);
		pet.petPlay(play);
	}

	public void cleanAllCages() {
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof OrganicDog) {
				((OrganicDog) pet).emptyCages();
			}
		}

	}

	public void adopt(VirtualPet pet) {

		pets.remove(pet.getPetName(), pet);
	}

	public Collection<VirtualPet> getAllRoboticPets() {
		Collection<VirtualPet> roboPet = new ArrayList<>();
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof RoboticPet) {
				roboPet.add(pet);
			}
		}
		return roboPet;
	}

	public void tick() {
		int wasteLevel = 0;
		if ((int) (Math.random() * 10) + 1 < 5) {
			for (VirtualPet pet : pets.values()) {

				if (pet instanceof OrganicPet) {
					((OrganicPet) pet).increaseHunger();
					((OrganicPet) pet).increaseThirst();
				}
				pet.increaseBoredom();
				if (wasteLevel >= 10) {
					((OrganicPet) pet).increaseWasteLevel();
				}
			}

		}

	}

	public void oilAllPets() {
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof RoboticPet) {
				((RoboticPet) pet).oilPets();
			}
		}

	}

	public void walkAllDogs() {
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof IDog) {
				((IDog) pet).walkDog();
			}
		}
	}


}
