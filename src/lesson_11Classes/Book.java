package lesson_11Classes;

public class Book {
	
	private String title;
	private String author;
	private String publishers;
	private int yearOfPublishing;
	private int ISBN;
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublishers() {
		return publishers;
	}
	public void setPublishers(String publishers) {
		this.publishers = publishers;
	}
	public int getYearOfPublishing() {
		return yearOfPublishing;
	}
	public void setYearOfPublishing(int yearOfPublishing) {
		this.yearOfPublishing = yearOfPublishing;
	}
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	
	public Book(String title, String author, String publishers,
			int yearOfPublishing, int iSBN) {
		super();
		this.title = title;
		this.author = author;
		this.publishers = publishers;
		this.yearOfPublishing = yearOfPublishing;
		ISBN = iSBN;
	}
	
	public void bookInfo(Book book){
		System.out.printf("Title: %s \n"
						+ "Author: %s \n"
						+ "Publisher: %s \n"
						+ "Published in: %s \n"
						+ "ISBN: %s \n",book.getTitle(),book.getAuthor(),book.getPublishers(),book.getYearOfPublishing(),book.getISBN());
	}
	
	
	

}
