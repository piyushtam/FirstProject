
public class TestVowels {
	
	public static void main(String[] args) {
		
		
		String s= "This website is aw3som3";
		int vowels = 0;
		
		System.out.println(s= s.toLowerCase());
		for(int i=0; i<s.length(); i++) {
			
			char c=s.charAt(i);
			
			if(c=='a' ||c=='e' ||c=='i' ||c=='o' ||c=='u') {
			++vowels;	
				
				
			}
			
		}
		
		System.out.println(vowels);
	}

}
