import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	Map<String, VirtualPet> pets = new HashMap<String, VirtualPet>();

	public Collection<VirtualPet> petValues() {
		return pets.values();
	}

	public void addPet(VirtualPet pet) {
		pets.put(pet.getName(), pet);
	}

	public void restPets() {
		for (VirtualPet current : pets.values())
			if (current instanceof OrganicMethods) {
				((OrganicMethods) current).sleep();
			}
	}

	public void feedPets() {
		for (VirtualPet current : pets.values()) {
			if (current instanceof OrganicMethods) {
				((OrganicMethods) current).feed();
			}
		}
	}

	public void waterPets() {
		for (VirtualPet current : pets.values()) {
			if (current instanceof OrganicMethods) {
				((OrganicMethods) current).water();
			}
		}
	}

	public void oilPets() {
		for (VirtualPet current : pets.values()) {
			if (current instanceof RoboticMethods) {
				((RoboticMethods) current).oil();
			}
		}
	}

	public void walkDogs() {
		for (VirtualPet current : pets.values()) {
			if (current instanceof Dog) {
				((Dog) current).walk();
			}
		}
	}

	public void cleanDogCages() {
		for (VirtualPet current : pets.values()) {
			if (current instanceof OrganicDog) {
				((OrganicDog) current).clean();
			}
		}
	}

	public VirtualPet getPet(String name) {
		return pets.get(name);
	}

	public void removeByName(String name) {
		pets.remove(name);
	}

	public void checkHappinessAffectsHealth() {
		for (VirtualPet current : pets.values()) {
			if ((current.happiness) <= (50)) {
				current.happinessAffectsHealth();
			}
		}
	}

	public boolean checkForDead() {
		for (VirtualPet current : pets.values()) {
			if (((current.happiness) <= (0)) || ((current.health) <= (0))) {
				return true;
			}

		}
		return false;

	}

	public void catsGetSick() {
		for (VirtualPet current : pets.values()) {
			if (current instanceof OrganicCat) {
				((OrganicCat) current).getSick();
			}
		}
	}

	public void shelterTick() {
		for (VirtualPet current : pets.values()) {
			current.tick();
		}

	}

}
