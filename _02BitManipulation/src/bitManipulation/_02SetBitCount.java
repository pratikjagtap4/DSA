package bitManipulation;

import java.util.Scanner;

public class _02SetBitCount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number");
		int n = sc.nextInt();
		
		int count = 0;
		while(n!=0) {
			
			if((n&1) == 1) {
				count++;
			}
			n=n>>1;
		}
		
		System.out.println("There are total " + count + " set bits in given number " + n);
		
		sc.close();
	}
}
