import java.util.*;
public class Library{
	private Book[] books = new Book[20];
	private AuthorList authorlist = new AuthorList();
	private TransactionQueue transactions;
	private TransactionHistory trans;

	public void setTransaction(TransactionQueue t){this.transactions=t;}
	public TransactionQueue getTransactions(){return this.transactions;}
	
	public void print(){transactions.print();}
	
	public void rentBook(BookRental r){transactions.addTransaction(r);}
	public void returnBook(BookReturn r){transactions.addTransaction(r);}
	
	public void printAvailableBooks(){
		for (int i=0;i<20;i++){
			if (this.books[i].isAvailable())
				System.out.println(this.books[i].toString());}
		}

	public void printBookDetails(String title){
		for (int i=0;i<20;i++){
			if (this.books[i].getTitle().equals(title))
				System.out.println(this.books[i].toString());
			}
		}
	public void printBookFromAuthor(String name){
		for (int i=0;i<20;i++){
			if (this.books[i].getAuthor().equals(name))
				System.out.println(this.books[i].toString());
			}
		}
	
	Library(Book books[]){
		for (int i=0;i<20;i++)
			this.books[i]=books[i];
		}
	
	Library(){}
}