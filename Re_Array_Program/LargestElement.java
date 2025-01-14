package Re_Array_Program;

import java.util.Scanner;

public class LargestElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[]a = new int[size];
		
		int largest = Integer.MIN_VALUE;
		
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			
			if(a[i] > largest) {
				largest  = a[i];
			}
		}
		
		System.out.println(largest);
	}
}
