package drukier.hashdictionary;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;

import javax.swing.*;

public class DictionaryGui extends JFrame {
	JTextField word = new JTextField("Insert word here.");
	JButton define = new JButton("Define");
	JTextArea definition = new JTextArea();

	public DictionaryGui() {
		setTitle("Best Dictionary Ever");
		setSize(800, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());

		JPanel northPanel = new JPanel();
		northPanel.setLayout(new GridLayout(0, 2));
		northPanel.add(word, SwingConstants.CENTER);
		northPanel.add(define);
		panel.add(northPanel, BorderLayout.NORTH);

		panel.add(definition, BorderLayout.CENTER);

		define.addActionListener(e -> {
			try {
				defineWord(e);
			} catch (FileNotFoundException e1) {

				e1.printStackTrace();
			}
		});

		add(panel);
	}

	public void defineWord(ActionEvent event) throws FileNotFoundException {
		String myDictionary = "/Users/chana/Documents/Touro/Spring 2018/Computer Methodology/drukier-mco152-spring-2018/dictionary.txt";

		HashDictionary dictionary = new HashDictionary(myDictionary);

		definition.setText(dictionary.define(word.getText()));

	}

	public static void main(String[] args) {
		new DictionaryGui().setVisible(true);
	}
}