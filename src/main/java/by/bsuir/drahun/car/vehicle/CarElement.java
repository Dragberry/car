package by.bsuir.drahun.car.vehicle;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public abstract class CarElement {
	
	private int xAppletSize;

	private int yAppletSize;
	
	private List<CarElement> elements = new ArrayList<CarElement>();

	public CarElement(int xAppletSize, int yAppletSize) {
		this.xAppletSize = xAppletSize;
		this.yAppletSize = yAppletSize;
		update();
	}
	
	public void change() {
	}
	
	public void addElement(CarElement element) {
		elements.add(element);
	}
	
	public List<CarElement> getElements() {
		return elements;
	}
	
	protected abstract void drawElement(Graphics g);

	public void draw(Graphics g) {
		for (CarElement element : elements) {
			element.draw(g);
		}
		drawElement(g);
	}

	public int getX() {
		return xAppletSize;
	}

	public int getY() {
		return yAppletSize;
	}

	public void update(int xAppletSize, int yAppletSize) {
		this.xAppletSize = xAppletSize;
		this.yAppletSize = yAppletSize;
		for (CarElement element : elements) {
			element.update(xAppletSize, yAppletSize);
		}
		update();
	}
	
	protected abstract void update();
}
