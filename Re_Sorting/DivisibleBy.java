package Re_Sorting;

import java.util.Scanner;

public class DivisibleBy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[]a = {7,12,65,42,3,8};
		int k = sc.nextInt();
		int totalDec = 0;
		
		for (int i = 0; i < a.length; i++) {
			totalDec = totalDec + (a[i] % k);
		}
		
		System.out.println(totalDec);
		
		
	}
}
