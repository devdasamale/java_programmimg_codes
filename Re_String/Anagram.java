package Re_String;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		
		String s = "cat";
		String s1 = "act";
		
		if(s.length() == s1.length()) {
			char[]c1 = s.toCharArray();
			char[]c2 = s1.toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			if(Arrays.equals(c1, c2)) {
				System.out.println("Anagram");
			}else {
				System.out.println("Not an Anagram");
			}
		}
	}
}
