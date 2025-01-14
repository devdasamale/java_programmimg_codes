package Re_Program;

import java.util.Scanner;

public class DecToBin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String binary = "";
		
		while(n!=0) {
			int remainder = n % 2;
			binary = remainder + binary;
			n = n/2;
		}
		
		System.out.println(binary);
	}
}
