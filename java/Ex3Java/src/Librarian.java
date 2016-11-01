import java.util.*;
public class Librarian{
	Library library=new Library();

	public void findMeBooksFromAuthor(String name){this.library.printBookFromAuthor(name);}
	public void findMeAvailableBooks(){this.library.printAvailableBooks();}
	public void findMeBook(String title){this.library.printBookDetails(title);}
	public void rentBook(BookRental a){this.library.rentBook(a);}
	public void returnBook(BookReturn a){this.library.returnBook(a);}
	
	Librarian(Library library){
		this.library=library;}
}