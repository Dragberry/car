package by.bsuir.drahun.car.vehicle;

import java.awt.Graphics;

import by.bsuir.drahun.car.constant.Colors;

public class Door extends SymmetricCarElement {
	
	private boolean opened;
	
	private int[] xPoints;
	
	private int[] yPoints;
	
	public Door(int xAppletSize, int yAppletSize, boolean right) {
		super(xAppletSize, yAppletSize, right);
	}

	@Override
	protected void drawElement(Graphics g) {
		if (isOpened()) {
			g.setColor(Colors.BODY_COLOR);
			g.fillPolygon(xPoints, yPoints, 5);
		}
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

	@Override
	protected void update() {
		xPoints = new int[5];
		yPoints = new int[5];
		if (!isRight()) {
			xPoints[0] = getX() / 2 - getX() / 6 - getX() / 48;
			xPoints[1] = getX() / 2 - getX() / 6 - getX() / 48; 
			xPoints[2] = getX() / 2 - getX() / 6 - getX() / 48 - getX() / 8;
			xPoints[3] = getX() / 2 - getX() / 6 - getX() / 48 - getX() / 8;
			xPoints[4] = getX() / 2 - getX() / 6 - getX() / 48 - getX() / 35;
		} else {
			xPoints[0] = getX() / 2 + getX() / 6 + getX() / 48;
			xPoints[1] = getX() / 2 + getX() / 6 + getX() / 48; 
			xPoints[2] = getX() / 2 + getX() / 6 + getX() / 48 + getX() / 8;
			xPoints[3] = getX() / 2 + getX() / 6 + getX() / 48 + getX() / 8;
			xPoints[4] = getX() / 2 + getX() / 6 + getX() / 48 + getX() / 35;
		}
		yPoints[0] = getY() / 2 +  getY() / 4 - getY() / 24;
		yPoints[1] = getY() / 2 +  getY() / 4 - getY() / 24 + getY() / 7;
		yPoints[2] = getY() / 2 +  getY() / 4 - getY() / 24 + getY() / 7;
		yPoints[3] = getY() / 2 +  getY() / 4 - getY() / 24 - getY() / 12;
		yPoints[4] = getY() / 2 +  getY() / 4 - getY() / 24 - getY() / 12;
	}

}
