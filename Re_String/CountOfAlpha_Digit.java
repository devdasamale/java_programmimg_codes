package Re_String;

public class CountOfAlpha_Digit {
	public static void main(String[] args) {
		String s = "MU1M2B3A4I";
		String output = "";
		int sum = 0;
		
		for (int i = 0; i < s.length(); i++) {
			if(Character.isAlphabetic(s.charAt(i))) {
				output = output + s.charAt(i);
			}else {
				sum = sum + (s.charAt(i) - '0');
			}
		}
		
		System.out.println(output.length() + output + sum);
		
	}
}
