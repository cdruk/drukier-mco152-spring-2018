package drukier.bibliography;

import java.awt.*;

import javax.swing.*;

public class InputMLA extends JFrame {

	private JTextField last = new JTextField("");
	private JTextField first = new JTextField("");
	private JTextField title = new JTextField("");
	private JTextField chapter = new JTextField("");
	private JTextField other_last = new JTextField("");
	private JTextField other_first = new JTextField("");
	private JTextField edition = new JTextField("");
	private JTextField volume = new JTextField("");
	private JTextField publisher = new JTextField("");
	private JTextField year = new JTextField("");
	private JTextField pages = new JTextField("");
	private JButton more = new JButton("Add Entry");
	private JButton done = new JButton("Format Bibliography");
	

	public InputMLA() {
		setTitle("Enter Bibliography Information");
		setSize(400, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0, 2));

		panel.add(new JLabel("Author Last Name*", SwingConstants.CENTER));
		panel.add(last);
		panel.add(new JLabel("Author First Name*", SwingConstants.CENTER));
		panel.add(first);
		panel.add(new JLabel("Title*", SwingConstants.CENTER));
		panel.add(title);
		panel.add(new JLabel("Chapter", SwingConstants.CENTER)); // optional
		panel.add(chapter);
		panel.add(new JLabel("Editor Last Name", SwingConstants.CENTER)); // optional
		panel.add(other_last);
		panel.add(new JLabel("Editor First Name", SwingConstants.CENTER)); // optional
		panel.add(other_first);
		panel.add(new JLabel("Edition", SwingConstants.CENTER)); // optional
		panel.add(edition);
		panel.add(new JLabel("Volume", SwingConstants.CENTER)); // optional
		panel.add(volume);
		panel.add(new JLabel("Publisher*", SwingConstants.CENTER));
		panel.add(publisher);
		panel.add(new JLabel("Year*", SwingConstants.CENTER));
		panel.add(year);
		panel.add(new JLabel("Pages", SwingConstants.CENTER)); // optional
		panel.add(pages);
		panel.add(new JLabel("", SwingConstants.CENTER));
		panel.add(more);
		panel.add(new JLabel("", SwingConstants.CENTER));
		panel.add(done);

		more.addActionListener(e -> {

		});

		done.addActionListener(e -> {

		});

		add(panel);

	}
}