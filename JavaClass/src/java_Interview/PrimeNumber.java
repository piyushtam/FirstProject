package java_Interview;

public class PrimeNumber {

	public static void main(String[] args) {
		//Java logic to Check if given number is Prime
		
		int a=19;
		boolean flag=false;
		for(int i=2; i<=a/2; i++) {
			if(a%i==0) {
				flag=true;
				break;
			}
		
		}
		
		if(flag)
		System.out.println(a+" is not a prime");
		else
			System.out.println(a+" is a prime");

	}

}
