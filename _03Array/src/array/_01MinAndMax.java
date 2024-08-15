package array;

import java.util.Scanner;

public class _01MinAndMax {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter size of array");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter the array elements");
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = arr[0]; 
		int min = arr[0];
		for(int i = 1 ; i < arr.length ; i++) {
			
			if(max<arr[i]) {
				max = arr[i];
			}
			
			if(min>arr[i]) {
				min = arr[i];
			}
			
		}
		
		System.out.println(" maximum value  is " + max);
		System.out.println(" maximum value  is " + min);
	}

}
