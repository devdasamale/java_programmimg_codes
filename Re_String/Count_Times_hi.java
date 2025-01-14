package Re_String;

public class Count_Times_hi {
	public static void main(String[] args) {
		String s = "ahiaaahiaahiahiaahi";
		System.out.println(count(s));
	}
	
	public static int count(String s) {
		if(s.length() < 2) {
			return 0;
		}
		
		if(s.substring(0, 2).equals("hi")) {
			return 1 + count(s.substring(2));
		}else {
			return count(s.substring(1));
		}
	}
}
