package practiceJava;

public class CheckPrime {

	public static void main(String[] args) {
		System.out.println(isPrime(102));
		

	}
	
	public static boolean isPrime(int num) {
		
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				return false;
			}
			else {
				return true;
		}
	}
		if(num==1 || num==2) {
			
		}
		return true;
	}	

}
