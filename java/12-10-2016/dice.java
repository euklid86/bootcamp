import java.util.*;
public class dice{
	public static void main(String args[]){
		dice a = new dice();
		a.roll();
	}

	public static void roll(){
		int x=0;
		int y=0;
		int count=0;
		do{
		x = (int)(Math.random()*7);
		y = (int)(Math.random()*7);
		count++;

		}while ((x!=1) || (y!=1));
		System.out.print(x);
		System.out.print(" ");
		System.out.println(y);
		System.out.println(count);
	}
}