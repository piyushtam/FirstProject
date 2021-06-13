
public class Prime {

	public static void main(String[] args) {
		
		Prime obj = new Prime();
		System.out.println(obj.IsNumPrime(29));
		

	}
	
	public boolean IsNumPrime(int num) {
		
		if(num==1 ||num==2) {
			return true;
		}
		for(int i=2; i<num; i++) {
			if(num%i==0)
				return false;
		}
		return true;
	}

}
