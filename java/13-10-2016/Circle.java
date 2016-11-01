import java.util.*;
public class Circle{
	private int x;
	private int y;
	private int r;
	private static final double p=3.14;
	private static int number_of_circles;

public void setX(int x){
	this.x=x;}
public void setY(int y){
	this.y=y;}
public void setR(int r){
	this.r=r;}
public int getX(){
	return x;}
public int getY(){
	return y;}
public int getR(){
	return r;}
public Circle copy(){
	Circle a=new Circle();
	a.x=this.x;
	a.y=this.y;
	a.r=this.r;
	return a;
	}
public boolean concentric(Circle a){
	if ((this.x==a.x)&&(this.y==a.y))
		return true;
	else return false;
	}

Circle(){
	this.x=1;
	this.y=1;
	this.r=5;
	number_of_circles++;
	}
Circle(int x, int y){
	this.x=x;
	this.y=y;
	this.r=5;
	number_of_circles++;
	}
Circle(int x, int y, int r){
	this.x=x;
	this.y=y;
	this.r=r;
	number_of_circles++;
	}
public void print(){
	System.out.println(" I'm a circle at point ("+this.x+","+this.y+") with radius "+this.r);
	}
public double calculateArea(){
	double area=this.p*this.r*this.r;
	return area;
	}
public double calculatePerimeter(){
	double per=2*this.p*this.r;
	return per;
	}
public void print_num(){
	System.out.print(number_of_circles);}
}