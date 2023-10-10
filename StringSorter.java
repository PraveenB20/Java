
public class StringSorter {
	String givenStr = "strvu374y";

	
	public void NumSorter() {

		int total=0;

		for(int i=0;i<givenStr.length();i++) {
			char ch=givenStr.charAt(i);
			if(Character.isDigit(ch)) {
				total=total+Character.getNumericValue(ch);
			}
			
			
		}
		System.out.print(total);
	}
	
	public void StringSort() {
		System.out.print(givenStr.replaceAll("\\d",""));
		
	}
	
	public static void main(String[] args) {
		StringSorter Sort = new StringSorter();
		Sort.NumSorter();
		System.out.print("\n");
		Sort.StringSort();
		// TODO Auto-generated method stub

		
	}

}
