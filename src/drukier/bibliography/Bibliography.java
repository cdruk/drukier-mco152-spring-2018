package drukier.bibliography;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Bibliography extends JFrame {
	private Map<String, CitationEntry> bibliography;

	public Bibliography(Map<String, CitationEntry> bibliography, String format) {
		this.bibliography = bibliography;
	}

	public void CreateBibliography() {
		setTitle("Your MLA Bibliography");
		setSize(400, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));

		Collection c = bibliography.values();
		Iterator itr = c.iterator();
		while (itr.hasNext()) {
			CitationEntry.FormatMLACitation()
		}

	}
}
