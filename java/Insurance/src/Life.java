import java.util.*;
public class Life extends Insurance{
	private int ammount;
	private static Life[] life = new Life[10];

	public void setAmmount(int ammount){
		this.ammount=ammount;}
	public int getAmmount(){
		return this.ammount;}
	@Override
	public String toString(){
		String x=super.toString()+", Ammount: "+this.ammount;
		return x;
		}
	Life(){
		super();
		this.ammount=1000;
		life[this.getInsCode()-1] = this;
		}
	Life(int ammount){
		super();
		this.ammount=ammount;
		life[this.getInsCode()-1] = this;
		}
}