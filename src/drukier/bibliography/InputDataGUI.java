package drukier.bibliography;

import java.awt.*;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

import javax.swing.*;

public class InputDataGUI extends JFrame {
	private JTextField last = new JTextField("");
	private JTextField first = new JTextField("");
	private JTextField middle = new JTextField(""); // optional
	private JTextField title = new JTextField("");
	private JTextField subtitle = new JTextField(""); // optional
	private JTextField chapter = new JTextField(""); // optional
	private JTextField other_last = new JTextField(""); // optional
	private JTextField other_first = new JTextField(""); // optional
	private JTextField edition = new JTextField(""); // optional
	private JTextField volume = new JTextField(""); // optional
	private JTextField publisher = new JTextField("");
	private JTextField year = new JTextField("");
	private JTextField city = new JTextField("");
	private JTextField state = new JTextField("");
	private JTextField pages = new JTextField(""); // optional

	private JButton entry = new JButton("Add Entry");
	private JButton done = new JButton("Format Bibliography");

	private Map<String, CitationEntry> bibliography = new HashMap<String, CitationEntry>(); // lastfirstyear, citation
	private Map<String, CitationEntry> alphabatized = new LinkedHashMap<String, CitationEntry>();

	public InputDataGUI() {
		setTitle("Enter Bibliography Information");
		setSize(500, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0, 2));

		panel.add(new JLabel("Author Last Name*^", SwingConstants.CENTER));
		panel.add(last);
		panel.add(new JLabel("Author First Name*^", SwingConstants.CENTER));
		panel.add(first);
		panel.add(new JLabel("Author Middle Name", SwingConstants.CENTER));
		panel.add(middle);

		panel.add(new JLabel("Title*^", SwingConstants.CENTER));
		panel.add(title);
		panel.add(new JLabel("Subtitle", SwingConstants.CENTER));
		panel.add(subtitle);
		panel.add(new JLabel("Chapter", SwingConstants.CENTER));
		panel.add(chapter);

		panel.add(new JLabel("Editor Last Name", SwingConstants.CENTER));
		panel.add(other_last);
		panel.add(new JLabel("Editor First Name", SwingConstants.CENTER));
		panel.add(other_first);

		panel.add(new JLabel("Edition", SwingConstants.CENTER));
		panel.add(edition);
		panel.add(new JLabel("Volume", SwingConstants.CENTER));
		panel.add(volume);

		panel.add(new JLabel("Publisher*^", SwingConstants.CENTER));
		panel.add(publisher);
		panel.add(new JLabel("Year*^", SwingConstants.CENTER));
		panel.add(year);
		panel.add(new JLabel("City^", SwingConstants.CENTER));
		panel.add(city);
		panel.add(new JLabel("State^", SwingConstants.CENTER));
		panel.add(state);
		panel.add(new JLabel("Pages", SwingConstants.CENTER));
		panel.add(pages);

		panel.add(new JLabel("* = required field for MLA", SwingConstants.CENTER));
		panel.add(new JLabel("^ = required field for APA", SwingConstants.CENTER));

		panel.add(new JLabel("", SwingConstants.CENTER));
		panel.add(entry);
		panel.add(new JLabel("", SwingConstants.CENTER));
		panel.add(done);

		entry.addActionListener(e -> {
			CitationEntry entry = new CitationEntry(last.getText(), first.getText(), middle.getText(), title.getText(), subtitle.getText(), 
					chapter.getText(), other_last.getText(), other_first.getText(), edition.getText(), volume.getText(), publisher.getText(), 
					year.getText(), city.getText(), state.getText(), pages.getText());
			bibliography.put(last.getText() + first.getText() + year.getText(), entry);
			last = new JTextField("");
			first = new JTextField("");
			middle = new JTextField(""); 
			title = new JTextField("");
			subtitle = new JTextField("");
			chapter = new JTextField("");
			other_last = new JTextField("");
			other_first = new JTextField("");
			edition = new JTextField("");
			volume = new JTextField(""); 
			publisher = new JTextField("");
			year = new JTextField("");
			city = new JTextField("");
			state = new JTextField("");
			pages = new JTextField("");
		});

		done.addActionListener(e -> {
			setAlphabatized(bibliography.entrySet().stream().sorted(Map.Entry.comparingByKey())
					.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue,
							LinkedHashMap::new)));
			new BibliographyGUI().setVisible(true);
		});

		add(panel);

	}

	public static void main(String[] args) throws FileNotFoundException {
		new InputDataGUI().setVisible(true);
	}

	public Map<String, CitationEntry> getAlphabatized() {
		return alphabatized;
	}

	public void setAlphabatized(Map<String, CitationEntry> alphabatized) {
		this.alphabatized = alphabatized;
	}

	

}
