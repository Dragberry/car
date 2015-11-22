package by.bsuir.drahun.car.vehicle;

public abstract class SymmetricCarElement extends CarElement {
	
	private boolean right;

	public SymmetricCarElement(int xAppletSize, int yAppletSize, boolean right) {
		super(xAppletSize, yAppletSize);
		this.right = right;
	}

	protected boolean isRight() {
		return right;
	}
	
	protected boolean isLeft() {
		return isRight();
	}
}
