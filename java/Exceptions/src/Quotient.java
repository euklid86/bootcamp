import java.util.*;
public class Quotient{
	//Attributes
	private int numerator;
	private int denominator;

	//Constractors
	Quotient(){
		this.numerator=0;
		this.denominator=0;
	}

	Quotient(int numerator, int denominator){
		this.numerator=numerator;
		this.denominator=denominator;
	}

	//Setters & Getters
	public void setNumerator(int Numerator){this.numerator=numerator;}
	public int getNumerator(){return this.numerator;}
	public void setDenominator(int Denumerator){this.denominator=denominator;}
	public int getDenominator(){return this.denominator;}
	
	//Methods
	public double calcQuotient(int numerator, int denominator){return numerator/denominator;}

	public static void main(String[] args) throws NumberFormatException, ArithmeticException{
		System.out.println("Hello!");
		Quotient x = new Quotient();
		boolean success=false;
		while (!success) {
			try{
				System.out.println("Please give the Numerator:");
				Scanner scanner = new Scanner (System.in);
				String ans = scanner.nextLine();
				int numerator=Integer.parseInt(ans);
				System.out.println("Please give the Denominator:");
				ans = scanner.nextLine();
				int denominator=Integer.parseInt(ans);
				double result=x.calcQuotient(numerator,denominator);
				System.out.println("Result: "+result);
				success=true;
				}
			catch(NumberFormatException a){
				System.out.println("Wrong Input!");
				}
			catch(ArithmeticException a){
				System.out.println("Digit zero!");
				}
		}
	}

}
	