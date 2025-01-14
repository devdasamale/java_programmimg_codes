package Re_Sorting;

import java.util.Arrays;

public class ArrayCoping {
	
	public static void printArr(int[]a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[]a = {10,20,30,1,2,3};
		int[]b = new int[a.length];
		int[]c = Arrays.copyOf(a, a.length);
		
		for (int i = 0; i < b.length; i++) {
			b[i] = a[i];
		}
		printArr(b);
		System.out.println("Array C");
		Arrays.sort(c);
		printArr(c);
		
		System.out.println("Array D");
		int[]d = a.clone();
		printArr(d);
	
	}
}
