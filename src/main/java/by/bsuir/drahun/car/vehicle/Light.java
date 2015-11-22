package by.bsuir.drahun.car.vehicle;

import java.awt.Color;
import java.awt.Graphics;

public class Light extends SymmetricCarElement {
	
	private int xCoor;
	
	private int yCoor;
	
	private int xSize;
	
	private int ySize;
	
	private boolean lightOn;

	public Light(int xAppletSize, int yAppletSize, boolean right) {
		super(xAppletSize, yAppletSize, right);
		xSize = getXAppletSize() / 20;
		ySize = getYAppletSize() / 25;
		if (isRight()) {
			xCoor = getXAppletSize() / 2 - getXAppletSize() / 6;
		} else {
			xCoor = getXAppletSize() / 2 + getXAppletSize() / 6 - xSize;
		}
		yCoor = getYAppletSize() / 2 +  getYAppletSize() / 4;
		
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(resolveColor());
		g.fillRect(xCoor, yCoor, xSize, ySize);
	}

	private Color resolveColor() {
		return isLightOn() ? Color.YELLOW : Color.GRAY;
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
}
