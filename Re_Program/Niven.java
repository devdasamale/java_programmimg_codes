package Re_Program;

import java.util.Scanner;

public class Niven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		
		while(n != 0) {
			int digit = n % 10;
			sum = sum + digit;
			n = n/10;
		}
		
		if(n % sum == 0) {
			System.out.println("Niven");
		}else {
			System.out.println("Not Niven");
		}
	}
}
