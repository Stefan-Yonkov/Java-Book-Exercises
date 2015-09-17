package lesson_11Classes;

public class LibraryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library library = new Library("Siela");
		Book first = new Book("Black house", "Stephen King", "Ablex Publishing ", 1998, 789564213);
		Book second = new Book("Under the dome", "Stephen King", "Baen Books", 1989, 134564213);
		Book third = new Book("Fates and Furies", "Lauren Groff", "Collins", 1999, 987554213);
		Book fourth = new Book("Pet semetery", "Stephen King", "Deseret Book", 2014, 789564213);
		Book fifth = new Book("Fifty Shades of Grey", "E L James", "Ablex Publishing", 2000, 785588213);
		Book sixth = new Book("Revival", "Stephen King", "Caister Academic Press", 2009, 789564213);
		Book seventh = new Book("Mockingjay", "Suzanne Collins", "Ablex Publishing", 1965, 654564213);
		Book eighth = new Book("Divergent", "Veronica Roth", "Folio Society", 1985, 789569873);
		library.addBook(first);
		library.addBook(second);
		library.addBook(third);
		library.addBook(fourth);
		library.addBook(fifth);
		library.addBook(sixth);
		library.addBook(seventh);
		library.addBook(eighth);
		library.addBook(new Book("Divergent", "Veronica Roth", "Folio Society", 1985, 789569873));
		
		library.findBook("Stephen King");
		library.findBook("asdd");
		
		library.deleteBook("Stephen King");
		
		library.printBooksInfo();
		library.findBook("Stephen King");
	}

}
