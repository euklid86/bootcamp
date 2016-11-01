//The class describes a rectangle
public class Rectangle extends Shape{
	private int length;
	private int width;
	
	// Getters and setters
	public int getLength() {return length;}
	public void setLength(int length) {this.length = length;}
	public int getWidth() {return width;}
	public void setWidth(int width) {this.width = width;}
	
	// Contractors
	Rectangle(){
		this.number_of_sides=2;
		this.length=0;
		this.width=0;
	}
	
	Rectangle(int length, int width){
		this();
		this.length=length;
		this.width=width;
	}
	
	// Inherited methods
	
	public double area(){
		return this.width*this.length;
	}
	
	public double perimeter(){
		return (this.length*2)+(this.width*2);
	}
	
	// Methods
	
	@Override
	public String toString() {return "Rectangle [length=" + length + ", width=" + width + "]";}
	
	public boolean areEqual(Rectangle a){
		if (this.equals(a)) return true;
		else return false;
	}
	
	public boolean isSquare(){
		if (this.width==this.length) return true;
		else return false;
	}
	
	public Rectangle copy(){
		Rectangle a = new Rectangle();
		a.width=this.width;
		a.length=this.length;
		return a;
	}
	
	public void draw(){
		for (int i=0;i<this.length;i++){
			System.out.print("*");
			System.out.print(" ");
		}
		System.out.println();
		for (int i=0;i<this.width;i++){
			System.out.print("*");
			for (int j=1;j<(this.length*2)-2;j++)
				System.out.print(" ");
			System.out.println("*");
		}
		for (int i=0;i<this.length;i++){
			System.out.print("*");
			System.out.print(" ");}
	}
}
