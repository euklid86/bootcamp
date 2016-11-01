import java.util.Scanner;
public class ex6{
	public static void main(String args[]){
		Scanner scanner = new Scanner (System.in);
		System.out.print("Enter the shift: ");
		int x = scanner.nextInt();
		System.out.print("Enter the phrase: ");
		String phrase = scanner.next();
		char a=phrase.charAt(0);
		int ascii=(int)a;
		int ascii2=0;
		String phrase2="";
		String phrase3="";
		ascii=ascii%26;
		for (int i=0; i<phrase.length(); i++){
			a=phrase.charAt(i);
			ascii=(int)a;
			ascii2=ascii+x;
			if (ascii2>90)
				a=(char)(ascii2-26);
			else a=(char)ascii2;
			System.out.print(a);
			phrase2=phrase2+a;
			}
		System.out.println("");

		for (int i=0; i<phrase.length(); i++){
			a=phrase2.charAt(i);
			ascii=(int)a;
			ascii2=ascii-x;
			if (ascii2<65)
				a=(char)(ascii2+26);
			else a=(char)ascii2;
			System.out.print(a);
			phrase3=phrase3+a;
			}
		System.out.println("");
		}
}