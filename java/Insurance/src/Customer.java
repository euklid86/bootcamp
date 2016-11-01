import java.util.*;
public class Customer{
	private final int code;
	private static Customer[] customers = new Customer[10];
	private String name;
	private int yearofbirth;
	private String sex;
	private static int counter;

	public static int getCounter(){
		return counter;}

	public Customer(String name, int yearofbirth, String sex){
		this.name=name;
		this.yearofbirth=yearofbirth;
		this.sex=sex;
		this.counter++;
		this.code=this.counter;
		}
	public Customer(){
		this.name="John";
		this.yearofbirth=1980;
		this.sex="Male";
		this.counter++;
		this.code=this.counter;
		}
	public String toString(){
		String x="Code: "+this.code+", Name: "+this.name+", Year: "+this.yearofbirth+", Sex: "+this.sex;
		return x;
		}
	public int getCode(){
		return this.code;
		}
	public String getName(){
		return this.name;
		}
	public void setName(String name){
		this.name=name;}
	public int getYearofbirth(){
		return this.yearofbirth;
		}
	public void setYearofbirth(int yearofbirth){
		this.yearofbirth=yearofbirth;}
	public String geSex(){
		return this.sex;
		}
	public void setSex(String sex){
		this.sex=sex;}

}