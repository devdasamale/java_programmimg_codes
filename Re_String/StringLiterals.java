package Re_String;

public class StringLiterals {
	public static void main(String[] args) {
		String s1 = "devdas";
		String s2 = "devdas";
		String s5 = "bhumi";
		
		System.out.println(s1 == s2); // s1 = s2
		System.out.println(s1.equals(s2)); // devdas == devdas
		
		String s3 = new String("bhumi");
		String s4 = new String("bhumi");
		
		System.out.println(s3 == s4); // Compares Object of String
		System.out.println(s3.equals(s4)); // Compares Data of String Object
		
		System.out.println(s5 == s4.intern()); 
		//.intern() uses address of Object created in String Consent Pool
		// s5 = "bhumi" == String s4 = new String("bhumi"); 
		
	}
}
