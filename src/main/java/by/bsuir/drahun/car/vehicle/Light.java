package by.bsuir.drahun.car.vehicle;

import java.awt.Color;
import java.awt.Graphics;

import by.bsuir.drahun.car.constant.Colors;

public class Light extends SymmetricCarElement {
	
	private int xCoor;
	
	private int yCoor;
	
	private int xSize;
	
	private int ySize;
	
	private boolean lightOn;

	public Light(int xAppletSize, int yAppletSize, boolean right) {
		super(xAppletSize, yAppletSize, right);
	}

	@Override
	protected void drawElement(Graphics g) {
		g.setColor(resolveColor());
		g.fillRect(xCoor, yCoor, xSize, ySize);
	}

	private Color resolveColor() {
		return isLightOn() ? Color.YELLOW : Colors.GLASS_COLOR;
	}
	
	public boolean turnOn() {
		lightOn = true;
		return lightOn;
	}

	public boolean turnOff() {
		lightOn = false;
		return lightOn;
	}
	
	public boolean isLightOn() {
		return lightOn;
	}

	@Override
	protected void update() {
		xSize = getX() / 20;
		ySize = getY() / 25;
		if (isRight()) {
			xCoor = getX() / 2 - getX() / 6;
		} else {
			xCoor = getX() / 2 + getX() / 6 - xSize;
		}
		yCoor = getY() / 2 +  getY() / 4;
	}
}
