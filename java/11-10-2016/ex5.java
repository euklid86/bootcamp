import java.util.Scanner;
public class ex5{
	public static void main(String args[]){
		Scanner scanner = new Scanner (System.in);
		int x,y,z;
		do{
		System.out.print("Give 1st Dimention: ");
		x = scanner.nextInt();
		System.out.print("Give 2nd Dimention: ");
		y = scanner.nextInt();
		System.out.print("Give 3d Dimention: ");
		z = scanner.nextInt();}
		while (check(x,y,z)==false);
		}

	public static boolean check(int x, int y, int z){
		int max= Math.max(x,Math.max(y,z));
		int perimeter=per(x,y,z);
		int def=perimeter-max;
		if (max>def){
			System.out.println("The perimeter: "+perimeter);
			return true;}
		else {
			System.out.println("The values are not valid! ");
			return false;}
		}
	public static int per(int x, int y, int z){
		return x+y+z;
		}


}