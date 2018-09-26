import java.util.Scanner;

public class MyPetShelterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		PetShelter myPets = new PetShelter();
		
		
		myPets.add(new OrganicCat("CatPanther","Black",10,20,45,30));
		myPets.add(new OrganicDog("DogTommy","Brown",10,20,30,40));
		myPets.add(new RoboticCat("CatPanther","White",102,202,120));
		myPets.add(new RoboticDog("RoboTommy", "Neon lights", 102, 103, 100));
		myPets.organicPetStatus();
		myPets.tick();
		myPets.FeedAllLivePets();
		myPets.waterAllLivePets();
		myPets.walkAllDogs();
		myPets.emptyLitterBoxes();
		myPets.oilAllPets();
		myPets.organicPetStatus();
		
	}

}
