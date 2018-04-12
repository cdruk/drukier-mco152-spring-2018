package drukier.bibliography;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;
import java.util.Map;

import javax.swing.*;

public class BibliographyStyleGUI extends JFrame {

	private JButton MLA = new JButton("MLA");
	private JButton APA = new JButton("APA");
	private InputDataGUI inputDataGUI;

	public BibliographyStyleGUI(InputDataGUI inputDataGUI) {
		this.inputDataGUI = inputDataGUI;
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

		MLA.addActionListener(this::openMLA);

		APA.addActionListener(this::openAPA);

		add(panel);
	}

	private void openMLA(ActionEvent e) {
		Bibliography formattedBibliography = new Bibliography(inputDataGUI.getAlphabatized(), "MLA");
		formattedBibliography.setVisible(true);
	}

	private void openAPA(ActionEvent e) {
		Bibliography formattedBibliography = new Bibliography(inputDataGUI.getAlphabatized(), "APA");
		formattedBibliography.setVisible(true);
	}

}