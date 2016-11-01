
public class TestRectangle {
	public static void main(String[] args){
		Shape rec1 = new Rectangle(2,3);
		Rectangle rec2 = new Rectangle(8,8);
		Rectangle a = (Rectangle)rec1;
		System.out.println(rec2.areEqual(a));
		rec2.draw();
	}
}
