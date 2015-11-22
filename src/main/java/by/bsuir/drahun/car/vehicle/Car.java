package by.bsuir.drahun.car.vehicle;

import java.awt.Graphics;

public interface Car {

	void openRightDoor();
	
	void openLeftDoor();
	
	void openDoors();
	
	void closeDoors();
	
	void lightOn();
	
	void lightOff();
	
	void draw(Graphics g);

	void update(int width, int height);
}
