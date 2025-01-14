package Re_MultiDArray;

import java.util.Scanner;

public class TwoDArrayByUserInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Outer Array Size: ");
		int outer = sc.nextInt();
		System.out.println("Enter Inner Array Size: ");
		int inner = sc.nextInt();
		
		int[][]a = new int[outer][inner];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println("Enter value of" + i +  " "+ j);
				a[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
		}
	}
}
