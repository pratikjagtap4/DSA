package bitManipulation;

import java.util.Scanner;

public class _04Compliment {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		int n = num;
		int mask = 0;
		
		while(n != 0) {
			mask = (mask << 1 ) | 1;
			n = n >> 1 ;
		}
		
		int ans = ~num & mask ;
		
		System.out.println(ans);
	}
}
