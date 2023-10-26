package com.Q1;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		int comparisons=0;
		int[]array= {1,2,3,4,5,6,7,8,9,10};
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Key To Search : ");
		int Key= sc.nextInt();
		int comparisions = LinearSearch(array,Key);
		if (comparisons == -1) {
			System.out.println("Key Not Found....");
		}else {
		   System.out.println("Key Fount At Index : " + comparisions);
		   System.out.println("Number Of Comparisons : " + (comparisions +1));
		}
	}

	private static int LinearSearch(int[] array, int key) {
    int comparisons = 0;
    for(int i =0;i<array.length;i++) {
    	comparisons++ ;
    	if(array[i]==key) {
    		return i;
    	}
    	
    }
		return -1;
	}

}
