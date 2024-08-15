package array;

import java.util.Scanner;

public class _04SwapAlternateElement {
	
	public static void swap(int[] arr) {
		
		for(int i = 0; i < arr.length ; i+=2) {
			
			if(i+1 < arr.length) {
			int temp = arr[i]; 
			arr[i] = arr[i+1];
			arr[i+1] = temp;
			}
		}
		
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Size of array");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter array Elements");
		
		for(int i = 0; i < arr.length ; i++) {
			
			arr[i] = sc.nextInt();
			
		}
		
		swap(arr);

	}

}
