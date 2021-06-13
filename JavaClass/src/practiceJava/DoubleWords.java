package practiceJava;

import java.util.HashMap;
import java.util.Set;

public class DoubleWords {

	static int i=5;
	
	public static void main(String[] args) {
		
		System.out.println(i++);
		System.out.println(i);
		System.out.println(++i);
		System.out.println(++i+i++);
	
	String str="hi hello hi good morning hello";
	String[] words= str.split(" ");
	
	HashMap<String, Integer> map = new HashMap<String, Integer>();
	
	for(String word : words) {
		
		if(map.containsKey(word)) {
			map.put(word, map.get(word)+1);
		}
		else {
			map.put(word, 1);
		}
	}
	
	//extracting all the keys of map using set interface
	
	Set<String> set = map.keySet();
	
	for(String s : set) {
		if(map.get(s)>1) {
			System.out.println(s+ " : "+ map.get(s));
		}
	}
	

	}

}
