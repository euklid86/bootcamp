import java.util.*;
public class BookList {
	private Book first;
	
	BookList(Book[] books){
		for (Book a:books)
			this.add(a);
	}
	
	BookList(){}
	
	public void add(Book a){
		if (this.first==null){
			this.first=a;
		}
		else {
			Book current=this.first;
			while (current.getNext()!=null)
				current=current.getNext();
			current.setNext(a);	
		}
			
	}
	
	public void print(){
		if (this.first==null)
			System.out.print("Empty list.");
		else{ Book current=this.first;
			System.out.println(current.toString());
			while (current.getNext()!=null){
				current=current.getNext();
				System.out.println(current.toString());
			}
		}
	}
	
	public void removeItem(Book a){
		if (this.first==null)
			System.out.println("Empty list!");
		else if (this.first==a)
			this.first = this.first.getNext();		
		else{
			Book current=this.first;
			while (current.getNext()!=a)
				{current=current.getNext();}
			current.setNext(current.getNext().getNext());
				}
			}
		}
