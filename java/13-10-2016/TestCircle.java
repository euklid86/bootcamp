import java.util.*;
public class TestCircle{
	public static void main(String args[]){
		Circle a=new Circle(5,5,10);
		Circle b=a.copy();
		a.setX(5);
		a.setY(5);
		a.setR(15);
		a.print();
		b.print();
		if (a.concentric(b))
			System.out.println("The circles are co-centric!");
		else System.out.println("The circles are NOT co-centric!");
		}

	}