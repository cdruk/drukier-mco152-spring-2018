package drukier.bibliography;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MLABibliography {
	private Map<String, CitationEntry> bibliography;

	public MLABibliography(Map<String, CitationEntry> bibliography) {
		this.bibliography = bibliography;
	}

	public Map<String, CitationEntry> SortBibliography() {
		Map<String, CitationEntry> alphebatized = bibliography.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue,
						LinkedHashMap::new));
		return alphebatized;
	}

}
