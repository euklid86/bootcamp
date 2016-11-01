
public class User {
	private String name;
	private static int count;
	private final int id;
	private User next=null;
	
	public User(){
		this.count++;
		this.id=this.count;
	}
	public User(String name){
		this.name=name;
		this.count++;
		this.id=this.count;
	}
	
	public String getName(){return this.name;}
	public void setName(String name){this.name=name;}
	public int getId(){return id;}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + "]";
	}
	
	public void setNext(User user){this.next=user;}
	public User getNext(){return this.next;}
}
