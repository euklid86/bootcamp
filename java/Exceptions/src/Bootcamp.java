import java.util.*;
public class Bootcamp{
	public static void welcome(double d) throws AnotherDigitException,DigitException{
	if (d > 25) {
	    throw new DigitException("Digit higher than 25!");}
	else throw new AnotherDigitException("Digit lower or equal to 25!");
	}
	
	public static int bye(){
		try{Bootcamp.welcome(299.7);}
		catch(AnotherDigitException a){return 605;}
		catch(DigitException b){return 230;} 
		return 0;
	}
}
