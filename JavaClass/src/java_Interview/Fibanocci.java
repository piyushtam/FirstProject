package java_Interview;

public class Fibanocci {

	public static void main(String[] args) {
		//Print Fibanocci Series by swapping variables
		//0 1 1 2 3 5 8 13 21 34 
		
		int firstnum = 0;
		int nextnum = 1;
		int lastnum;
		for(int i=1; i<=10; i++) {
			lastnum=firstnum+nextnum;
			firstnum=nextnum;
			nextnum=lastnum;
			
			System.out.print(lastnum+" ");
		}

	}

}
