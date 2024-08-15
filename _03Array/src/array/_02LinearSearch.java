package array;

import java.util.Scanner;

public class _02LinearSearch {
	
	public static boolean linearSearch(int [] arr , int key) {
		
		for(int i = 0; i < arr.length; i++) {
			
			if( arr[i] == key) {
				return true;
			}
			
		}
		
		return false;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of an array");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter array elements");
		for(int i = 0 ; i < arr.length ; i++) {
			
			arr[i] = sc.nextInt();
			
		}
		
		System.out.println("Enter key to be search");
		int key = sc.nextInt();
		
		boolean isPresent = linearSearch(arr , key);
		
		if(isPresent) {
			System.out.println(key + " is present ");
		}
		else {
			System.out.println(key + " is not present");
		}
	}

}
