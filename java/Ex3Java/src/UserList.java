
public class UserList {
	private User first;
	
	public void add(User new_user){
		if (this.first==null)
			this.first=new_user;
		else {
			User current= this.first;
			while (current.getNext()!=null)
				current=current.getNext();
		current.setNext(new_user);}
	}
	
	public void remove(User user){
		if (this.first==null)
			System.out.println("Empty List!");
		else if (this.first==user)
			this.first=this.first.getNext();
		else {
			User current = this.first;
			while(current.getNext()!=user)
				current=current.getNext();
			current.setNext(current.getNext().getNext());
		}
	}
	
	public void print(){
		if (this.first==null)
			System.out.println("Empty list!");
		else{
			User current=this.first;
			while (current.getNext()!=null){
				current=current.getNext();
				System.out.println(current.toString());
			}
		}
	}
}
