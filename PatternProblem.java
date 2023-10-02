
public class PatternProblem {

	public static void main(String[] args) {
		PatternProblem Triangle= new PatternProblem();
		
	
		//Triangle.HollowTriangle();
		Triangle.inverseTriangle();
		
	}
	void inverseTriangle() {
		int N=5;
		int outer=1;
		int inner=N;

		for(int i=0;i<N;i++) {
			
			for(int j=0;j<outer;j++) {
				System.out.print(" ");
				
			}
			for(int x=0;x<inner;x++) {
				if(x==0 || i==0 || x==inner-1 ) {
				System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			inner--;
			outer+=1;
			System.out.println();
			
		}
	}
	void Tringle() {
		int N=5;
		int outer=N;
		int inner=1;
		for(int i=0;i<N;i++) {
			
			for(int j=0;j<outer;j++) {
				
				System.out.print(" ");
				
			}
			for(int x=0;x<inner;x++) {
				
				System.out.print("* ");
			}
			System.out.println();
			inner++;
			outer--;
		}
	}
	void HollowTriangle() {
		int N=5;
		int outer=N;
		int inner=1;
		for(int i=0;i<N;i++) 
		{
			
			for(int j=0;j<outer;j++) {
				
				System.out.print(" ");
				
			}
			for(int x=0;x<inner;x++) {
				
				if(x==0 || i==4 || x==i) {
				System.out.print("* ");
				}
				else
					System.out.print("  ");
				
			}
			
			System.out.println();
			inner++;
			outer--;
		}
		
}

}

