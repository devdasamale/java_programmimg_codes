package Re_Program;

import java.util.Scanner;

public class SpecialNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int Asum = 0;
		int Psum = 1;
		int temp = n;
		
		while (n != 0) {
			int dig = n % 10;
			Asum = Asum + dig;
			Psum = Psum * dig;
			n = n/10;
		}
		
		if(Asum + Psum == temp) {
			System.out.println("Special");
		}else {
			System.out.println("Not Special");
		}
		
		

	}
}
