package Pattern;

public class numberTraingle {
	public static void main(String[] args) {
		int n = 5;
		for(int r = 1; r <= n ; r++) {
			for(int c = 1; c <= n; c++) {
				if(r + c == n/2 + 1) {
					System.out.print(r);
				} else {
					System.out.print("  ");
				}
			}
		}
		System.out.println();
	}
}
