package Re_Program;

import java.util.Scanner;

public class Armstrong {
	
	public static int countDigit(int n) {
		int count = 0;
		while(n!=0) {
			count++;
			n = n/10;
		}
		return count;
	}
	
	public static int pow(int n , int p) {
		int prod = 1;
		for(int i = 1; i<= p; i++) {
			prod = prod * n;
		}
		return prod;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int temp = n;
		
		int countD = countDigit(n);
		
		while (n != 0){
			int dig = n % 10;
			sum = sum + pow(dig, countD);
			n = n/10;
		}
		
		if(sum == temp) {
			System.out.println("Armstrong");
		}else {
			System.out.println("Not Armstrong");
		}
		
		

	}
}
