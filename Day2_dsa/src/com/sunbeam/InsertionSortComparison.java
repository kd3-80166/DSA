package com.sunbeam;

import java.util.Arrays;

	public class InsertionSortComparison{
		
		public static int insertionSort(int arr[], int N) {
			//1. Count number of passes
			int count = 0;
			for(int i = 1 ; i < N ; i++) {
				
				//2. take backup of one element
				int temp = arr[i];
				//3. find immediate left neighbour
				int j = i - 1;
				//4. compare backued element with all its left neighbour
				
				while(j >= 0) {
					count++;
					if(arr[j] > temp) {
						arr[j + 1] = arr[j];
						j--;
					}
					else {
						break;
					}
					//5. if left element is greater than backuped element then move it one position ahead
					
				}
				// i = 1
				// temp = 44
				// j = 0(55), -1
				//6. insert backuped element at its appropriate position
				arr[j + 1] = temp;
			}
			return count;
		}
		

		public static void main(String[] args) {
			int arr[] = {13, 46, 24, 52, 20, 9};
			
			System.out.println("Array before sort : " + Arrays.toString(arr));
			
			
			int comparisions = insertionSort(arr, arr.length);
			
			System.out.println("After Sorting Comparisions are : " + comparisions);
			

		}

	}


	
	
	

