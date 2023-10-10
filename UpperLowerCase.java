
public class UpperLowerCase {

	public static void main(String[] args) {
		
		String given="ABBKBFISBISD";
		
		char[] CharArray = given.toCharArray();
		
		for(int i =0;i<given.length();i++) {
			
			if(CharArray[i]>=65 && CharArray[i]<=90) {
				
				CharArray[i] = (char) (CharArray[i]+32);
				
			}
			
		}
		for(int i=0;i<CharArray.length;i++)
			System.out.print(CharArray[i]);
		
		System.out.println();
		//for to upperCase
		
		String input ="khbsbvsrbbs";
		
		char[] inputArray = input.toCharArray();
		
		for(int i=0;i<input.length();i++) {
			
			if(inputArray[i]>=97 && inputArray[i]<=122) {
				
				inputArray[i]=(char)(inputArray[i]-32);
				
			}
			
		}
		for(int i=0;i<inputArray.length;i++) {
			
			System.out.print(inputArray[i]);
			
		}
		
	}

}
