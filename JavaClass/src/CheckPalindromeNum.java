
public class CheckPalindromeNum {

	public static void main(String[] args) {
		int ori=1223;
		int num=ori;
		int rev=0;
		int rem;
		
		
		while(num!=0) {
			
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			
		}
		System.out.println(rev);
		
		if(rev==ori) {
			System.out.println("Its a palindrome num");
		}
		else {
			System.out.println("Its not a palindrome num");
		}
	

	}

}
