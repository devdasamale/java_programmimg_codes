package Pattern;

public class hollowPyramid {
	public static void main(String[] args) {
		int row = 7;
		int col = row * 2 - 1;
		for(int r = 1; r <= row ; r++) {
			for(int c = 1; c <= col; c++) {
				if(r + c == row+1 || r == row || c - r == row - 1 ){
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}	
			System.out.println();
		}
	}
}
