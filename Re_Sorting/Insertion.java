package Re_Sorting;

public class Insertion {
	public static void printArr(int[]a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[]a = {10,5,7,2,8,15,3};
		
		for (int i = 1; i < a.length; i++) {
			int temp = a[i];
			int j = i;
			
			while (j>0 && a[j-1] > temp ) {
				a[j] = a[j-1];
				j--;
			}
			a[j] = temp;
		}
		
		printArr(a);
	}
}
