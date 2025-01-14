package Re_Array_Program;

import java.util.Scanner;

public class ProOddValues {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[]a = new int[size];
		int prod = 1;
		
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			
			prod = prod * a[i];
		}
		
		System.out.println(prod);
		
	}
}
