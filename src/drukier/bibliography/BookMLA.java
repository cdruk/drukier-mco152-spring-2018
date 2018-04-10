package drukier.bibliography;

//Authors.
//Title of the source.
//Title of container,
//Other contributors,
//Version,
//Numbers,
//Publisher,
//Publication date,
//Location.

//Author. Title. Title of container (self contained if book), 
//Other contributors (translators or editors), Version (edition), Number (vol. and/or no.), 
//Publisher, Publication Date, Location (pages, paragraphs URL or DOI).

public class BookMLA {

	private String last;
	private String first;
	private String title;
	private String chapter; // optional
	private String other_last; // optional
	private String other_first; // optional
	private String edition; // optional
	private String volume; // optional
	private String publisher;
	private String year;
	private String pages; // optional

	public BookMLA(String last, String first, String title, String publisher, String year) {
		this.last = last;
		this.first = first;
		this.title = title;
		this.publisher = publisher;
		this.year = year;
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public String getPages() {
		return pages;
	}

	public void setPages(String pages) {
		this.pages = pages;
	}

}
