import java.util.Scanner;
public class ex3{
	public static void main(String args[]){
		Scanner scanner = new Scanner (System.in);
		System.out.print("Give the TIV: ");
		int ans = scanner.nextInt();
	if (check(ans)== true)System.out.println("Tax Identification Number valid.");
	else System.out.println("Tax Identification Number NOT valid.");

	}

	public static boolean check(int x){
		int sum=0;
		int last=x%10;
		for (int i=1; i<=8; i++){
			x=x/10;
			sum+= (x%10)*(Math.pow(2,i));
		}
		sum=sum%11;
		sum=sum%10;
		if (sum==last)
			return true;
		else
			return false;
	}
}