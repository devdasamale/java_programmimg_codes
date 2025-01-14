package Re_Array_Program;

import java.util.Scanner;

public class SecondLargest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[]a = new int[size];
		
		int Large = Integer.MIN_VALUE;
		int SLarge = Integer.MIN_VALUE;
		
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			
			if(a[i] > Large) {
				SLarge = Large;
				Large = a[i];
			}else if(a[i] > SLarge && a[i] != Large) {
				SLarge = a[i];
			}
		}
		
		System.out.println(Large);
		System.out.println(SLarge);
	}
}
