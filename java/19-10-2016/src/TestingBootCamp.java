

public class TestingBootCamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create boot camp members
		BootCampCandidates member1 = new BootCampCandidates("Stefanos", "Georgiou", 38);
		BootCampCandidates member2 = new BootCampCandidates("Antonis", "Gkortzis", 40);
		BootCampCandidates member3 = new BootCampCandidates("Maria", "Kehagia", 40);
		BootCampCandidates member4 = new BootCampCandidates("Marianna", "Skiada", 45);
		BootCampCandidates member5 = new BootCampCandidates("Anna", "Hapeshi", 25);
		BootCampCandidates member6 = new BootCampCandidates("Fisayo", "Caleb", 29);
		BootCampCandidates member7 = new BootCampCandidates("Baptiste", "Louis", 24);
		BootCampCandidates member8 = new BootCampCandidates("Alexander", "De Masi", 25);
		BootCampCandidates member9 = new BootCampCandidates("Iqbal", "Ahmed", 35);
		BootCampCandidates member10 = new BootCampCandidates("Vlad", "Cristea", 27);
		
		//Adding all member in a BootCampCandidate array
		BootCampCandidates[] bootCampMembers = {member1, member2, member3, member4, member5, member6, member7, member8, member9, member10};
	
		//Create a BootCampAdministration object and pass the array of bootCampMembers as an argument
		BootCampAdministration admin = new BootCampAdministration(bootCampMembers);
		
		//Print all BootCamp member's information
		admin.print();
		
		
		//Add yourself as a Bootcamp candidate name, surname, and age
		BootCampCandidates euk = new BootCampCandidates("Euklid","Michael",30);
		admin.add(euk);
		admin.print();
		//Remove from the list member Marios if exist print message "success" if not "failed to find"
		String test=admin.search("Marios");
		if (test!=null){
			System.out.println("Succes!");
			admin.remove("Marios");}
		else System.out.println("Faild to find!");;
			
		//Remove from list member Vlad and Marianna
		admin.remove("Vlad");
		admin.remove("Marianna");
		
		//Show information for member with surname "Louis"
		System.out.println(admin.search("Louis"));
		
		//Change age for member with name "Fisayo" and surname "Caleb" to age of 28
		admin.changeAge("Fisayo", "Caleb", 28);
		
		//Print all members again
		admin.print();
	}

}
