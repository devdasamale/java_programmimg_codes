package Pattern;

public class InvertRightTriangle {
	public static void main(String[] args) {
		int n = 7;
		for(int r = 1; r <= n ; r++) {
			for(int c = 1; c <= n; c++) {
				if( r <= c) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}	
			System.out.println();
		}
	}
}
