import java.util.Scanner;
public class ex10{
	public static void main(String args[]){
		Scanner scanner = new Scanner (System.in);
		System.out.print("Give the number of the tringular numbers: ");
		int ans = scanner.nextInt();
		int sum=0;
		for (int i=1; i<ans; i++){
			sum=sum+i;
			System.out.print(sum+" ");
			}
		System.out.println(" ");
		}


}