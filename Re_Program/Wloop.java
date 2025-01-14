package Re_Program;

public class Wloop {
	
	public static void print(int i) {
		if(i<=500) {
			System.out.println(i);
			i++;
			print(i);
		}
	}
	
	public static void main(String[] args) {
		print(1);
	}
}
