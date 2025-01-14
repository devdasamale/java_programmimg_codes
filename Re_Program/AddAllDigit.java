package Re_Program;

public class AddAllDigit {
	public static void main(String[] args) {
		int n = 25382;
		int sum = 0;
		
		while(n != 0) {
			int Digit = n %10;
			sum = sum + Digit;
			n = n/10;
		}
		System.out.println(sum);
	}
}
