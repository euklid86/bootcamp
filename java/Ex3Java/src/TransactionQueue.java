import java.util.*;
public class TransactionQueue {
	private ArrayList<Transaction> list;
	
	TransactionQueue(){
		list=new ArrayList<>();
	}
	TransactionQueue(Transaction[] a){
		this();
		for(Transaction b:a){
			this.addTransaction(b);
		}
	}
	public Transaction get(int index){return this.list.get(index);}
	public int getSize(){return list.size();}
	public void addTransaction(Transaction b){this.list.add(b);}
	public void removeTransaction(Transaction b){this.list.remove(b);}
	public ArrayList getList(){return this.list;}
	public void setList(ArrayList list){this.list=list;}
	public void print(){
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i).toString());
	}
}
