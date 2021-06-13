
public class Paytm2 {

	public static void main(String[] args) {
		
		//input= This is java class
		//output= class java is This
		
		String str = "This is java class";
		String rev = "";
		
		String[] words= str.split(" ");
		
		for(int i=words.length-1; i>=0; i--) {
			
			
			rev = rev + words[i] + " ";
		}
		
		System.out.println(rev);

	}

}
