import java.util.Scanner;

public class ReverseAstring {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter a String:");
		String str=scanner.nextLine();
		ReverseString(str);
		charReverseString(str);
		
	}
	public static void ReverseString(String str) {
		StringBuffer buffer = new StringBuffer();
		buffer.append(str);
		System.out.println(buffer.reverse());
	}
	
	public static void charReverseString(String str) {
		String reversed="";
		char[] ch= str.toCharArray();
		for(int i= ch.length-1;i>=0;i--) {
			reversed= reversed+ch[i];
		}
		System.out.print(reversed);
		
	}

}
