package Pattern;

public class PascalTriangle_LeftSide {
	public static void main(String[] args) {
		int n = 5;
		
		for(int r = 1; r <= n ; r++) {
			int coff = 1;
			
			for(int c = 1; c <= n; c++) {
				if(r >= c) {
					System.out.print(coff+ " ");
				} else {
					System.out.print("  ");
				}
				
				coff = coff * (r-c)/c;
			}
			System.out.println();
		}
		
	}
}
