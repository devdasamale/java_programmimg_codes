package Re_Program;

import java.util.Scanner;

public class Table {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = n; i <= n; i++) {
			for(int j = 1; j <= 10; j++) {
				System.out.println(i + " x " + j + " = " + i*j);
			}
			System.out.println();
		}
	}
}
