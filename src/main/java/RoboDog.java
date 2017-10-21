
public class RoboDog extends Dog implements RoboticMethods {

	protected int oilLevel;

	public RoboDog(String name, String description) {
		super(name, description);
		this.oilLevel = 20;

	}

	public int getOilLevel() {
		return oilLevel;
	}

	@Override
	public void oil() {
		oilLevel += 5;
		happiness += 3;
		health += 3;
	}
	
	public void play() {
		happiness += 5;
		health += 3;
	}
	
	@Override
	public String toString() {
		return "\nPet Name:\t " + name + "\nDescription: \t" + description + "\nHappiness: \t" + happiness + "\nHealth: \t"
				+ health + "\nOil Level:\t " + oilLevel + "\n";
	}

	@Override
	public void tick() {
		happiness -= 2;
		health -= 2;
		oilLevel -= 2;
	}

}
