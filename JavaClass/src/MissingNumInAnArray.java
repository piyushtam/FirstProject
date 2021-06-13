
public class MissingNumInAnArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,8,9,10};
		
		int sum=0;
		
		for(int i=0; i<arr.length; i++) {
			
			sum=sum+arr[i];
			
		}
		//System.out.println(sum);
		
		int res = sumOfN(10)-sum;
		System.out.println(res);

	}
	
	public static int sumOfN(int num) {
		
		if(num!=0) {
			return num+sumOfN(num-1);
		}
		else
		{
			return num;
		}
	}

}
