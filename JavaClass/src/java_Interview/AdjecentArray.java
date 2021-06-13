package java_Interview;

public class AdjecentArray {

	public static void main(String[] args) {
		//Max difference between any adjacent index in array
		
		int[] a = {1,4,8,15,17,30};
		int max=0;
		int res = 0;
		for(int i=0; i<a.length-1; i++) {
			
			 res = a[i+1]-a[i];
			
			if(res>max) {
				max=res;
			}
		}
		System.out.println(max);

	}

}
