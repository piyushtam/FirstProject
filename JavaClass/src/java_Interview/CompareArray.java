package java_Interview;

import java.util.ArrayList;

public class CompareArray {

	public static void main(String[] args) {
		
		//compare same indexes of 2 different arrays and create new array for matchValues
		
		int[] a = {1,4,5,7};
		int[] b = {6,4,3,7};
		
		//int[] c = new int[n];
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<a.length; i++) {
			
				if(a[i]==b[i]) {
				//To store in another array, use arraylist
					
					list.add(a[i]);
				
			}
			
		}
		System.out.println(list);
		
	 Object[] obj = list.toArray();
	 for(Object ob : obj) {
		 System.out.println(ob);
	 }
			

	}

}
