package Re_Program;

public class PrintPattern16 {
	public static void print(int i) {
		if(i>=0) {
			System.out.print(" "+ i);
			print(i-5);
		}
		System.out.print(" "+i);
	}
	
	public static void main(String[] args) {
		print(16);
	}
}
