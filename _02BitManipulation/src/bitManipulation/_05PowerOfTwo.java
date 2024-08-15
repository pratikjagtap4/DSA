package bitManipulation;

import java.util.Scanner;

public class _05PowerOfTwo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		int n = num-1;
		
		int mask = 0;
		
		while(n!=0) {
			mask = (mask << 1) |1;
			n =  n >> 1;
		}
		
		int ans = ~(num -1)& mask;
		
		
		System.out.println(ans);
		if( ans == 0)
		{
			System.out.println("The number is power of two");
		}
		else
		{
			System.out.println("number is not power of two");
		}

	}

}
