package by.bsuir.drahun.car.vehicle;

import java.awt.Graphics;

public class Mersedes extends CarElement implements Car {
	
	private Light rigthLigth;
	
	private Light leftLight;
	
	private Door rightDoor;
	
	private Door leftDoor;
	
	public Mersedes(int xAppletSize, int yAppletSize) {
		super(xAppletSize, yAppletSize);
		recalculate(xAppletSize, yAppletSize);
	}

	private void recalculate(int xAppletSize, int yAppletSize) {
		update(xAppletSize, yAppletSize);
		rightDoor = new Door(xAppletSize, yAppletSize, true);
		leftDoor = new Door(xAppletSize, yAppletSize, false);
		rigthLigth = new Light(xAppletSize, yAppletSize, true);
		leftLight = new Light(xAppletSize, yAppletSize, false);
	}

	public void openRightDoor() {
		rightDoor.open();
	}

	public void openLeftDoor() {
		leftDoor.open();
	}

	public void openDoors() {
		rightDoor.open();
		leftDoor.open();
	}
	
	public void closeDoors() {
		rightDoor.close();
		leftDoor.close();
	}

	public void lightOn() {
		rigthLigth.turnOn();
		leftLight.turnOn();
	}

	public void lightOff() {
		rigthLigth.turnOff();
		leftLight.turnOff();
	}

	@Override
	public void draw(Graphics g) {
		rightDoor.draw(g);
		leftDoor.draw(g);
		rigthLigth.draw(g);
		leftLight.draw(g);
	}

}
