package Re_String;

public class SwapStrings {
	public static void main(String[] args) {
		String s1 = "Jspiders";
		String s2 = "Qspiders";
		
		String temp = s1;
		
		s1 = s2;
		s2 = temp;
		
		System.out.println(s1 + " " + s2);
	}
}
