
public class NumOfDigit {

	public static void main(String[] args) {
		
		long num = 12398990121212l;
		int count = 0;
		
		while(num!=0) {
			
			num=num/10;
			count++;
		}
		System.out.println(count);

	}

}
