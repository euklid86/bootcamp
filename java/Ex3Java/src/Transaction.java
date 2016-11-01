import java.util.*;
public class Transaction {
	private Book book;
	private Date reqdate;
	private Date serdate;
	private User user;
	private static int count;
	private final int id;
	
	public Transaction(Book book, Date reqdate, Date serdate, User user){
		this.book=book;
		this.reqdate=reqdate;
		this.serdate=serdate;
		this.user=user;
		this.count++;
		this.id=count;
	}
	
	public Transaction(){
		this.count++;
		this.id=count;
	}
	
	public void setBook(Book book){this.book=book;}
	public Book getBook(){return this.book;}
	public void setRequestDate(Date reqdate){this.reqdate=reqdate;}
	public Date getRequestDate(){return this.reqdate;}
	public void setServedDate(Date serdate){this.serdate=serdate;}
	public Date getServedtDate(){return this.serdate;}
	public void setUser(User user){this.user=user;}
	public User getUser(){return this.user;}

	public String toString() {
		return "Transaction [book=" + book + ", reqdate=" + reqdate + ", serdate=" + serdate + ", user_id=" + user.getId()
				+ ", id=" + id + "]";}
	
	
	
}
