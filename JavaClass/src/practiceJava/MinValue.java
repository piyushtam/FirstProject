package practiceJava;

public class MinValue {

	public static void main(String[] args) {
		
		int[] a = {40,3,50,10,7,20,9};
		
		int min1 = a[0];
		int min2 = a[0];
		
		for(int i=1; i<a.length; i++) {
			if(min1>a[i]) {
				min2=min1; //4,3
				min1=a[i]; //3,1
			}
			else if(min2>a[i]) {
				min2=a[i];
			}
		}
		System.out.println(min1);
		System.out.println(min2);

	}

}
