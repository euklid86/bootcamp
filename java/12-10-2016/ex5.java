import java.util.*;
public class ex5{
	public static boolean check(String a[]){
		if (a[0]==a[1] && a[1]==a[2])
			{System.out.println("WINNER "+a[0]);
			return true;}
		if (a[0]==a[3] && a[3]==a[7])
			{System.out.println("WINNER "+a[0]);
			return true;}
		if (a[1]==a[4] && a[4]==a[7])
			{System.out.println("WINNER "+a[1]);
			return true;}
		if (a[2]==a[5] && a[5]==a[8])
			{System.out.println("WINNER "+a[2]);
			return true;}
		if  (a[3]==a[4] && a[4]==a[5])
			{System.out.println("WINNER "+a[3]);
			return true;}
		if  (a[6]==a[7] && a[7]==a[8])
			{System.out.println("WINNER "+a[6]);
			return true;}
		if  (a[0]==a[4] && a[4]==a[8])
			{System.out.println("WINNER "+a[0]);
			return true;}
		if  (a[2]==a[4] && a[4]==a[6])
			{System.out.println("WINNER "+a[2]);
			return true;}
		else return false;
		}
	public static void draw(String a[]){
		int count=0;
		for (int i=0;i<9;i++){
				System.out.printf("|__"+a[i]+"__|");
				count++;
				if (count==3)
					{System.out.println("\n");
				count=0;
			}}

		}
	public static void main(String args[]){
		String[] table = new String[]{"1","2","3","4","5","6","7","8","9"};
		ex5 x = new ex5();
		Scanner scanner = new Scanner (System.in);
		int spot=0;
		int ans;
		int count=0;
		x.draw(table);
		System.out.println();
		do{
		if (!x.check(table)){
			do{
				System.out.print("Player O select place: ");
				ans = scanner.nextInt();}
			while ((table[ans-1]=="X")||(table[ans-1]=="O"));
			table[ans-1]="O";
			x.draw(table);
			System.out.println();
			}
		if (!x.check(table)){
			do{
				System.out.print("Player X select place: ");
				ans = scanner.nextInt();}
			while ((table[ans-1]=="X")||(table[ans-1]=="O"));
			table[ans-1]="X";
			x.draw(table);
			System.out.println();
			}
		}while (!x.check(table));
	}


}