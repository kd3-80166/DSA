package com.sunbeam;

import java.util.Arrays;

	public class SelectionSort {

		public static int comparisions(int arr[],int size) {
			int n = size;
			int cp = 0;
			for(int i=0;i<n-1;i++) {
				int min = i;
				for(int j=i+1;j<n;j++) {
					cp++;
					if(arr[j] < arr[min]) {
						min = j;
					}
				}
				//swap
	            int temp = arr[min];
	            arr[min] = arr[i];
	            arr[i] = temp;
			}

			return cp;
			
		}

		public static void main(String[] args) {
			int arr[] = {13, 46, 24, 52, 20, 9};
			
			System.out.println("Before Sorting : " + Arrays.toString(arr));
			
			int size = arr.length;
			
			int comparisions = comparisions(arr,size);
			
			System.out.println("After Sorting Comparisions are : " + comparisions);
			
			

		}


	}
	
	

