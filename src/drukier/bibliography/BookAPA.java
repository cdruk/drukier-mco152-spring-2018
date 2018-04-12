package drukier.bibliography;

//Last, F. M. (Date Published). Book title. City, State: Publisher.
//Author, A. A. (Year of publication). Title of work: Capital letter also for subtitle. Location: Publisher.

public class BookAPA {

	private String last;
	private String first;
	private String middle; // optional
	private String year;
	private String title;
	private String subtitle; // optional
	private String city;
	private String state;
	private String publisher;

	public BookAPA(String last, String first, String middle, String year, String title, String subtitle, String city,
			String state, String publisher) {
		super();
		this.last = last;
		this.first = first;
		this.middle = middle;
		this.year = year;
		this.title = title;
		this.subtitle = subtitle;
		this.city = city;
		this.state = state;
		this.publisher = publisher;
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

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
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

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}



}
