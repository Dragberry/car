package by.bsuir.drahun.car.client;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JFrame;

import by.bsuir.drahun.car.vehicle.Car;
import by.bsuir.drahun.car.vehicle.Mersedes;

public class CarAppFrame extends JFrame {
	
	private CarCanvasPanel carCanvasPanel;
	
	private ButtonPanel btnPanel;
	
	private Car car;

	private static final long serialVersionUID = -4293530107899281126L;

	public void init() {
		setMinimumSize(new Dimension(1024, 768));
		setTitle("Car Application Client");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(new GridBagLayout());
		
		car = new Mersedes(getWidth(), getWidth());
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		gbc.fill = GridBagConstraints.BOTH;
		getContentPane().add(getCarCanvasPanel(car), gbc);
		
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 5;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.insets = new Insets(5, 5, 5, 5);
		getContentPane().add(getButtonPanel(car), gbc);
		
		setVisible(true);
		
	}
	
	public CarCanvasPanel getCarCanvasPanel(Car car) {
		if (carCanvasPanel == null) {
			carCanvasPanel = new CarCanvasPanel(car);
		}
		return carCanvasPanel;
	}
	
	public ButtonPanel getButtonPanel(Car car) {
		if (btnPanel == null) {
			btnPanel = new ButtonPanel(car, carCanvasPanel);
		}
		return btnPanel;
	}
	
}
