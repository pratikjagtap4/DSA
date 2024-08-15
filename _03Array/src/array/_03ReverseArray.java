package array;

import java.util.Scanner;

public class _03ReverseArray {
	
	public static void revArray(int[] arr) {
		
		int start = 0;
		int end = arr.length-1;
		
		
		
		while(start<=end)
		{
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end--;
		}
		
		System.out.println("Reverse array elements");
		
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] +" ");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of an array");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter array elements");
		for(int i = 0 ;  i < arr.length ; i++) {
			arr[i] = sc.nextInt(); 
		}
		
		revArray(arr);
		
	}

}
