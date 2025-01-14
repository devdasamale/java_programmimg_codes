package Re_MultiDArray;

public class LargestNoInRow {
	public static void main(String[] args) {
		int[][]a = {{4,2,7},{8,9,45},{55,45,2}};
		
		for (int i = 0; i < a.length; i++) {
			int largest = Integer.MIN_VALUE;
			
			for (int j = 0; j < a[i].length; j++) {
				if(a[i][j] > largest) {
					largest = a[i][j];
				}
			}
			
			System.out.println(largest);
		}
		
	}
}
