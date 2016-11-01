import java.util.*;
public class Book{
	private String title;
	private Author author;
	private String isbn;
	private int physical_copies;
	private int available_copies;
	private int times_rented;
	private static int count;
	private Book next = null;
	
	public Book getNext() {return next;}
	public void setNext(Book next) {this.next = next;}
	Book(String title, Author author, String isbn, int physical, int available, int times){
		this.title=title;
		this.author=author;
		this.isbn=isbn;
		this.physical_copies=physical;
		this.available_copies=available;
		this.times_rented=times;
		this.count++;
	}
	Book(){
		this.count++;
	}
	public void copy(Book a){
		a.title=this.title;
		a.author=author;
		a.isbn=this.isbn;
		a.physical_copies=this.physical_copies;
		a.available_copies=this.available_copies;
		a.times_rented=this.times_rented;
}
	public int printCount(){
		return count;}
	public String toString(){
		String x="Title: "+this.title+" Author: "+this.author.toString();
		return x;
		}
	public String getAuthor(){
		return this.author.toString();
		}
	public void setAuthor(String name){
		this.author.setName(name);
		}
	public void rentPhysicalCopy(){
		if (this.available_copies>0){
			System.out.println("There is available copy.");
			this.times_rented++;
			this.available_copies--;}
		else System.out.println("There is no available copy.");
		}
	public boolean isAvailable(){
		if (available_copies>0)return true;
		else return false;
		}
	public boolean hasAuthor(String name){
		if (name==this.author.toString())
			return true;
		else return false;
		}
	public void setTitle(String title){
		this.title=title;}
	public String getTitle(){
		return this.title;
		}
	public void setIsbn(String isbn){
		this.isbn=isbn;}
	public String getIsbn(){
		return this.isbn;
		}
	public void setTimes(int times){
		this.times_rented=times;
		}
	public int getTimes(){
		return this.times_rented;
		}
	public void setPhysical(int copies){
		this.physical_copies=copies;
		}
	public int getPhysical(){
		return physical_copies;
		}
	public void setAvailable(int copies){
		this.available_copies=copies;
		}
	public int getAvailable(){
		return available_copies;
		}
}