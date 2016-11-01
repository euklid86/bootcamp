import java.util.*;
public class Emploee{
	private String name;
	private String lastname;
	private int year;

	public void setName(String name){
		this.name=name;}
	public void setLast(String last){
		this.lastname=last;}
	public void setYear(int year){
		this.year=year;}
	public String getName(){
		return this.name;}
	public String getLast(){
		return this.lastname;}
	public int getYear(){
		return this.year;}
	public int getAge(){
		return 2016-this.year;
	}
	public String toString(){
		String message;
		message="Name: "+this.name+", Lastname: "+this.lastname+", Year of Birth: "+this.year+", Age: "+this.getAge();
		return message;}
}