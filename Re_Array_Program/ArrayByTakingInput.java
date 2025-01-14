package Re_Array_Program;

import java.util.Scanner;

public class ArrayByTakingInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[]a = new int[5];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}
}
