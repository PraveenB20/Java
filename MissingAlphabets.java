
import java.util.HashSet;


public class MissingAlphabets {

	public static void main(String[] args) {
		
		String Given ="ksjbfkvb";
		
		Given = Given.toLowerCase();
		
		Given = Given.replaceAll(" ","");
		
		String[] givenString = Given.split("");
		
		String[] alphabets ="abcdefghijklmnopqrstuvwxyz".split("");
		
		HashSet<String> set1 = new HashSet<String>();
		
		for(String s:givenString) {
			
			set1.add(s);
		}
			
		HashSet<String> set2 = new HashSet<String>();
		for(String c:alphabets) {
			set2.add(c);
		}
		
		set2.removeAll(set1);
		
		System.out.print(set2);
	}

}
