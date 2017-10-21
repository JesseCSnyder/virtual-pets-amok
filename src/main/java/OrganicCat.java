
public class OrganicCat extends VirtualPet implements OrganicMethods {
	
	protected int cleanliness;
	protected int hunger;
	protected int thirst;
	protected int tiredness;

	public OrganicCat(String name, String description) {
		super(name, description);
		this.cleanliness = 50;
		this.hunger = 0;
		this.thirst = 0;
		this.tiredness = 0;
		}

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public int getTiredness() {
		return tiredness;
	}
	
	public int getCleanliness() {
		return cleanliness;
	}
	
	@Override
	public void water() {
		hunger += 3;
		tiredness += 3;
		thirst -= 5;
		happiness += 3;
		health += 3;
	}

	@Override
	public void clean() {
		cleanliness += 5;
		happiness += 3;
	}
	
	public void play() {
		hunger += 3;
		tiredness += 3;
		thirst += 3;
		happiness += 5;
		health += 3;
	}

	@Override
	public void feed() {
		hunger -= 5;
		tiredness += 3;
		thirst += 3;
		happiness += 3;
		health += 3;
	}
	
	@Override
	public void sleep() {
		tiredness -= 5;
		hunger += 3;
		thirst += 3;
		happiness += 3;
		health += 3;
	}
	
	
	@Override
	public void tick() {
		hunger += 2;
		tiredness += 2;
		thirst += 2;
		happiness -= 2;
		health -= 2;
	}
	
	

	@Override
	public String toString() {
		return "\nPet Name: \t " + name + "\nDescription: \t" + description + "\nHunger: \t" + hunger + "\nThirst: \t"
				+ thirst + "\nTiredness: \t" + tiredness + "\nHappiness: \t" + happiness + "\nHealth: \t"
				+ health + "\nCleanliness: \t" + cleanliness + "\n";
	}


}
