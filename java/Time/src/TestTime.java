
public class TestTime {
	public static void main(String[] args){
		TimeComparator x = new TimeComparator();
		TimeCom a= new TimeCom(50,80,45);
		TimeCom b= new TimeCom(22,10,46);
		System.out.println(a.toString());
		x.compare(a,b);
	}
}
