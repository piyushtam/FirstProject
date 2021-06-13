package java_Interview;

public class Multiplication {

	//Print Multiplication table without using Multiply operator
	
	public static void main(String[] args) {
		
		
		int a=5;
		int res=0;
		
		for(int i=1; i<=10; i++) {
			
			res=a*i;
			System.out.println(res);
			
			int output = multiply(4, 5);
			System.out.println(output);
			
		}
	
		
	}
	public static int multiply(int i, int j) {
		
		int k=1;
		int res=0;
		
		while(k<=j) {
			res=res+i;
			k++;
		}
		return res;
	}

}
