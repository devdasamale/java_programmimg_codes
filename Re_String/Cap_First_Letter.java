package Re_String;

public class Cap_First_Letter {
	public static void main(String[] args) {
		String s = "capiTalIze tHe title";
		String[]word = s.split(" ");
		
		for (int i = 0; i < word.length; i++) {
			if(word[i].length() > 2) {
				char[]ch = word[i].toCharArray();
				
				if(ch[0] >= 'a' && ch[0] <= 'z') {
					ch[0] = (char)(ch[0] - 32);
				}
				
				for (int j = 1; j < ch.length; j++) {
					if(ch[j] >= 'A' && ch[j] <= 'Z') {
						ch[j] = (char)(ch[j] + 32);
					}
				}
				
				word[i] = new String(ch);
				
			}else {
				word[i] = word[i].toLowerCase();
			}
		}
		
		for (int i = 0; i < word.length; i++) {
			System.out.print(word[i] + " ");
		}
	}
}
