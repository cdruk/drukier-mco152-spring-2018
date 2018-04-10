package drukier.bibliography;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;

import javax.swing.*;

public class BibliographyGUI extends JFrame {

	private JButton MLA = new JButton("MLA");
	private JButton APA = new JButton("APA");

	public BibliographyGUI() {
		setTitle("Chose Citation Format");
		setSize(400, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());

		JPanel northPanel = new JPanel();
		northPanel.add(new JLabel("Please select a Citation Format"), SwingConstants.CENTER);
		panel.add(northPanel, BorderLayout.NORTH);

		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(new GridLayout(0, 2));
		centerPanel.add(APA, SwingConstants.CENTER);
		centerPanel.add(MLA, SwingConstants.CENTER);
		panel.add(centerPanel, BorderLayout.CENTER);

		MLA.addActionListener(e -> {
			openMLA(e);
		});

		APA.addActionListener(e -> {
			openAPA(e);
		});

		add(panel);

	}

	private void openMLA(ActionEvent e) {
		new InputMLA().setVisible(true);
	}

	private void openAPA(ActionEvent e) {

	}

	public static void main(String[] args) throws FileNotFoundException {
		new BibliographyGUI().setVisible(true);
	}
}