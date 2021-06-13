import java.util.Scanner;

public class CalculatorUsingSwitchCase {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number");
		System.out.println("Enter second number");
		
		int first = scan.nextInt();
		int second = scan.nextInt();
		
		System.out.println("Enter operator +-*/");
		char operator = scan.next().charAt(0);
		
		int result=0;
		
		switch (operator) {
		case '+':
			result=first+second;
			break;
		case '-':
			result=first-second;
			break;
		case '/':
			result=first/second;
			break;
		case '*':
			result=first*second;
			break;
		default:
			System.out.println("Correct operator");
			break;
		}
		System.out.println(result);
	}
}
