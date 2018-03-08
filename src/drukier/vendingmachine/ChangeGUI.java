package drukier.vendingmachine;

import java.awt.*;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class ChangeGUI extends JFrame {
	private JTextField price = new JTextField("");
	private JTextField paid = new JTextField("");
	JTextField quarters = new JTextField();
	JTextField dimes = new JTextField();
	JTextField nickels = new JTextField();
	JTextField pennies = new JTextField();
	JButton makeChange = new JButton("Make Change");

	public ChangeGUI() {
		setTitle("Change Maker ");
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0, 2));

		panel.add(new JLabel("Price: ", SwingConstants.RIGHT));
		panel.add(price);
		panel.add(new JLabel("Paid: ", SwingConstants.RIGHT));
		panel.add(paid);
		panel.add(new JLabel("Change: ", SwingConstants.RIGHT));
		panel.add(makeChange);
		panel.add(new JLabel("Quarters: ", SwingConstants.RIGHT));
		panel.add(quarters);
		panel.add(new JLabel("Dimes: ", SwingConstants.RIGHT));
		panel.add(dimes);
		panel.add(new JLabel("Nickels: ", SwingConstants.RIGHT));
		panel.add(nickels);
		panel.add(new JLabel("Pennies: ", SwingConstants.RIGHT));
		panel.add(pennies);

		JButton button = new JButton("Button");
		button.addActionListener(this::makeChange);

	}

	public void makeChange(ActionEvent event) {
		Change change = VendingMachine.pay(Double.parseDouble(price.toString()),Double.parseDouble(paid.toString()));
		quarters.setText(Integer.toString(change.getQuarters()));
		dimes.setText(Integer.toString(change.getDimes()));
		nickels.setText(Integer.toString(change.getNickels()));
		pennies.setText(Integer.toString(change.getPennies()));
		
	}

	public static void main(String[] args) {
		new ChangeGUI().setVisible(true);
	}
}
