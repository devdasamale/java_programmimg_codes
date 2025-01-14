package Re_Sorting;

public class Selection {
	public static void printArr(int[]a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[]a = {8,5,2,7,3,1};
		
		for (int i = 0; i < a.length; i++) {
			int min = i;
			for (int j = i+1; j < a.length; j++) {
				if(a[j] < a[min]) {
					min = j;
				}
			}
			
			int temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		
		printArr(a);
	}
}
