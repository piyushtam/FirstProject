
public class SecondLargest {

	public static void main(String[] args) {
		
		int[] A = {2,4,13,8,9,16};
		
		int temp;
		
		for(int i=0; i<A.length; i++ ) {
			
			for(int j = i+1; j<A.length; j++) {
				
				if(A[i]<A[j]) {
					
					temp=A[i];
					A[i]=A[j];
					A[j]=temp;
				}
					
			}
			
			
		}
		System.out.println("Second largest number: "+A[1]);

	}

}
