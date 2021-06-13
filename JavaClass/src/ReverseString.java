
public class ReverseString {

	public static void main(String[] args) {
		
		String str="Piyush";
		
		
		
		/*StringBuilder build = new StringBuilder();
		build.append(s);
	   StringBuilder obj= build.reverse();
	   System.out.println(obj);*/
		
	   char[] chars	= str.toCharArray();
	   for(int i=chars.length-1; i>=0; i--) {
		   
		 System.out.print(chars[i]);
		     
	   }
	   
		
        /*char[] chars = str.toCharArray();  // converted to character array and printed in reverse order
        for(int i= chars.length-1; i>=0; i--) {
            System.out.print(chars[i]);

	}*/

}
}
