package by.bsuir.drahun.car.client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import by.bsuir.drahun.car.vehicle.Car;

public class ButtonPanel extends JPanel {

	private static final long serialVersionUID = 4514689310078156856L;
	
	private JButton turnLightOn;
	
	private JButton turnLightOff;
	
	private JButton openDoors;
	
	private JButton closeDoors;
	
	private Car car;
	
	private JPanel canvas;
	
	public ButtonPanel(Car car, JPanel canvas) {
		this.car = car;
		this.canvas = canvas;
		add(getTurnLightOnBtn());
		add(getTurnLightOffBtn());
		add(getOpenDoorsBtn());
		add(getCloseDoorsBtn());
		
		addActionListeners();
	}
	
	private void addActionListeners() {
		getTurnLightOnBtn().addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				System.out.println("Btn light on");
				car.lightOn();
				canvas.repaint();
			}
		});
		
		getTurnLightOffBtn().addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				System.out.println("Btn light off");
				car.lightOff();
				canvas.repaint();
			}
		});
		
		getOpenDoorsBtn().addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				System.out.println("Btn open doors");
				car.openDoors();
				canvas.repaint();
			}
		});
		
		getCloseDoorsBtn().addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				System.out.println("Btn close doors");
				car.closeDoors();
				canvas.repaint();
			}
		});
		
	}

	public Car getCar() {
		return car;
	}
	
	public JButton getTurnLightOnBtn() {
		if(turnLightOn == null) {
			turnLightOn = new JButton("Turn Light On");
		}
		return turnLightOn;
	}
	
	public JButton getTurnLightOffBtn() {
		if(turnLightOff == null) {
			turnLightOff = new JButton("Turn Light Off");
		}
		return turnLightOff;
	}
	
	public JButton getOpenDoorsBtn() {
		if(openDoors == null) {
			openDoors = new JButton("Open doors");
		}
		return openDoors;
	}
	
	public JButton getCloseDoorsBtn() {
		if(closeDoors == null) {
			closeDoors = new JButton("Close doors");
		}
		return closeDoors;
	}
	
	public JPanel getCanvas() {
		return canvas;
	}

}
