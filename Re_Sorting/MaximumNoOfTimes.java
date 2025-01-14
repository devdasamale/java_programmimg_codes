package Re_Sorting;


public class MaximumNoOfTimes {
	
	public static int countDigit(int d , int k) {
		int count = 0;
		while (d != 0) {
			int digit = d % 10;
			if(digit == k) {
				count++;
			}
			d = d/10;
		}
		return count;
	}
	
	
	public static void main(String[] args) {
		int[]a = {7, 2, 343, 231,333};
		int k = 3;
		int maxCount = 0;
		int res = 0;
		
		for (int i = 0; i < a.length; i++) {
			int count = countDigit(a[i], k);
			if(count > maxCount) {
				maxCount = count;
			}
			
			res = a[i];
		}
		
		System.out.println(res);
	}
}
