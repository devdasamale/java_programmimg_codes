package Re_Program;

import java.util.Scanner;

public class BinToDec {
	
	public static int pow(int n , int p) {
		int prod = 1;
		for(int i = 1; i <= p; i++) {
			prod = prod * n;
		}
		return prod;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int power = 0;
		
		while(n!=0) {
			int digit = n % 10;
			sum = sum + digit * pow(2, power);
			power++;
			n = n/10;
		}
		
		System.out.println(sum);
	}
	
}
