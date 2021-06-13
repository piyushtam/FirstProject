package practiceJava;

public class MaxValue {

	public static void main(String[] args) {
		
		int[] a = {1,3,3,6,9,4};
		int max1=0;
		int max2=0;
		
		for(int i=0; i<a.length; i++) {
			if(max1<a[i]) {
				max2=max1; //0,1,3
				max1=a[i]; //1,3,6
				
			}
			else if(max2<a[i]) {
				max2=a[i];
			}
			
		}
		System.out.println(max1);
		System.out.println(max2);

	}

}
