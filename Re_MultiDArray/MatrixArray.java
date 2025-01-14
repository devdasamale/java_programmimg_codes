package Re_MultiDArray;

import java.util.Scanner;

public class MatrixArray {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter Size of outer array: ");
		int outer = sc.nextInt();
		int[][]a = new int[outer][];
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.println("Enter size of inner array "+ i);
			int inner = sc.nextInt();
			a[i] = new int[inner];
			
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
		
	}
}
