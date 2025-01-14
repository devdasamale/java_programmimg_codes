package Re_Program;

import java.util.Scanner;

public class DecToOct {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String octal = "";
		
		while(n!=0) {
			int remainder = n % 8;
			octal = remainder + octal;
			n = n/8;
		}
		
		System.out.println(octal);
	}	
}
