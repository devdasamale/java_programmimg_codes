package Re_MultiDArray;

import java.util.Scanner;

public class SumOfMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int outer = sc.nextInt();
		int inner = sc.nextInt();
		
		int[][]a = new int[outer][inner];
		
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j]= sc.nextInt();
			}
		}

		for (int i = 0; i < a.length; i++) {
			int sum = 0;
			for (int j = 0; j < a.length; j++) {
				sum = sum + a[i][j];
			}
			
			System.out.println(sum);
		}
		
		
	}
}
