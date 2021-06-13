
public class CheckVowels {

	public static void main(String[] args) {
		System.out.println(IsVowelsPresent("Pysh"));

	}
	
	public static boolean IsVowelsPresent(String str) {
		
		if(str.toLowerCase().matches(".*[a,e,i,o,u].*"))
		return true;
		
		else
			return false;
	}

}
