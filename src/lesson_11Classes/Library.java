package lesson_11Classes;

import java.util.ArrayList;
import java.util.Iterator;

public class Library {
	
	private String name;
	private ArrayList<Book> books = new ArrayList<>();
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Book> getBooks() {
		return books;
	}
	
	
	public Library(String name) {
		super();
		this.name = name;
	}
	
	public void addBook(Book book){
		
		books.add(book);
	}
	
	public void findBook(String author){
		boolean bookFound = false;
		for (Book book : books) {
			if (book.getAuthor().equalsIgnoreCase(author)) {
				System.out.println("Book found: ");
				book.bookInfo(book);
				System.out.println();
				bookFound = true;
			}
		}
		if (!bookFound) {
			System.out.println("No books found!");
			System.out.println();
		}
	}
	
	public void deleteBook(String author){
		Iterator<Book> i = books.iterator();
		while (i.hasNext()) {
			Book b = i.next();
			if (b.getAuthor().equalsIgnoreCase(author)) {
				i.remove();
			}
		}
	}
	
	public void printBooksInfo(){
		for (Book book : books) {
			book.bookInfo(book);
			System.out.println();
		}
	}
	
	
	
	

}
