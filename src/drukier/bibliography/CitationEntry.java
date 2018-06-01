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


	public CitationEntry(String last, String first, String middle, String title, String chapter, String other_last,
			String other_first, String publisher, String year, String city, String state) {
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
	}

	public String requestFormat(String format) {
		if ("MLA".equals(format)) {
			return formatMLACitation();
		} else {
			return formatAPACitation();
		}

	}

	private String formatMLACitation() {
		StringBuilder citation = new StringBuilder();
		if (!last.equals("")) {
			citation.append(upperCaseAllFirst(last + ", "));
		} else {
			return "Missing necessary value.";
		}
		if (!first.equals("")) {
			citation.append(upperCaseAllFirst(first + ". "));
		} else {
			return "Missing necessary value.";
		}
		if (!chapter.equals("")) {
			citation.append(upperCaseAllFirst("\"" + chapter + ".\" "));
		}
		if (!title.equals("")) {
			citation.append(upperCaseAllFirst(title + ". "));
		} else {
			return "Missing necessary value.";
		}
		if (!other_last.equals("")) {
			citation.append("edited by " + upperCaseFirst(other_last) + ", ");
		}
		if (!other_first.equals("")) {
			citation.append(upperCaseAllFirst(other_first + ", "));
		}
		if (!publisher.equals("")) {
			citation.append(upperCaseAllFirst(publisher + ", "));
		} else {
			return "Missing necessary value.";
		}
		if (!year.equals("")) {
			citation.append(year);
		} else {
			return "Missing necessary value.";
		}
		if (!city.equals("")) {
			citation.append(upperCaseAllFirst(", " + city + ". "));
		} else {
			citation.append(". ");
		}
		return citation.toString();
	}

	private String formatAPACitation() {

		StringBuilder citation = new StringBuilder();
		if (!last.equals("")) {
			citation.append(upperCaseAllFirst(last + ", "));
		} else {
			return "Missing necessary value.";
		}
		if (!first.equals("")) {
			citation.append((first.substring(0, 1).toUpperCase() + ". "));
		} else {
			return "Missing necessary value.";
		}
		if (!middle.equals("")) {
			citation.append((middle.substring(0, 1).toUpperCase() + ". "));
		}
		if (!year.equals("")) {
			citation.append("(" + year + "). ");
		} else {
			return "Missing necessary value.";
		}
		if (!title.equals("")) {
			citation.append(upperCaseFirst(title + ". "));
		} else {
			return "Missing necessary value.";
		}
		if (!city.equals("")) {
			citation.append(upperCaseAllFirst(city + ", "));
		} else {
			citation.append(". ");
		}
		if (!state.equals("")) {
			citation.append((state.toUpperCase() + ": "));
		} else {
			citation.append(". ");
		}
		if (!publisher.equals("")) {
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
