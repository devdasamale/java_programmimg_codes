package Re_String;

public class PangramByArray {
	public static void main(String[] args) {
		String s = "Java Programming Is Easy";
		s = s.toLowerCase();
		boolean[]b = new boolean[26];
		
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				int x = s.charAt(i) - 'a';
				b[x] = true; 
			}
		}
		
		int count = 0;
		for (int i = 0; i < b.length; i++) {
			if(b[i] == true) {
				count++;
			}
		}
		
		if(count == 26) {
			System.out.println("Pangram");
		}else {
			System.out.println("Not a Pangram");
		}
	}
}
