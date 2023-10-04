import java.util.Arrays;
public class find_Smallest {
	
	int[] Array = {1,3,6,4,7,9};
	
	public void find_Smallest() {
		
		int Smallest = Integer.MAX_VALUE;
		for(int i=0;i<Array.length;i++) {
			
			if(Array[i]<Smallest) {
				Smallest=Array[i];
			}
			
		}
		
		System.out.print(Smallest);
	}
		public void Using_Array() {
			
			Arrays.sort(Array);
			System.out.print(Array[0]);
		}

	public static void main(String[] args) {
		find_Smallest num = new find_Smallest();
		System.out.print("the Smallest num in the given Array: ");
		num.find_Smallest();
		
		System.out.println();
		System.out.print("the Smallest num in the given Array: ");
		num.Using_Array();
	}

	
}
