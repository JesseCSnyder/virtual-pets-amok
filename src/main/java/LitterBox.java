
public class LitterBox {

	protected int fillLevel;

	public LitterBox(int fillLevel) {
		this.fillLevel = fillLevel;
	}

	public int getFillLevel() {
		return fillLevel;
	}

	public void emptyLitterBox() {
		fillLevel = 0;
	}

	public void fillBox() {
		fillLevel += 5;
	}

}
