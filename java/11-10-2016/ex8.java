import java.util.Scanner;
public class ex8{
	public static void main(String args[]){
		Scanner scanner = new Scanner (System.in);
		System.out.print("Give the a side: ");
		double a = scanner.nextDouble();
		System.out.print("Give the b side ");
		double b = scanner.nextDouble();
		System.out.print("Give the c side: ");
		double c = scanner.nextDouble();
		ex8 x = new ex8();
		double d=Math.pow(b,2)-(4*a*c);
		if (d<0){
			System.out.print("No real value solution exists. ");}
		else {
			double x1=((-b)+Math.sqrt((Math.pow(b,2)-(4*a*c))))/(2*a);
			double x2=((-b)-Math.sqrt((Math.pow(b,2)-(4*a*c))))/(2*a);
			System.out.printf("The solutions are :"+x1+" and "+x2);
			System.out.println(" ");
			}
		}
}