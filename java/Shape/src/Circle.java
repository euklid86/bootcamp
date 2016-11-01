//Describes a circle
public class Circle extends Shape{
	//Atributes
	
	private int r;
	private double p=3.14;
	
	//Constractors
	
	Circle(){this.number_of_sides=0;}
	
	Circle(int r){
		this();
		this.r=0;
	}
	
	//Getters & Setters
	
	public int getR() {return r;}
	
	//toString
	
	@Override
	public String toString() {return "Circle [r=" + r + "]";}

	public void setR(int r) {this.r = r;}
	
	//Inherited methods
	
	public void draw(){}

	public double perimeter(){return 2*this.p*this.r;}
	
	public double area(){return this.p*this.r*this.r;}
	
	
}
