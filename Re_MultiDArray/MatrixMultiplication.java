package Re_MultiDArray;

public class MatrixMultiplication {
	public static void main(String[] args) {
		int[][]a = {{7,2,5},{4,2,8},{2,6,9}};
		int[][]b = {{1,1,0} ,{0,1,0}, {0,0,1}};
		int[][]c = new int[3][3];
		
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				for (int k = 0; k < c[i].length; k++) {
					c[i][j] = c[i][j]+(a[i][k]* b[k][j]);
				}
			}
		}
		
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}
}
