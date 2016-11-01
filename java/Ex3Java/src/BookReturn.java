import java.util.*;
public class BookReturn extends Transaction{

	BookReturn(){
		super();
	}
	
	BookReturn(Book book, Date reqdate, Date serdate, User user){
		super(book, reqdate, serdate, user);
	}
	
	public void print(){
		System.out.print(this.toString());
	}

	@Override
	public String toString() {
		return "BookReturn"+super.toString();
	}
	
	
}
