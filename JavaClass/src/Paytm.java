
public class Paytm {

	public static void main(String[] args) {
		
		//I/P: All the Best
		//O/P: llA eht tesB

		String str= "All the Best";
		
		String rev= "";
		
		String[] arr= str.split(" ");
		for(int i=0; i<arr.length; i++){
			
			//System.out.println(arr[i]);
			
			String s = arr[i];
			String revchar="";
			
			for(int j=s.length()-1; j>=0; j--) {
				
				revchar= revchar + s.charAt(j);
				
			}
			
			rev = rev + revchar + " ";
			
				
		}
		
		System.out.println(rev);
	
		
	}

}
