import java.util.*;
public class TestCustomer{
	public static void main (String args[]){
		Customer customer1 = new Customer("Name1",1980,"Male");
		Customer customer2 = new Customer("Name2",1981,"Female");
		Customer customer3 = new Customer("Name3",1982,"Male");
		Customer customer4 = new Customer("Name4",1983,"Male");
		Customer customer5 = new Customer("Name5",1984,"Male");
		Customer customer6 = new Customer("Name6",1985,"Female");
		Customer customer7 = new Customer("Name7",1986,"Male");
		Customer customer8 = new Customer("Name8",1987,"Female");
		Customer customer9 = new Customer("Name9",1988,"Male");
		Customer customer10 = new Customer("Name10",1989,"Male");

		Customer customers[] = {customer1, customer2, customer3, customer4, customer5,
								customer6, customer7, customer8, customer9, customer10};

		Health health1 = new Health();
		Health health2 = new Health();
		Health health3 = new Health();
		Health health4 = new Health();
		Health health5 = new Health();
		Health health6 = new Health();
		Health health7 = new Health();
		Health health8 = new Health();
		Health health9 = new Health();
		Health health10 = new Health();

		Health healths[] = {health1, health2, health3, health4, health5,
							health6, health7, health8, health9, health10,};

		Health.printAll();
String ans;
	do{
	System.out.println("************* Menu *************");
	System.out.println("1. Print all insurances.");
	System.out.println("2. Search insurances (by book customer code.)");
	System.out.println("3. Search insurances (by book insurance code.)");
	System.out.println("0. To Exit.");
	Scanner scanner = new Scanner (System.in);
	ans = scanner.nextLine();
		if (Integer.parseInt(ans)==1){
			Health.printAll();
			}
		if (Integer.parseInt(ans)==2){
			do{
				System.out.print("Give the Customer Code: ");
				String search=scanner.nextLine();
			}while((Customer.getCounter()<Integer.parseInt(ans)));
			Insurance.printInsurance(Integer.parseInt(ans));
			System.out.println("___________________________________________");
			}
		if (Integer.parseInt(ans)==3){
			do{
				System.out.print("Give the Insurance Code: ");
				String search=scanner.nextLine();
			}while((Insurance.getCount()<Integer.parseInt(ans)));
			Insurance.printInsurance(Integer.parseInt(ans));
			System.out.println("___________________________________________");
			}
		}while (Integer.parseInt(ans)!=0);
	}

}