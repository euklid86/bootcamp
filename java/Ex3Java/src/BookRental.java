import java.util.*;
public class BookRental extends Transaction{

	BookRental(){
		super();
	}
	
	BookRental(Book book, Date reqdate, Date serdate, User user){
		super(book, reqdate, serdate,user);
	}
	
	public void print(){
		System.out.println(this.toString());
	}
	@Override
	public String toString(){
		return "BookRental"+super.toString();
	}
	
}
