public class TestArmstrong {

	public static void main(String[] args) {
		
		isNumArmstrong(370);

	}
	
	public static void isNumArmstrong(int num) {
		
		int ori, result = 0, rem ;
		
		//Scanner scan = new Scanner(System.in);
		//System.out.println("Original num:");
		//num=scan.nextInt();
		
		ori=num;
		
		/*rem1=num%10;
		num=num/10;
		
		rem2=num%10;
		num=num/10;
		
		rem3=num%10;
		num=num/10;*/
		
		while(num>0) {
			rem=num%10;
			num=num/10;
			result=result+(int)(Math.pow(rem, 3));
		}
		
		//result=(int)(Math.pow(rem1,3) + Math.pow(rem2, 3) + Math.pow(rem3, 3));
		
		if(result==ori) {
			
			System.out.println(ori+" is armsotrong");
			
			
		}
		
		else {
			
			System.out.println(ori+" is not armstrong");
		}
	}

		

}
