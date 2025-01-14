package Re_String;

public class ReverseStringBySplitMethod {
//	public static void main(String[] args) {
//		String s = "i like to eat apple";
//		String[]a = s.split(" ");
//		
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(reverse(a[i]) + " ");
//		}
//	}
	
	
	public static void main(String[] args) {
		String s = "i like to eat apple";
		String rev = reverse(s);
		String[]a = rev.split(" ");
		
		for (int i = a.length-1; i >= 0; i--) {
			System.out.print((a[i]) + " ");
		}
	}
	
	public static String reverse(String s) {
		String reverse = "";
		for (int i = s.length()-1; i >= 0; i--) {
			reverse = reverse + s.charAt(i);
		}
		return reverse;
	}
}
