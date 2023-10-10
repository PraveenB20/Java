import java.util.Scanner;
public class Char_Occarance {

	public void UsingItration(String GivenString,char ToFind) {
		int Occarance=0;
		
		GivenString= GivenString.toLowerCase();
		String Tofind= Character.toString(ToFind).toLowerCase();
		
		for(int i=0;i<GivenString.length();i++) {
			if(GivenString.charAt(i)==Tofind.charAt(0))
				Occarance=Occarance+1;
		}
		System.out.print(Occarance);
		return;
		
	}
	
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("give a word:");
		String GivenString =scan.nextLine();
		System.out.println("give a Tofind:");
		char ToFind  =scan.next().charAt(0);
		Char_Occarance find = new Char_Occarance();
	
		find.UsingItration(GivenString, ToFind);
		scan.close();
	}

}
