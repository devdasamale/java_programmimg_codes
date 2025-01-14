package Re_String;

public class ReverseWordString {
	
	public static String rev(String s) {
		String rev = "";
		for (int i = s.length()-1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		return rev;
	}
	
	public static void main(String[] args) {
		String s = "i like to eat apple";
		String word = "";
		
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) != ' ') {
				word = word + s.charAt(i);
			}else {
				System.out.print(rev(word) + " ");
				word = "";
			}
		}
		System.out.println(rev(word));
	}
}
