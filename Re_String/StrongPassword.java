package Re_String;

public class StrongPassword {
	public static void main(String[] args) {
		String s = "Devdas@1234";
		
		if(s.length() >= 8) {
			boolean upper = false;
			boolean lower = false;
			boolean digit = false;
			boolean special = false;
			
			for (int i = 0; i < s.length(); i++) {
				if(Character.isUpperCase(s.charAt(i))) {
					upper = true;
				}else if(Character.isLowerCase(s.charAt(i))) {
					lower = true;
				}else if(Character.isDigit(s.charAt(i))) {
					digit = true;
				}else {
					special = true;
				}
			}
			
			if(upper && lower && digit && special) {
				System.out.println("Strong password");
			}else {
				System.out.println("Not a Strong Password");
			}
		}else {
			System.out.println("Not a Strong Password, Password is less than 8 Characters");
		}
	}
}
