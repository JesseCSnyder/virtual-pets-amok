
abstract class VirtualPet {

	protected int happiness;
	protected int health;
	protected String name;
	protected String description;

	public VirtualPet(String name, String description) {
		this.name = name;
		this.description = description;
		this.happiness = 52;
		this.health = 52;
	}

	public VirtualPet(String name, String description, int hunger, int thirst, int tiredness, int happiness,
			int health) {
		this.name = name;
		this.description = description;
		this.happiness = happiness;
		this.health = health;
	}

	public int getHappiness() {
		return happiness;
	}

	public int getHealth() {
		return health;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}
	
	abstract void tick();
	abstract void play();

	@Override
	public String toString() {
		return "\nPet Name:\t " + name + "\nDescription: \t" + description + "\n" + "\nHappiness: \t" + happiness + "\n"
				+ "\nHealth: \t" + health + "\n";
	}

}
