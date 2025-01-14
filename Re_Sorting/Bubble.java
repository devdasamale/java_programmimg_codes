package Re_Sorting;

public class Bubble {
	
	public static void printArr(int[]a) {
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[]a = {8,7,2,1,6};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-1; j++) {
				if(a[j] > a[j+1]) {
					int temp = a[j];
					a[j]= a[j+1];
					a[j+1]= temp;
				}
			}
		}
		
		printArr(a);
	}
}
