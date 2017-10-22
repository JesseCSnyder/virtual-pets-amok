
public class OrganicCat extends VirtualPet implements OrganicMethods {

	protected int filthiness;
	protected int hunger;
	protected int thirst;
	protected int tiredness;

	public OrganicCat(String name, String description) {
		super(name, description);
		this.filthiness = -1;
		this.hunger = -1;
		this.thirst = -1;
		this.tiredness = -1;
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

	public int getFilthiness() {
		return filthiness;
	}

	@Override
	public void water() {
		filthiness += 1;
		hunger += 1;
		tiredness += 1;
		thirst -= 3;
		happiness += 1;
		health += 1;
	}

	@Override
	public void clean() {
		filthiness -= 5;
		happiness -= 10;
	}

	@Override
	public void play() {
		filthiness += 1;
		hunger += 1;
		tiredness += 2;
		thirst += 1;
		happiness += 2;
		health += 1;
	}

	@Override
	public void feed() {
		filthiness += 1;
		hunger -= 5;
		tiredness += 3;
		thirst += 1;
		happiness += 3;
		health += 1;
	}

	@Override
	public void sleep() {
		filthiness += 1;
		tiredness -= 3;
		hunger += 2;
		thirst += 1;
		happiness += 3;
		health += 1;
	}

	public void getSick() {
		health -= 15;
	}

	@Override
	public void tick() {
		hunger += 1;
		tiredness += 1;
		thirst += 1;
		filthiness += 1;
		health -= (hunger + tiredness + thirst);
		happiness = (health - filthiness);
	}

	@Override
	public String toString() {
		return "\nPet Name: \t " + name + "\nDescription: \t" + description + "\nHunger: \t" + hunger + "\nThirst: \t"
				+ thirst + "\nTiredness: \t" + tiredness + "\nHappiness: \t" + happiness + "\nHealth: \t" + health
				+ "\nFilthiness: \t" + filthiness + "\n";
	}

}
