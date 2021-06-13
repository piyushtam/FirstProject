package practiceJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicatefromArray {

	public static void main(String[] args) {
		
		//int[] arr = {10,10,20,30,20,40,50,50};
		//Array list
		
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,2,2,3,3,4,5,6,6,7,8));
		
	LinkedHashSet<Integer> set = new LinkedHashSet<Integer>(list);
	
	ArrayList<Integer> listnew = new ArrayList<>(set);
	
	System.out.println(listnew);

	}

}
