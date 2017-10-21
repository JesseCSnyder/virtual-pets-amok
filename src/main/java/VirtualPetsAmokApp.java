import java.util.Scanner;

public class VirtualPetsAmokApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String optionSelect;
		String name;
		LitterBox litterBox = new LitterBox(0);
		VirtualPetShelter myVirtualPetShelter = new VirtualPetShelter();
		VirtualPet dogbot = new RoboDog("dogbot", "Robodog");
		VirtualPet dog = new OrganicDog("dog", "Organic Dog");
		VirtualPet catbot = new RoboCat("catbot", "Robocat");
		VirtualPet cat = new OrganicCat("cat", "Organic Cat");
		myVirtualPetShelter.addPet(dogbot);
		myVirtualPetShelter.addPet(dog);
		myVirtualPetShelter.addPet(catbot);
		myVirtualPetShelter.addPet(cat);

		System.out.println("Welcome to the Virtual Pet Shelter!");
		do {
			litterBox.fillBox();
			myVirtualPetShelter.shelterTick();
			if (myVirtualPetShelter.checkForDead() == true) {
				System.out.println("You have killed a pet./nPlease leave the shelter.");
				break;
			}
			System.out.println("Here are our available pets.");
			System.out.println(myVirtualPetShelter.petValues());
			System.out.println("What would you like to do?");
			System.out.println("Enter [1] to feed all the pets.");
			System.out.println("Enter [2] to water all the pets.");
			System.out.println("Enter [3] to rest all the pets.");
			System.out.println("Enter [4] to play with a particular pet.");
			System.out.println("Enter [5] to adopt a pet.");
			System.out.println("Enter [6] to leave a pet");
			System.out.println("Enter [7] to check the cats' litter box.");
			System.out.println("Enter [8] to oil the robotic pets.");
			System.out.println("Enter [9] to clean the dog cages.");
			System.out.println("Enter [quit] to leave the store");
			optionSelect = input.nextLine();
			if (optionSelect.equals("1")) {
				myVirtualPetShelter.feedPets();
				System.out.println("You have fed the pets!");
			} else if (optionSelect.equals("2")) {
				myVirtualPetShelter.waterPets();
				System.out.println("You have watered the pets!");
			} else if (optionSelect.equals("3")) {
				myVirtualPetShelter.restPets();
				System.out.println("The pets are resting.");
			} else if (optionSelect.equals("4")) {
				System.out.println("Please tell me the name of the pet you would like to play with.");
				System.out.println(myVirtualPetShelter.petValues());
				name = input.nextLine();
				myVirtualPetShelter.getPet(name).play();
				System.out.println(name + " says 'thanks' for playing!");
			} else if (optionSelect.equals("5")) {
				System.out.println("Please tell me the name of the pet you would like to adopt.");
				System.out.println(myVirtualPetShelter.petValues());
				name = input.nextLine();
				myVirtualPetShelter.removeByName(name);
				System.out.println("Enjoy your new pet " + name + "!");
			} else if (optionSelect.equals("6")) {
				System.out.println("Will you be leaving a [1] living dog; [2] robodog; [3] living cat; [4] robobcat?\n"
						+ "Please choose a number to continue.");
				String nextOption = input.nextLine();
				switch (nextOption) {
				case "1": {
					System.out.println("What is the name of the pet you would like to leave?");
					String petName = input.nextLine();
					System.out.println("Can you describe your pet?");
					String description = input.nextLine();
					myVirtualPetShelter.addPet(new OrganicDog(petName, description));
					System.out.println("Thanks for bringing " + petName + " to us!");
				}
					break;
				case "2": {
					System.out.println("What is the name of the pet you would like to leave?");
					String petName = input.nextLine();
					System.out.println("Can you describe your pet?");
					String description = input.nextLine();
					myVirtualPetShelter.addPet(new RoboDog(petName, description));
					System.out.println("Thanks for bringing " + petName + " to us!");
				}
					break;
				case "3": {
					System.out.println("What is the name of the pet you would like to leave?");
					String petName = input.nextLine();
					System.out.println("Can you describe your pet?");
					String description = input.nextLine();
					myVirtualPetShelter.addPet(new OrganicCat(petName, description));
					System.out.println("Thanks for bringing " + petName + " to us!");
				}
					break;
				case "4": {
					System.out.println("What is the name of the pet you would like to leave?");
					String petName = input.nextLine();
					System.out.println("Can you describe your pet?");
					String description = input.nextLine();
					myVirtualPetShelter.addPet(new RoboCat(petName, description));
					System.out.println("Thanks for bringing " + petName + " to us!");
				}
					break;
				}
			} else if (optionSelect.equals("7")) {
				System.out.println("The litterbox contains " + litterBox.getFillLevel() + " discrete units of filth.");
				System.out.println("Would you like to empty the litterbox? [y]es or [n]o?");
				String selection = input.nextLine();
				if (selection.equals("y")) {
					litterBox.emptyLitterBox();
					System.out.println("Yep, this is your life.");
				} else {
					litterBox.emptyLitterBox();
					System.out.println("Do it anyway you filthy animal!");
				}
			} else if (optionSelect.equals("8")) {
				myVirtualPetShelter.oilPets();
			} else if (optionSelect.equals("9")) {
				myVirtualPetShelter.cleanDogCages();
				System.out.println("My god! What do they feed you animals?");
			}

			else {
				if (!optionSelect.equals("quit"))
					System.out.println("Please try again.");
			}

		} while ((!optionSelect.equals("quit")) && (!myVirtualPetShelter.petValues().isEmpty()));

		System.out.println("Thanks for visiting the pet store!");
		System.out.println("Have a nice day!");

		input.close();

	}

}
