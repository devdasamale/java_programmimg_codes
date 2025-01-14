package Re_Program;

import java.util.Scanner;

public class DecToHeax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String hexa = "";
		
		while(n!=0) {
			int remainder = n % 16;
			
			if(remainder < 10) {
				hexa = remainder + hexa;
			}else {
				hexa = (char)(remainder + 55) + hexa;
			}
			n = n/16;
		}
		
		System.out.println(hexa);
	}	
}
