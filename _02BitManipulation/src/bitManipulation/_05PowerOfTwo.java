package bitManipulation;

import java.util.Scanner;

public class _05PowerOfTwo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
//		boolean flag = false;
//		
//		for(int i = 0; i <= 30 ; i ++)
//		{
//			int ans = (int)Math.pow(2, i);
//			
//			
//			if(ans == num) {
//				flag = true;
//			}
//		}
//		
//		if(flag) {
//			System.out.println("number is power of two");
//		}
//		else {
//			System.out.println("number is not power of two");
//		}
		
		int count = 0;
		while(num!=0) {
			if((num & 1) == 1) {
				count++;
			}
			
			num = num>>1;

		}
		
		if(count==1) {
			System.out.println("number is power of two");
		}
		else {
			System.out.println("number is not power of two");
		}
	}

}
