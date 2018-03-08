package drukier.dictionary;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;

import javax.swing.*;

public class DictionaryGui extends JFrame {
	private JTextField word = new JTextField("Insert word here.");
	private JButton define = new JButton("Define");
	private JTextArea definition = new JTextArea();
	private Dictionary dictionary;

	public DictionaryGui() throws FileNotFoundException {
		
		String myDictionary = "/Users/chana/Documents/Touro/Spring 2018/Computer Methodology/drukier-mco152-spring-2018/dictionary.txt";

		this.dictionary = new Dictionary(myDictionary);
		
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
			defineWord(e);
		});

		add(panel);
	}

	public void defineWord(ActionEvent event)  {
		definition.setText(dictionary.define(word.getText()));

	}

	public static void main(String[] args) throws FileNotFoundException {
		new DictionaryGui().setVisible(true);
	}
}