import java.util.Scanner;

public class FibobnacciSeries {

	public static void main(String[] args) {
		
		//op= 1,1,2,3,5,8,13,21,34,55
		
		Scanner scan = new Scanner(System.in);
		
		int num=10;
		
		System.out.println("Enter previous num");
		
		int pre =scan.nextInt();
		
		int res=0;
		//int pre=0;
		System.out.println("Enter next num");
		
		//int next=1;
		int next=scan.nextInt();
		
		for(int i=1; i<=num; i++) {
			
			res= pre+next;
			pre=next;
			next=res;
			System.out.print(pre+" ");
		}

	}

}
