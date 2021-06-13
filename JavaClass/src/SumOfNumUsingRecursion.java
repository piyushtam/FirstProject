
public class SumOfNumUsingRecursion {

	public static void main(String[] args) {
		
		System.out.println(AddNum(20));

	}
	
	public static int AddNum(int num) {
		
		if(num!=0) {
			return num + AddNum(num-1);
		}
		else
		{
			return num;
		}
		
	}

}
