package Re_Sorting;

public class LinearSearch {
	public static void main(String[] args) {
		int[]a = {4,8,9,2,1,6,10,5,44};
		int target = 1;
		int index = -1;
		
		for (int i = 0; i < a.length; i++) {
			if(a[i] == target) {
				index = i;
				break;
			}
		}
		System.out.println(index);
	}
}
