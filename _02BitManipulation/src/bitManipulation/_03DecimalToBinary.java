package bitManipulation;

import java.util.Scanner;

public class _03DecimalToBinary {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int num =  sc.nextInt();
		
		int n = num;
		int answer = 0;
		int i = 0;
		while(n!=0) {
			
			int bit = n & 1;
			
			answer = (int) (bit * Math.pow(10, i)) + answer;
			i++;
			
			n=n>>1;
			
		}
		
		System.out.println("The binary representation of number : " + num + " is " + answer );
		
	}

}
