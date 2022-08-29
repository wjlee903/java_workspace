
class Swap {
	
	public String swap (String a, String b) { 
		String a_ = a;
		String b_ = b;
		
		a = b_;
		b = a_;

		return a+b;
		
	}
}


public class Ex_Test_Swap {

	public static void main(String[] args) {
		
	String a = "°¡";	
	String b = "³ª";	
	
	Swap s = new Swap();
	
	System.out.println( s.swap(a, b));
	
	
	
		
			

	}

}
