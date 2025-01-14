package Re_String;

public class lowerToUpper {
	public static void main(String[] args) {
		String s = "Education";
		char[]ch = s.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			if(ch[i] >= 'a' && ch[i] <= 'z') {
				ch[i] = (char)(ch[i] - 32);
			}
		}
		String upper = new String(ch);
		System.out.println(upper);
	}
}
