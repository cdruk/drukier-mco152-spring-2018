package drukier.bibliography;

public class CitationEntry {
	private String last;
	private String first;
	private String middle;
	private String title;
	private String chapter;
	private String other_last;
	private String other_first;
	private String publisher;
	private String year;
	private String city;
	private String state;
	private String pages;
	private String format;

	public CitationEntry(String last, String first, String middle, String title, String chapter, String other_last,
			String other_first, String publisher, String year, String city, String state, String pages) {
		this.last = last;
		this.first = first;
		this.middle = middle;
		this.title = title;
		this.chapter = chapter;
		this.other_last = other_last;
		this.other_first = other_first;
		this.publisher = publisher;
		this.year = year;
		this.city = city;
		this.state = state;
		this.pages = pages;
	}
	
	public void setFormat(String format) {
		this.format = format;
	}

	public void getFormat()
	{
		if (format == "MLA")
        {
			FormatMLACitation();
    		}
		else {
			FormatAPACitation();
		}
	}
	
	private String FormatMLACitation() {
		StringBuilder citation = new StringBuilder();
		if (last != "") {
			citation.append(upperCaseAllFirst(last + ", "));
		} else {
			return "Missing necessary value.";
		}
		if (first != "") {
			citation.append(upperCaseAllFirst(first + ". "));
		} else {
			return "Missing necessary value.";
		}
		if (chapter != "") {
			citation.append(upperCaseAllFirst("\"" + chapter + ".\" "));
		}
		if (title != "") {
			citation.append(upperCaseAllFirst(title + ". "));
		} else {
			return "Missing necessary value.";
		}
		if (other_last != null) {
			citation.append(upperCaseAllFirst("edited by " + other_last + ", "));
		}
		if (other_first != null) {
			citation.append(upperCaseAllFirst(other_first + ", "));
		}
		if (publisher != null) {
			citation.append(upperCaseAllFirst(publisher + ", "));
		} else {
			return "Missing necessary value.";
		}
		if (year != null) {
			citation.append(year);
		} else {
			return "Missing necessary value.";
		}
		if (city != null) {
			citation.append(upperCaseAllFirst(", " + city + ". "));
		} else {
			citation.append(". ");
		}
		return citation.toString();
	}

	private String FormatAPACitation() {

		StringBuilder citation = new StringBuilder();
		if (last != "") {
			citation.append(upperCaseAllFirst(last + ", "));
		} else {
			return "Missing necessary value.";
		}
		if (first != "") {
			citation.append(upperCaseAllFirst(first.charAt(0) + ". "));
		} else {
			return "Missing necessary value.";
		}
		if (middle != "") {
			citation.append(upperCaseAllFirst(middle.charAt(0) + ". "));
		}
		if (year != null) {
			citation.append("(" + year + "). ");
		} else {
			return "Missing necessary value.";
		}
		if (title != "") {
			citation.append(upperCaseFirst(title + ". "));
		} else {
			return "Missing necessary value.";
		}
		if (city != null) {
			citation.append(upperCaseAllFirst(city + ", "));
		} else {
			citation.append(". ");
		}
		if (state != null) {
			citation.append((state.toUpperCase() + ": "));
		} else {
			citation.append(". ");
		}
		if (publisher != null) {
			citation.append(upperCaseAllFirst(publisher + ". "));
		} else {
			return "Missing necessary value.";
		}
		return citation.toString();
	}

	public static String upperCaseFirst(String value) {
		char[] array = value.toCharArray();
		array[0] = Character.toUpperCase(array[0]);
		return new String(array);
	}

	public static String upperCaseAllFirst(String value) {
		char[] array = value.toCharArray();
		array[0] = Character.toUpperCase(array[0]);

		for (int i = 1; i < array.length; i++) {
			if (Character.isWhitespace(array[i - 1])) {
				array[i] = Character.toUpperCase(array[i]);
			}
		}
		return new String(array);
	}

}
