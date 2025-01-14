package Re_String;

public class upperToLower {
	public static void main(String[] args) {
		String s = "EDUCATION";
		char[]ch = s.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			if(ch[i] >= 'A' && ch[i] <= 'Z') {
				ch[i] = (char)(ch[i] + 32);
			}
		}
		
		String lower = new String(ch);
		System.out.println(lower);
	}
}
