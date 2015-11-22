package by.bsuir.drahun.car.vehicle;

import java.awt.Graphics;

public class Door extends SymmetricCarElement {
	
	private boolean opened;

	public Door(int xAppletSize, int yAppletSize, boolean right) {
		super(xAppletSize, yAppletSize, right);
	}

	@Override
	public void draw(Graphics g) {
	}
	
	public boolean open() {
		opened = true;
		return opened;
	}
	
	public boolean close() {
		opened = false;
		return opened;
	}
	
	public boolean isOpened() {
		return opened;
	}

}
