package by.bsuir.drahun.car.client;

import java.awt.Graphics;

import javax.swing.JPanel;

import by.bsuir.drahun.car.vehicle.Car;

public class CarCanvasPanel extends JPanel {

	private static final long serialVersionUID = -4572239333381131678L;
	
	private Car car;
	
	public CarCanvasPanel(Car car) {
		this.car = car;
	}
	
	public Car getCar() {
		return car;
	}
	
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		car.update(getWidth(), getHeight());
		System.out.println(getWidth() + " " + getHeight());
		car.draw(g);
	}

}
