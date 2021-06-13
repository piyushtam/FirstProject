package java_Interview;

public class PyramidPattern {

	public static void main(String[] args) {
		//Program for Printing Pyramid Pattern in Java
		
		/* 
		 *
         * *
         * * *
         * * * *
		 */

		for(int i=1; i<=4; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
