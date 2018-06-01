package drukier.bibliography;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Bibliography extends JFrame {
	private List<CitationEntry> bibliography;
	private String format;

	public Bibliography(List<CitationEntry> list, String format) {
		this.bibliography = list;
		this.format = format;
		CreateBibliography();
	}

	public void CreateBibliography() {
		setTitle("Your Bibliography");
		setSize(400, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));

		bibliography.forEach((Entry) -> panel.add(new JLabel(Entry.requestFormat(format))));
		
		add(panel);
		
	}

}
