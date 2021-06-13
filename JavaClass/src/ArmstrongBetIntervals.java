
public class ArmstrongBetIntervals {
	
	public static void main(String[] args) {
		
		int min=100;
		int max=1000;
		
		for(int i=min; i<=max; i++) {
			
			int num=i;
			int result=0;
			int rem;
			
			while(num !=0) {
				
				rem=num%10;
				result=result+(int)Math.pow(rem, 3);
				num=num/10;
			}
			
			if(i==result) {
				
				System.out.println(i+" is an armstrong number");
				
			}
			
		}
	}

}
