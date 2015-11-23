package by.bsuir.drahun.car.vehicle;

import java.awt.Graphics;

public class Mersedes extends CarElement implements Car {
	
	private CarBody body;
	
	private Light rigthLigth;
	
	private Light leftLight;
	
	private Door rightDoor;
	
	private Door leftDoor;
	
	private Wheel rightWheel;
	
	private Wheel leftWheel;
	
	public Mersedes(int xAppletSize, int yAppletSize) {
		super(xAppletSize, yAppletSize);
		body = new CarBody(xAppletSize, yAppletSize);
		rightDoor = new Door(xAppletSize, yAppletSize, true);
		leftDoor = new Door(xAppletSize, yAppletSize, false);
		rigthLigth = new Light(xAppletSize, yAppletSize, true);
		leftLight = new Light(xAppletSize, yAppletSize, false);
		rightWheel = new Wheel(xAppletSize, yAppletSize, true);
		leftWheel = new Wheel(xAppletSize, yAppletSize, false);
		addElement(rightDoor);
		addElement(leftDoor);
		addElement(leftWheel);
		addElement(rightWheel);
		addElement(body);
		addElement(leftLight);
		addElement(rigthLigth);
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
		System.out.println("Mersedes light on");
		rigthLigth.turnOn();
		leftLight.turnOn();
	}

	public void lightOff() {
		System.out.println("Mersedes light off");
		rigthLigth.turnOff();
		leftLight.turnOff();
	}

	@Override
	protected void drawElement(Graphics g) {

	}

	@Override
	protected void update() {
		// TODO Auto-generated method stub
		
	}

}
