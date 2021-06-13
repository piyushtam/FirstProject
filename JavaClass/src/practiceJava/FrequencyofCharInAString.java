package practiceJava;

import java.util.HashMap;
import java.util.Map;

public class FrequencyofCharInAString {

	public static void main(String[] args) {
		
		//i:2, s:4
		
		String str = "This is Java class";
		char[] chars=str.toLowerCase().replace(" ", "").toCharArray();
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(char c : chars) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
		}
		
		System.out.print(map);
	

	}

}
