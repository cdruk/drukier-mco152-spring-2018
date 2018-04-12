package drukier.bibliography;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Bibliography extends JFrame {
	private Map<String, CitationEntry> bibliography;
	private String format;

	public Bibliography(Map<String, CitationEntry> bibliography, String format) {
		this.bibliography = bibliography;
		this.format = format;
		CreateBibliography();
	}

	public void CreateBibliography() {
		setTitle("Your Bibliography");
		setSize(400, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));

		bibliography.forEach((k, v) -> v.setFormat(format));
		bibliography.forEach((k, v) -> panel.add(new JLabel(v.getFormat())));
		
		add(panel);
		
	}

}
