import java.util.Scanner;
public class ex11{
	public static void main(String args[]){
		Scanner scanner = new Scanner (System.in);
		System.out.print("Give the number of the tringular numbers: ");
		int ans = scanner.nextInt();
		int sum=1;
		for (int i=1; i<=ans; i++){
			System.out.print(i*(i+1)+" ");
			}
		System.out.println(" ");
		}


}