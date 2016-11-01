

import java.util.ArrayList;

public class BootCampAdministration {

	//Create a private ArrayList with object of BootCampCandidates with name anArrayListOfBootCamps
	private ArrayList<BootCampCandidates> list;
	
	//Create a constructor which receives an array with BootCampCandidate objects and 
	//initializes the anArrayListOfBootCamps ArrayList by adding all BootCampCandidate array's
	//elements in the the nArrayListOfBootCamps
	BootCampAdministration(BootCampCandidates[] a){
		list=new ArrayList<>();
		for (BootCampCandidates b:a)
			this.list.add(b);
	}
	
	//Create setters and getters for BootCampAdministration
	
	public ArrayList<BootCampCandidates> getList() {
		return this.list;}

	public void setList(ArrayList<BootCampCandidates> list) {
		this.list = list;}

	//create an int method that returns the size of anArrayListOfBootCamps
	public int size(){
		return this.list.size();}
	
	//Create a method that adds a new BootCampCandidate inside the ArrayList
	public void add(BootCampCandidates a){
		this.list.add(a);
		}
	
	//Create a method that removes a candidate by name and returns true if found or false if not
	//HINT: you have to use get() to get the object and equals to compare it
	public boolean remove(String name){
		for(int i=0;i<=list.size();i++){
				if (list.get(i).getName().equals(name))
						{this.list.remove(i);
						return true;
						}
			}
		return false;
	}
	
	//Create a method to search for a boot camp member by surname and returns a string with its information
	// if it's found and null if it's not found
	public String search(String surname){
		for(int i=0;i<list.size();i++){
			if (list.get(i).getSurname().equals(surname))
				return list.get(i).toString();}
		return null;
	}
	
	
	//Create a method that can change a bootcampers age by having as input its name and surname
	public void changeAge(String name, String surname, int age){
		for(int i=0;i<list.size();i++){
			if ((list.get(i).getName().equals(name))&&(list.get(i).getSurname().equals(surname)))
				list.get(i).setAge(age);
			}
	}
	public void print(){
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i).toString());
	}
}

