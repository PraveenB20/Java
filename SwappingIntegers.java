import java.util.Scanner;

public class SwappingIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		SwappingIntegers numbers = new SwappingIntegers();
		numbers.WithoutThirdInteger();
		System.out.print("\n");
		numbers.UsingMandD();
		
	}
	
	 void WithThirdInteger() {
		int num1=10,num2=15;
		System.out.print("num1="+num1+"\nnum2="+num2+"\n");
		int temp;
		temp = num1;
		num1=num2;
		num2=temp;
		System.out.print("AfterSwapping\n");
		System.out.print("num1="+num1+"\nnum2="+num2+"\n");
		
	}
	 // Using Addition and subtraction.
	 
	 void WithoutThirdInteger() {
		 int num1=10,num2=15;
			System.out.print("num1="+num1+"\nnum2="+num2+"\n");
			num1=num1-num2;
			num2=num1+num2;
			num1=num2-num1;
			System.out.print("AfterSwapping\n");
			System.out.print("num1="+num1+"\nnum2="+num2+"\n");
	 }
	 void UsingMandD() {
		 // Using Multipication and division.
	
			 int num1=10,num2=15;
				System.out.print("num1="+num1+"\nnum2="+num2+"\n");
				num1=num1*num2;
				num2=num1/num2;
				num1=num1/num2;
				System.out.print("AfterSwapping\n");
				System.out.print("num1="+num1+"\nnum2="+num2+"\n");
		 
	 }

}
