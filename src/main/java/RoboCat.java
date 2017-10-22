
public class RoboCat extends VirtualPet implements RoboticMethods {

	protected int oilLevel;

	public RoboCat(String name, String description) {
		super(name, description);
		this.oilLevel = 105;
	}

	public int getOilLevel() {
		return oilLevel;
	}

	@Override
	public void oil() {
		oilLevel += 20;
	}

	@Override
	public void tick() {
		oilLevel -= 5;
		health = oilLevel;
		happiness = health;
	}

	@Override
	public void play() {
		oilLevel -= 10;
	}

	@Override
	public String toString() {
		return "\nPet Name: \t " + name + "\nDescription: \t" + description + "\nHappiness:\t" + happiness
				+ "\nHealth: \t" + health + "\nOil Level: \t" + oilLevel + "\n";
	}

}
