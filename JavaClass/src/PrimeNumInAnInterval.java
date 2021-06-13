
public class PrimeNumInAnInterval {
	
	public static void main(String[] args) {
		
		//20 to 50 -- Prime Number?
		
		int low=20;
		int high=50;
		
		while(low<high) {
			
			boolean flag=false;
			
			for(int i=2; i<low; i++) {
				
				if(low%i==0) {
					flag=true;
					break;
				}
				
			}
			if(!flag) {
				System.out.println(low);
			}
			low++;
		}
		


	}

}
