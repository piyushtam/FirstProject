
public class StringRev {

	public static void main(String[] args) {
		
	System.out.println(reverse("Piyush"));

	}
	
	 public static String reverse(String input) {
	        if (input.isEmpty()) {  
	            System.out.println("String is empty now");
	            return input;
	        }
	        
	        return reverse(input.substring(1)) + input.charAt(0);

	    }

}
