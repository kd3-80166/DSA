package com.Q1;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[]= {11,22,33,44,55,66,77,88,99};
		Scanner Sc= new Scanner(System.in);
		System.out.println("Enter Key To Be Search : ");
		int Key = Sc.nextInt();
		
		int index = BinarySearch(arr,arr.length,Key);
		
		if (index!= -1)
			System.out.println("Key Is Found At : "+ index);
		else 
			System.out.println("Key Is Not Found ");
		Sc.close();

	}

	private static int BinarySearch(int[] arr, int length, int key) {
        int count=0;
		int size=arr.length;
		int left=0, right= size-1,mid;
		
		while(left<=right) {
			count++;
			mid=(left + right)/2;
			
			if (key == arr [mid]) {
				System.out.println("Number Of Comparisons : " + count);
				return mid;
			}
			
			else if (key <arr[mid]) {
				right= mid -1;
			}
			else 
				left = mid +1;
		}
		return -1 ;
	}

}
