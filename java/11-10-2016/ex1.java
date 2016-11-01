public class ex1{
	public static void main(String args[]){
		for (int i=1; i<10; i++){
			for (int x=0; x<9-i; x++){
				System.out.print("0");
				}
			for (int x=0; x<i; x++){
				System.out.print(i);
				}
		System.out.println("");
		}
	}
}