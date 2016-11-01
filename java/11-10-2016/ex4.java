import java.util.Scanner;
public class ex4{
	public static void main(String args[]){
		Scanner scanner = new Scanner (System.in);
		System.out.print("Give the number: ");
		int ans = scanner.nextInt();
		if (ans<0)
			System.out.println("The number you have entered is under 0!");
		else
			factorial(ans);
	}

	public static void factorial(int x){
		int sum=1;
		for (int i=1; i<=x; i++){
			sum=sum*i;}
		System.out.printf("The factorial of %d is %d",x,sum);
		System.out.println("");

	}
}