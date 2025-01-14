package Re_Program;

import java.util.Scanner;

public class Strong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int temp = n;
		
		while(n!=0) {
			int dig = n % 10;
			sum = sum + factorial(dig);
			n = n/10;
		}
		
		if(sum == temp) {
			System.out.println("Strong");
		}else {
			System.out.println("Not Strong");
		}
		
	}
	
	public static int factorial(int n) {
		int fact = 1;
		for(int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}
}
