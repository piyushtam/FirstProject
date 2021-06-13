package java_Interview;

public class SumOfElements {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		int res=add(a);
		System.out.println(res);
		

	}
	
	public static int add(int[] arr) {
		
		int sum=0;
		
		for(int i : arr) {
			sum = sum + i;
			
		}
		
		return sum;
	}

}
