package Re_String;

public class PalindromeOrNot {
	public static void main(String[] args) {
		String s1 = "race car";
		String rev = "";
		String finalOut = "";
		
		for (int i = 0; i < s1.length(); i++) {
			char x = s1.charAt(i);
			if(x != ' ') {
				rev = rev + x;
			}
		}
		
		for (int i = rev.length()-1; i >= 0; i--) {
			finalOut = finalOut + rev.charAt(i);
		}
		
		
		if(rev.equalsIgnoreCase(finalOut)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
	}
}
