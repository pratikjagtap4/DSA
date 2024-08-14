package bitManipulation;

import java.util.Scanner;

public class _01OddNumberUsingBitwiseAnd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		
		if((n & 1) ==1) {
			System.out.println("Number is odd");
		}
		else {
			System.out.println("number is even");
		}
		sc.close();
	}

}
