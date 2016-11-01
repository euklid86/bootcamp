import java.util.*;
public class ex1{
	public static void main(String args[]){
		Scanner scanner = new Scanner (System.in);
		System.out.print("Give th 1st number: ");
		int a = scanner.nextInt();
		System.out.print("Give th 2nd number: ");
		int b = scanner.nextInt();
		ex1 x = new ex1();
		x.bootCamp(a,b);
	}

	public static void bootCamp(int a, int b){
		if (a<b){
			double ans=Math.abs(b-a);
			ans=Math.sqrt(ans);
			System.out.println((int)ans);}
		else {
			int ans=a+b;
			System.out.println(ans);
			}

	}
}