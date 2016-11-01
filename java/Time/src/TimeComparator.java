import java.util.Comparator;
public class TimeComparator extends TimeCom implements Comparator<TimeCom>{
	public int compare(TimeCom a, TimeCom b){
		int result=a.getHour()-b.getHour();
		if (result>0){
			System.out.println("The first hour is bigger by "+result+" hours");
			return result;}
		else if (result<0){
			System.out.println("The second time is bigger by "+(result*(-1))+" hours");
			return result*(-1);}
		int result2=a.getMinute()-b.getMinute();
		if (result2>0){
			System.out.println("The first hour is bigger by "+result2+" minutes");
			return result2;}
		if (result2<0){
			System.out.println("The second time is bigger by "+(result2*(-1))+" minutes");
			return result2*(-1);}
		int result3=a.getSecond()-b.getSecond();
		if (result3>0){
			System.out.println("The first hour is bigger by "+result3+" seconds");
			return result3;}
		if (result3<0){
			System.out.println("The second time is bigger by "+(result3*(-1))+" seconds");
			return result3*(-1);}
		return 0;
		}
	}