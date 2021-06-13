
public class Palindrome {

	public static void main(String[] args) {
		
		Palindrome p = new Palindrome();
		System.out.println(p.IsStrPalindrome("NITIN"));

	}
	
	public boolean IsStrPalindrome(String originalStr) {
		
		String reverseStr="";
		
		char[] chars = originalStr.toCharArray();
		for(int i=chars.length-1; i>=0; i--) {
			
			reverseStr = reverseStr + chars[i];
			
		}
		System.out.println(reverseStr);
			if(reverseStr.equals(originalStr))
				return true;
			else
				return false;
		
		
	}

}
