
public class OrganicDog extends Dog implements OrganicMethods {

	protected int filthiness;
	protected int hunger;
	protected int thirst;
	protected int tiredness;

	public OrganicDog(String name, String description) {
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
	public void walk() {
		happiness += 3;
		filthiness -= 2;
	}

	@Override
	public void play() {
		filthiness += 1;
		hunger += 1;
		tiredness += 1;
		thirst += 1;
		happiness += 5;
		health += 3;
	}

	@Override
	public void clean() {
		filthiness -= 10;
		happiness += 3;
	}

	@Override
	public void sleep() {
		filthiness += 1;
		tiredness -= 5;
		hunger += 1;
		thirst += 1;
		happiness += 3;
		health += 3;
	}

	@Override
	public void water() {
		filthiness += 1;
		hunger += 1;
		tiredness += 1;
		thirst -= 5;
		happiness += 1;
		health += 1;
	}

	@Override
	public void feed() {
		filthiness += 1;
		hunger -= 5;
		tiredness += 1;
		thirst += 1;
		happiness += 1;
		health += 1;
	}

	@Override
	public void tick() {
		hunger += 1;
		thirst += 1;
		tiredness += 1;
		filthiness += 1;
		health -= (hunger+thirst+tiredness+filthiness);
		happiness = (health+filthiness); 
	}

	@Override
	public String toString() {
		return "\nPet Name: \t " + name + "\nDescription: \t" + description + "\nHunger: \t" + hunger + "\nThirst: \t"
				+ thirst + "\nTiredness: \t" + tiredness + "\nHappiness: \t" + happiness + "\nHealth: \t" + health
				+ "\nFilthiness: \t" + filthiness + "\n";
	}

}
