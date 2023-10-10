import java.util.Scanner;
public class NoOf_vowelsInaWord {
	
	public void Vowelfunction(String givenStr) {
		
		givenStr=givenStr.toLowerCase();
		int occurance=0;
		for(int i=0;i<givenStr.length();i++) {
			if(givenStr.charAt(i)=='a' || givenStr.charAt(i)=='e' || givenStr.charAt(i)=='i' || 
					givenStr.charAt(i)=='o' || givenStr.charAt(i)=='u') {
				occurance=occurance+1;
			}	
				
		}
		System.out.println(occurance);
		
		return;
		
	}

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Give a word?I will tell you how many vowels it has!");
		String givenStr=scan.nextLine();
		
		NoOf_vowelsInaWord vowel = new NoOf_vowelsInaWord();
		
		vowel.Vowelfunction(givenStr);
		
		scan.close();
		
	}

}
