package Re_MultiDArray;

public class MatrixMulDiffSize {
	
	public static void MatrixMulti(int rowA, int colA, int[][]a, int rowB, int colB, int[][]b ){
		if(colA != rowB) {
			System.out.println("Matrix Multiplication Not Possible ");
			return;
		}
		
		int[][]c = new int[rowA][colB];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < colB; j++) {
				for (int k = 0; k < c[i].length; k++) {
					c[i][j] += a[i][k] * b[k][j];
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
	
	public static void main(String[] args) {
		int[][]a = {{7,5,2},{5,6,7}};
		int[][]b = {{8,1,2},{9,2,1},{1,8,1}};
		MatrixMulti(a.length, a[0].length, a, b.length, b[0].length, b);
	}
}
