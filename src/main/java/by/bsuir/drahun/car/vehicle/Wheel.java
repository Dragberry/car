package by.bsuir.drahun.car.vehicle;

import java.awt.Graphics;

import by.bsuir.drahun.car.constant.Colors;

public class Wheel extends SymmetricCarElement {
	
	private int xCoor;
	
	private int yCoor;
	
	private int xSize;
	
	private int ySize;

	public Wheel(int xAppletSize, int yAppletSize, boolean right) {
		super(xAppletSize, yAppletSize, right);
	}

	@Override
	protected void drawElement(Graphics g) {
		g.setColor(Colors.BLACK_COLOR);
		g.fillRoundRect(xCoor, yCoor, xSize, ySize, 20, 20);
	}

	@Override
	protected void update() {
		xSize = getX() / 20;
		ySize = getY() / 6;
		if (isRight()) {
			xCoor = getX() / 2 - getX() / 6;
		} else {
			xCoor = getX() / 2 + getX() / 6 - xSize;
		}
		yCoor = getY() / 2 +  getY() / 4;

	}

}
