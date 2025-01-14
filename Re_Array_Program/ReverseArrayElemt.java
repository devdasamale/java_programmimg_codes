package Re_Array_Program;

import java.util.Scanner;

public class ReverseArrayElemt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[]a = {12,54,28,98};
		
		for (int i = 0; i < a.length; i++) {
			int rev = 0;
			
			while (a[i] != 0) {
				int d = a[i] % 10;
				rev = rev * 10 + d;
				a[i] = a[i]/ 10;
			}
			System.out.println(rev);
		}
		
		
	}
}
