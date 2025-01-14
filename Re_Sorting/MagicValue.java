package Re_Sorting;

import java.util.Arrays;

public class MagicValue {
	public static void printArr(int[]a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[]a = {0,4,0,0,1,3,4,1,0,2};
		int[]b = a.clone();
		Arrays.sort(b);
		
		int goodI = 0;
		int badI = 0;
		
		for (int i = 0; i < b.length; i++) {
			if(a[i] == b[i]) {
				goodI = goodI + b[i];
			}else {
				badI = badI + b[i];
			}
		}
		
		int magic = goodI - badI;
		
		System.out.println(magic);
	}
}
