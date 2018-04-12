package drukier.bibliography;

public class CitationEntry {
	private String last;
	private String first;
	private String middle;
	private String title;
	private String subtitle;
	private String chapter;
	private String other_last;
	private String other_first;
	private String edition;
	private String volume;
	private String publisher;
	private String year;
	private String city;
	private String state;
	private String pages;

	public CitationEntry(String last, String first, String middle, String title, String subtitle, String chapter,
			String other_last, String other_first, String edition, String volume, String publisher, String year,
			String city, String state, String pages) {
		this.last = last;
		this.first = first;
		this.middle = middle;
		this.title = title;
		this.subtitle = subtitle;
		this.chapter = chapter;
		this.other_last = other_last;
		this.other_first = other_first;
		this.edition = edition;
		this.volume = volume;
		this.publisher = publisher;
		this.year = year;
		this.city = city;
		this.state = state;
		this.pages = pages;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getMiddle() {
		return middle;
	}

	public void setMiddle(String middle) {
		this.middle = middle;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public String getChapter() {
		return chapter;
	}

	public void setChapter(String chapter) {
		this.chapter = chapter;
	}

	public String getOther_last() {
		return other_last;
	}

	public void setOther_last(String other_last) {
		this.other_last = other_last;
	}

	public String getOther_first() {
		return other_first;
	}

	public void setOther_first(String other_first) {
		this.other_first = other_first;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPages() {
		return pages;
	}

	public void setPages(String pages) {
		this.pages = pages;
	}

}
