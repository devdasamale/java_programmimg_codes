package Re_String;

public class RemoveVowConSpaDigChar {
	
	public static void Vowels() {
		String s = "education";
		String output = "";
		
		for (int i = 0; i < s.length(); i++) {
			char x = s.charAt(i);
			
			if(!(x =='a' || x =='e' || x =='i' || x =='o' || x =='u')) {
				output = output + x;
			}
		}
		System.out.println(output);
	}
	
	public static void Consonents() {
		String s = "education";
		String output = "";
		
		for (int i = 0; i < s.length(); i++) {
			char x = s.charAt(i);
			
			if(x =='a' || x =='e' || x =='i' || x =='o' || x =='u') {
				output = output + x;
			}
		}
		System.out.println(output);
	}
	
	public static void Spaces() {
		String s = "education is important";
		String output = "";
		
		for (int i = 0; i < s.length(); i++) {
			char x = s.charAt(i);
			if(x != ' ') {
				output = output + x;
			}
		}
		System.out.println(output);
	}
	
	public static void Digits() {
		String s = "education12345 is important67890";
		String output = "";
		
		for (int i = 0; i < s.length(); i++) {
			char x = s.charAt(i);
			if(!(x >= '0' && x <= '9')) {
				output = output + x;
			}
		}
		System.out.println(output);
	}
	
	public static void Character() {
		String s = "education is important";
		String output = "";
		char ch = 'i';
		
		for (int i = 0; i < s.length(); i++) {
			char x = s.charAt(i);
			if(x != 'i') {
				output = output + x;
			}
		}
		System.out.println(output);
	}
	
	
	public static void main(String[] args) {
		Vowels();
		Consonents();
		Spaces();
		Digits();
		Character();
	}
}
