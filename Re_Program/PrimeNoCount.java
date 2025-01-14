package Re_Program;

import java.util.Scanner;

public class PrimeNoCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int count = 0;
		
		for(int i = 2; i <= n; i++) {
			int factorCount = 0;
			for(int j = 1; j <= i; j++) {
				if(i % j == 0) {
					factorCount++;
				}
			}
			if(factorCount == 2) {
				count++;
			}
		}
		System.out.println(count);
		
	}
}
