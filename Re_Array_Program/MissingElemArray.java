package Re_Array_Program;

import java.util.Scanner;

public class MissingElemArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = 9;
		int[]a = {0,8,7,5,4,6,1,2,3};
		
		int SumN = size * (size+1)/2;
		int SumArr = 0;
		
		for (int i = 0; i < a.length; i++) {
			SumArr = SumArr + a[i];
		}
		
		int all = SumN - SumArr ;
		
		System.out.println("Missing Element  is: " + all );
	}
}
