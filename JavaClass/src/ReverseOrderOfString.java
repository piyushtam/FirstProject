
public class ReverseOrderOfString {

	public static void main(String[] args) {
		
		
		String str="This is Piyush Tamrakar";
		System.out.println(str.charAt(0));
		String str1="";
		
		String[] arr= str.split(" ");
		
		for(int i=arr.length-1; i>=0; i--) {
			
			//System.out.println(arr[i]);
			
			str1=str1+arr[i]+" ";
			
			//System.out.println(str1);
			
			
		 
		 
		}
		System.out.println(str1);
		

	}

}
