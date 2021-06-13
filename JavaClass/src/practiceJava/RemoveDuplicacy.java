package practiceJava;

import java.util.HashSet;

public class RemoveDuplicacy {

	public static void main(String[] args) {
		
		int[] a = {1,2,2,2,3,3,4,5,6,6,7,8};
		int[] temp = new int[a.length];
		
		int j=0;
		
		for(int i=0; i<a.length-1; i++) {
			if(a[i]!=a[i+1]) {
				temp[j]=a[i];
				j++;
			}
		}
		temp[j]=a[a.length-1];
		
		for(int i=0; i<j+1; i++) {
			System.out.print(temp[i]+ " ");
		}
		
		System.out.println("**********Using Hashset***********");
		
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int k=0; k<a.length; k++) {
			hs.add(a[k]);
			
		}
		System.out.println(hs);
		for(int b:hs) {
			System.out.print(b+ " ");
		}

	}

}
