
public class ReverseWords_in_String {
	
	

	public static void main(String[] args) { 
		
		
		String str="There is noithing we can do";
		String reversed ="";
		
		String[] given= str.split(" ");
		
		
		for(int i=given.length-1;i>=0;i--) {
			
			
			reversed = reversed+given[i]+" ";
			
		}
		System.out.print(reversed);
	}

}
