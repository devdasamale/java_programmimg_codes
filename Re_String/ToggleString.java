package Re_String;

public class ToggleString {
	public static void main(String[] args) {
		String s = "HelloWorld";
		char[]ch = s.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			if(Character.isUpperCase(ch[i])) {
				ch[i] = (char)(ch[i] + 32);
			}else {
				ch[i] = (char)(ch[i] - 32);	
			}
		}
		
		String toggle = new String(ch);
		System.out.println(toggle);
		
	}
}
