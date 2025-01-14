package Re_Program;

public class DigitSep {
	public static void main(String[] args) {
		int n = 1684;
		
		while(n != 0) {
			int Digit = n % 10;
			System.out.print(Digit);
			n = n/10;
		}
	}
}
