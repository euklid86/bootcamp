import java.util.*;
public class ex3{
	public static void shift(int a[]){
			int x = a[9];
			for (int i=9;i>0;i--){
				a[i] = a[i-1];
				}
			a[0]=x;
			for (int i=0;i<10;i++)
			System.out.print(a[i]);
			System.out.println("");
	}

	public static void main(String args[]){
		int[] table = new int[]{1,2,3,4,5,6,7,8,9,10};
		ex3 x = new ex3();

		Scanner scanner = new Scanner (System.in);
		System.out.print("Enter the shift: ");
		int y = scanner.nextInt();
		for (int i=1;i<y;i++)
			x.shift(table);
	}


}