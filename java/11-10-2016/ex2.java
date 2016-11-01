import java.util.Scanner;
public class ex2{
	public static void main(String args[]){
			int sum=0;
			Scanner scanner = new Scanner (System.in);
			System.out.print("Give the fiftys: ");
			int ans = scanner.nextInt();
			sum=sum+(ans*50);
			System.out.print("Give the twentys: ");
			ans = scanner.nextInt();
			sum=sum+(ans*20);
			System.out.print("Give the tens: ");
			ans = scanner.nextInt();
			sum=sum+(ans*10);
			System.out.print("Give the fives: ");
			ans = scanner.nextInt();
			sum=sum+(ans*5);
			System.out.print("Give the twos: ");
			ans = scanner.nextInt();
			sum=sum+(ans*2);
			System.out.print("Give the ones: ");
			ans = scanner.nextInt();
			sum=sum+ans;
			System.out.println("Total is "+sum);
	}
}