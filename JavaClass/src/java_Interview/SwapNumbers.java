package java_Interview;

public class SwapNumbers {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		
		//Swap numbers without using temp variable
		
		a = a + b; //15
		b = a - b; //10
		a = a - b; //5
		
		System.out.println("value of a: "+a+" value of b: "+b);

	}

}
