import java.util.*;
public class Health extends Insurance{
	private int expense;
	private static Health[] health = new Health[10];

	public void setExpence(int expense){
		this.expense=expense;}
	public int getExpense(){
		return this.expense;}
	@Override
	public String toString(){
			String x=super.toString()+", Medical Expense: "+this.expense;
			return x;
		}
	Health(){
		super();
		this.expense=500;
		health[this.getInsCode()-1] = this;
		}	
	Health(int expense){
		super();
		this.expense=expense;
		health[this.getInsCode()-1] = this;
		}
}