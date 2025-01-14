package Re_Program;

import java.util.Scanner;

public class SumOfPrime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		
		while(n != 0) {
			int Digit = n % 10;
			
			if(Digit == 2 || Digit == 3 || Digit == 5 || Digit == 7) {
				sum = sum + Digit;
			}
			n = n/10;
		}
		System.out.println(sum);
	}
}
