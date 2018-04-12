package drukier.bibliography;

import java.awt.BorderLayout;
import java.awt.Component;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class APABibliography extends JFrame {
	private Map<String, CitationEntry> bibliography;

	public APABibliography(Map<String, CitationEntry> bibliography) {
		this.bibliography = bibliography;

	}

	public void CreateBibliography() {
		setTitle("Your MLA Bibliography");
		setSize(400, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));

		Set<String> keys = bibliography.keySet();
		for (String k : keys) {
			panel.add(FormatCitation(), getComponent(0));

		}

	}

	public String FormatCitation() {
		StringBuilder citation = new StringBuilder();

		return null;

	}
}