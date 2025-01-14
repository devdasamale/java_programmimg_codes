package Re_Program;

public class AllEven {
	public static void main(String[] args) {
		int n = 1684;
		
		while(n != 0) {
			int Digit = n % 10;
			if(Digit % 2 == 0) {
				System.out.println(Digit);
			}
			n = n/10;
		}
	}
}
