import java.util.Scanner;
public class ex7{
	public static void main(String args[]){
		Scanner scanner = new Scanner (System.in);
		System.out.print("Give the a side: ");
		double a = scanner.nextDouble();
		System.out.print("Give the b side ");
		double b = scanner.nextDouble();
		System.out.print("Give the c side: ");
		double c = scanner.nextDouble();
		ex7 x = new ex7();
		x.area(a,b,c);

		}

	public static void area(double a, double b, double c){
		double subtotal=(a+b+c)*(b+c-a)*(a-b+c)*(a+b-c);
		subtotal=Math.sqrt(subtotal);
		double total=1/(4*subtotal);
		System.out.printf("The area of the triangle is :"+total);
		System.out.println("");

	}
}