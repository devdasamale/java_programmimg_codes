package Re_Program;

import java.util.Scanner;

public class PSSO {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int Esum = 0;
		int Osum = 0;
		
		while(n != 0) {
			int Digit = n % 10;
			if(Digit % 2 == 0) {
				Esum = Esum + Digit;
			} else {
				Osum = Osum + Digit;
			}
			n = n/10;
		}
		
		System.out.println(Esum * Osum);
	}
}
