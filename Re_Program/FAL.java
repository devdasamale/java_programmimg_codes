package Re_Program;

import java.util.Scanner;

public class FAL {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int last = n %10;
		int first = n;
		while(first >= 10) {
			first = first/10;
		}
		
		System.out.println(first);
		System.out.println(last);

	}
}
