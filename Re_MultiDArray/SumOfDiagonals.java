package Re_MultiDArray;

public class SumOfDiagonals {
	public static void main(String[] args) {
		int[][]a = {{10,20,30},{44,55,66}, {2,8,45}};
		
		int sum = 0;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(i == j) {
					sum = sum + a[i][j];
				}else if(i + j == a.length-1){
					sum = sum + a[i][j];
				}
			}
		}
		
		System.out.println(sum);
	}
}
