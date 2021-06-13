package practiceJava;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicatecharInAString {

	public static void main(String[] args) {
		
		String str= "This is";
		char[] chars = str.toLowerCase().replace(" ", "").toCharArray();
		
		
		
	Set<Character> set  = new HashSet<>();
	for(char c:chars) {
		if(set.add(c)==false);{
			System.out.print(c+" ");
			
			
		}
		
	}
	//System.out.println(set);
	}
	
}
