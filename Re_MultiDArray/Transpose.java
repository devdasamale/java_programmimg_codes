package Re_MultiDArray;

public class Transpose {
	public static void main(String[] args) {
		int[][]a = {{10,20,30},{3,4,5},{7,8,9}};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[j][i] + " ");
			}
			System.out.println();
		}
	}
}
