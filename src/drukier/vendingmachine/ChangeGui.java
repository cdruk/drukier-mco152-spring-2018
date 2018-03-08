package drukier.vendingmachine;

import java.awt.*;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class ChangeGui extends JFrame {
	private JTextField price = new JTextField("");
	private JTextField paid = new JTextField("");
	private JTextField quarters = new JTextField();
	private JTextField dimes = new JTextField();
	private JTextField nickels = new JTextField();
	private JTextField pennies = new JTextField();
	JButton makeChange = new JButton("Make Change");

	public ChangeGui() {
		setTitle("Vending Machine");
		setSize(300, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0, 2));

		panel.add(new JLabel("Price:\t\t\t\t$ ", SwingConstants.RIGHT));
		panel.add(price);
		panel.add(new JLabel("Paid:\t\t\t\t$ ", SwingConstants.RIGHT));
		panel.add(paid);
		panel.add(new JLabel("Pay! ", SwingConstants.RIGHT));
		panel.add(makeChange);
		panel.add(new JLabel("Quarters: ", SwingConstants.RIGHT));
		panel.add(quarters);
		panel.add(new JLabel("Dimes: ", SwingConstants.RIGHT));
		panel.add(dimes);
		panel.add(new JLabel("Nickels: ", SwingConstants.RIGHT));
		panel.add(nickels);
		panel.add(new JLabel("Pennies: ", SwingConstants.RIGHT));
		panel.add(pennies);

		makeChange.addActionListener(this::makeChange);

		add(panel);
	}

	public void makeChange(ActionEvent event) {
		Change change = VendingMachine.pay(Double.parseDouble(price.getText()), Double.parseDouble(paid.getText()));
		quarters.setText(Integer.toString(change.getQuarters()));
		dimes.setText(Integer.toString(change.getDimes()));
		nickels.setText(Integer.toString(change.getNickels()));
		pennies.setText(Integer.toString(change.getPennies()));

	}

	public static void main(String[] args) {
		new ChangeGui().setVisible(true);
	}
}
