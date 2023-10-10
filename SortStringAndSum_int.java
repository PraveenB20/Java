
public class SortStringAndSum_int {

	public static void main(String[] args) {
		
		String Given="Agni113";
		
		int sum=0;
		
		for(int i=0;i<Given.length();i++) {
			
			char ch = Given.charAt(i);
			
			if(Character.isDigit(ch)) {
				System.out.print(ch);
				
				sum=sum + Character.getNumericValue(ch);
			}
			
			
		}
		System.out.print("\n");
		System.out.println(sum);
		
		//For Printing String Separately
		
		System.out.println(Given.replaceAll("\\d", ""));
	}

}
