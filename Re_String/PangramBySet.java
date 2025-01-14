package Re_String;

import java.util.Set;
import java.util.TreeSet;

public class PangramBySet {
	public static void main(String[] args) {
		String s = "The five boxing wizards jump quickly";
		s = s.toLowerCase();
		
		Set<Character> set = new TreeSet<>();
		
		for (int i = 0; i < s.length(); i++) {
			if(Character.isAlphabetic(s.charAt(i))) {
				set.add(s.charAt(i));
			}
		}
		
		if(set.size() == 26) {
			System.out.println("Pangram");
		}else {
			System.out.println("Not a Pangram");
		}
	}
}
