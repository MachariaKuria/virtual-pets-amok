import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

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
			if (pet instanceof ICat) {
				((ICat) pet).cleanLitterBoxes();
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

	public Collection<VirtualPet> getAllOrganicPets() {
		Collection<VirtualPet> livePet = new ArrayList<>();
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof OrganicPet) {
				livePet.add(pet);
			}
		}
		return livePet;
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

	public List<VirtualPet> sortPets() {
		List<VirtualPet> toSort = new ArrayList<>(pets.values());
		Collections.sort(toSort, (pet1, pet2) -> pet1.getPetName().compareTo(pet2.getPetName()));
		return toSort;
	}

	public void menuList() {

		System.out.println("Welcome to the Pet Shelter");
		System.out.println("Press 1 To Adopt A Pet");
		System.out.println("Press 2 To Play with a Pet");
		System.out.println("Press 3 to Water the pets");
		System.out.println("Press 4 to Walk all the dogs");
		System.out.println("Press 5 to Empty shelter litter boxes");
		System.out.println("Press 6 to Clean the dog cages");
		System.out.println("Press 7 to Oil the Robotic pets");
		System.out.println("Press 8 to quit");

	}

	public void organicPets() {

		System.out.println("Name\t|Hunger\t|Thirst |Boredom|Happiness|Health");
		System.out.println("-------\t|------\t|-------\t|--------\t");
		for (VirtualPet pet : pets.values()) {
			if(pet instanceof OrganicPet) {
			System.out.print(pet.getPetName() + "\t|");
			System.out.println(((OrganicPet) pet).getHungerLevel() + "\t|"
					+ (((OrganicPet) pet).getThirstLevel() + "\t|" 
					+ (((OrganicPet) pet).getBoredomLevel() + "\t|" 
					+ pet.getHappinessLevel() + "\t|"
					+ pet.getHealthLevel())));
			}
		}
	}

	public void roboticPets() {
		System.out.println("Name\t|Rust\t|Happiness\t|Health");
		System.out.println("-------\t|------\t|-------|--------");
		for (VirtualPet pet : pets.values()) 
		if(pet instanceof RoboticPet) {
		System.out.print(pet.getPetName() + "\t|");
		System.out.println(((RoboticPet) pet).getRustLevel() + "\t|"
				+ pet.getHappinessLevel()
				+ "\t\t|" + pet.getHealthLevel());
		}
	}
	
	public void petList() {
		System.out.println("Organic Pets:");
		organicPets();
		System.out.println();
		System.out.println("Robotic Pets:");
		roboticPets();
		
	}

}
