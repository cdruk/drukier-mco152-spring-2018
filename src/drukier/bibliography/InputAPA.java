package drukier.bibliography;

import java.awt.GridLayout;

import javax.swing.*;

public class InputAPA extends JFrame {
	
	private JTextField last = new JTextField("");
	private JTextField first = new JTextField("");
	private JTextField middle = new JTextField(""); // optional
	private JTextField year = new JTextField("");
	private JTextField title = new JTextField("");
	private JTextField subtitle = new JTextField(""); // optional
	private JTextField city = new JTextField("");
	private JTextField state = new JTextField("");
	private JTextField publisher = new JTextField("");
	
	public InputAPA() {
		setTitle("Enter Bibliography Information");
		setSize(400, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0, 2));
		
		panel.add(new JLabel("Author Last Name*"), SwingConstants.CENTER);
		panel.add(last);
		panel.add(new JLabel("Author First Name*"), SwingConstants.CENTER);
		panel.add(first);
		panel.add(new JLabel("Author Middle Name"), SwingConstants.CENTER);
		panel.add(middle);
		panel.add(new JLabel("Year*"), SwingConstants.CENTER);
		panel.add(year);
		panel.add(new JLabel("Title*"), SwingConstants.CENTER);
		panel.add(title);
		panel.add(new JLabel("Subtitle"), SwingConstants.CENTER);
		panel.add(subtitle);
		panel.add(new JLabel("City*"), SwingConstants.CENTER);
		panel.add(city);
		panel.add(new JLabel("State*"), SwingConstants.CENTER);
		panel.add(state);
		panel.add(new JLabel("Publisher*"), SwingConstants.CENTER);
		panel.add(publisher);
		
		add(panel);
	}
}