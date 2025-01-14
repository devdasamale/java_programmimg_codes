package Re_String;

public class CountVowConSpaDigChar {
	
	public static void Vowels() {
		String s = "education";
		int count = 0;
		
		for (int i = 0; i < s.length(); i++) {
			char x = s.charAt(i);
			
			if(x =='a' || x =='e' || x =='i' || x =='o' || x =='u') {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static void Consonents() {
		String s = "education";
		int count = 0;
		
		for (int i = 0; i < s.length(); i++) {
			char x = s.charAt(i);
			
			if(!(x =='a' || x =='e' || x =='i' || x =='o' || x =='u')) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static void Spaces() {
		String s = "education is important";
		int count = 0;
		
		for (int i = 0; i < s.length(); i++) {
			char x = s.charAt(i);
			if(x == ' ') {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static void Digits() {
		String s = "education12345 is important67890";
		int count = 0;
		
		for (int i = 0; i < s.length(); i++) {
			char x = s.charAt(i);
			if(x >= '0' && x <= '9') {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static void Character() {
		String s = "education is important";
		int count = 0;
		char ch = 'i';
		
		for (int i = 0; i < s.length(); i++) {
			char x = s.charAt(i);
			if(x == 'i') {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		Vowels();
		Consonents();
		Spaces();
		Digits();
		Character();
	}
}
