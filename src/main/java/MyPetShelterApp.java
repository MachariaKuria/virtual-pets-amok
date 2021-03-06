import java.util.Scanner;

public class MyPetShelterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		PetShelter myPets = new PetShelter();

		myPets.add(new OrganicCat("panther", "The Black Cat", 10, 20, 45, 30, 56));
		myPets.add(new OrganicDog("tommy", "The Brown Dog", 10, 20, 30, 40));
		myPets.add(new RoboticCat("tigger", "The White bionic cat", 102, 202, 120));
		myPets.add(new RoboticDog("nyota", "The dog with Neon lights", 102, 103, 100));
		String userChoice = null;

		System.out.println("Thank you for volunteering at Masha's Pet Shelter!");
		System.out.println("Welcome to the Pet Shelter");
		System.out.println();
		myPets.menuList();
		myPets.sortPets();
		do {
			try {
				userChoice = input.nextLine();
				if (userChoice.equals("1")) {
					System.out.println("Would you like to adopt a pet?.");
					String userAns = input.nextLine();
					while (!userAns.equalsIgnoreCase("n")) {
						System.out.println("Okay, select a pet from the pet list below that you want to adopt.");
						myPets.petNames();
						String petToAdopt = input.nextLine();
						if (myPets.findPet(petToAdopt.toLowerCase()) != null) {
							myPets.adopt(myPets.findPet(petToAdopt.toLowerCase()));
							System.out.println();
							myPets.petNames();
							myPets.tick();
						} else {
							System.out.println("That pet doesn't exist");
						}
						System.out.println("Would you like to adopt another pet y/n?");
						userAns = input.nextLine();
					}
					myPets.menuList();
					System.out.println();
					System.out.println("What else did you want to do?");

				} else if (userChoice.equals("2")) {
					System.out.println("Would you like to play with one pet y/n?");
					String userAns = input.nextLine();
					while (!userAns.equalsIgnoreCase("n")) {
						System.out.println("List of pets.");
						myPets.petList();
						System.out.println();
						System.out.println("Which pet would you like to play with?");
						System.out.println();
						String petToPlayWith = input.nextLine();
						myPets.findPet(petToPlayWith);
						if(myPets.findPet(petToPlayWith.toLowerCase()) != null) {
							System.out.println("Enter the playtime as integer!");
							int playTime = input.nextInt();
							input.nextLine();
							myPets.playWithPet(petToPlayWith, playTime);
							myPets.petList();	
						}else {
							System.out.println("Pet doesn't exist.");
						}
						System.out.println("Do you want to play with another pet y/n?");
						userAns = input.nextLine();
					}
					myPets.menuList();
					System.out.println("What else did you want to do?");
					userChoice = input.nextLine();
					System.out.println();
					myPets.tick();
					
				}else if(userChoice.equals("3")) {
					myPets.waterAllLivePets();
					myPets.petList();
					System.out.println();
					System.out.println("What else did you want to do?");
					System.out.println();
					myPets.menuList();
					System.out.println();
					myPets.tick();
					
				}
				else if(userChoice.equals("4")) {
					myPets.walkAllDogs();
					myPets.petList();
					System.out.println();
					System.out.println("What else did you want to do?");
					System.out.println();
					myPets.menuList();
					System.out.println();	
					myPets.tick();
					
				}
				else if(userChoice.equals("5")) {
					myPets.emptyLitterBoxes();
					myPets.petList();
					System.out.println();
					System.out.println("What else did you want to do?");
					System.out.println();
					myPets.menuList();
					System.out.println();	
					myPets.tick();
					
				}	
				else if(userChoice.equals("6")) {
					myPets.cleanAllCages();
					myPets.petList();
					System.out.println();
					System.out.println("What else did you want to do?");
					System.out.println();
					myPets.menuList();
					System.out.println();
					myPets.tick();
					
				}					
				else if(userChoice.equals("7")) {
					myPets.oilAllPets();
					myPets.petList();
					System.out.println();
					System.out.println("What else did you want to do?");
					System.out.println();
					myPets.menuList();
					System.out.println();
					myPets.tick();
					
				}				
			} catch (NullPointerException e) {
				e.printStackTrace();
			}

		} while (!userChoice.equals("8"));		
		System.out.println("Thanks for volunteering..GoodBye!");
		System.exit(0);
		input.close();
		
	}

}
