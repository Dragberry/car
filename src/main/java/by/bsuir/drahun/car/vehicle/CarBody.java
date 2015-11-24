package by.bsuir.drahun.car.vehicle;

import java.awt.Graphics;

import by.bsuir.drahun.car.constant.Colors;

public class CarBody extends CarElement {
	
	private int xCoor;
	private int yCoor;
	private int xSize;
	private int ySize;
	
	private int bumpXCoor;
	private int bumpYCoor;
	private int bumpXSize;
	private int bumpYSize;
	
	private int gridXCoor;
	private int gridYCoor;
	private int gridXSize;
	private int gridYSize;
	
	private int[] glassX;
	private int[] glassY;
	

	public CarBody(int xAppletSize, int yAppletSize) {
		super(xAppletSize, yAppletSize);
	}

	@Override
	protected void drawElement(Graphics g) {
		drawFrontGlass(g);
		drawFrontPart(g);
		drawBumper(g);
		drawGrid(g);

	}

	private void drawGrid(Graphics g) {
		g.setColor(Colors.GRID_COLOR);
		g.fillRoundRect(gridXCoor, gridYCoor, gridXSize, gridYSize, 15, 15);
	}

	private void drawFrontGlass(Graphics g) {
		g.setColor(Colors.GLASS_COLOR);
		g.fillPolygon(glassX, glassY, 4);
		
	}

	private void drawBumper(Graphics g) {
		g.setColor(Colors.BLACK_COLOR);
		g.fillRoundRect(bumpXCoor, bumpYCoor, bumpXSize, bumpYSize, 20, 20);
	}

	private void drawFrontPart(Graphics g) {
		g.setColor(Colors.BODY_COLOR);
		g.fillRoundRect(xCoor, yCoor, xSize, ySize, 20, 20);
	}

	@Override
	protected void update() {
		glassX = new int[4];
		glassY = new int[4];
		
		xCoor = getX() / 2 - getX() / 6 - getX() / 48;
		yCoor = getY() / 2 +  getY() / 4 - getY() / 24;
		xSize = (getX() / 6 + getX() / 48) * 2;
		ySize = getY() / 7;
		
		bumpXCoor = getX() / 2 - getX() / 6 - getX() / 40;
		bumpYCoor = getY() / 2 +  getY() / 4 + getY() / 25;
		bumpYSize = getY() / 30;
		bumpXSize = (getX() / 6 + getX() / 40) * 2;
		
		gridXCoor = getX() / 2 - getX() / 16 - getX() / 40;
		gridXSize = (getX() / 16 + getX() / 40) * 2;
		gridYSize = getY() / 25;
		gridYCoor = getY() / 2 +  getY() / 4;
		
		glassX[0] = getX() / 2 - getX() / 6 - getX() / 48 + 20;
		glassX[1] = getX() / 2 - getX() / 6 - getX() / 48 + 20 + getX() / 35;
		glassX[2] = getX() / 2 - getX() / 6 - getX() / 48 + xSize - (20 + getX() / 35);
		glassX[3] = getX() / 2 - getX() / 6 - getX() / 48 + xSize - 20;
	
		glassY[0] = glassY[3] = getY() / 2 +  getY() / 4 - getY() / 24;
		glassY[1] = glassY[2] = getY() / 2 +  getY() / 4 - getY() / 24 - getY() / 12;
		
	}

}
