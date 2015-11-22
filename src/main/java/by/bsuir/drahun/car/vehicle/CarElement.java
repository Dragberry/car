package by.bsuir.drahun.car.vehicle;

import java.awt.Graphics;

public abstract class CarElement {
	
	private int xAppletSize;

	private int yAppletSize;

	public CarElement(int xAppletSize, int yAppletSize) {
		this.xAppletSize = xAppletSize;
		this.yAppletSize = yAppletSize;
	}
	
	public void change() {
	}

	public abstract void draw(Graphics g);

	public int getXAppletSize() {
		return xAppletSize;
	}

	public int getYAppletSize() {
		return yAppletSize;
	}

	public void update(int xAppletSize, int yAppletSize) {
		this.xAppletSize = xAppletSize;
		this.yAppletSize = yAppletSize;
	}
}
