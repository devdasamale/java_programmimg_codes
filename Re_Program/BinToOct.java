package Re_Program;

import java.util.Scanner;

public class BinToOct {
	
	public static int pow(int n, int p) {
		int prod = 1;
		for(int i = 1; i <= p; i++) {
			prod = prod * n;
		}
		return prod;
	}
	
	public static void main(String[] args) {
		System.err.println("IMP NOTE");
		System.out.println("We cannot directly convert Binary to Octal !");
		System.out.println("We can do Binary -> Decimal -> Octal");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No: ");
		int n = sc.nextInt();
		int sum = 0;
		int power = 0;
		
		while(n!=0) {
			int digit = n % 10;
			sum = sum + digit * pow(2, power);
			power++;
			n = n/10;
		}
		
		System.out.println("Decimal: "+ sum);
		String octal = "";
		
		while(sum != 0) {
			int remainder = sum % 8;
			octal = remainder + octal;
			sum = sum/8;
		}
		
		
		System.out.println("Octal: "+octal);
	}
}
