package practiceJava;

public class RevWordString {

	public static void main(String[] args) {
		
		//input= This is java class
		//output= sihT si avaj ssalc
		
		String str ="This is java class";
		String rev ="";
		
		String[] words= str.split(" ");
		for(String word:words) {
			System.out.println(word);
			
			StringBuilder build = new StringBuilder(word);
			
			build.reverse();
			
			rev = rev + build.toString() + " ";
		}
		
		System.out.println(rev);

	}

}
