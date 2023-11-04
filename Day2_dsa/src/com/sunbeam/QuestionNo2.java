package com.sunbeam;


	import java.util.Arrays;

	public class QuestionNo2 {
		
		public static int furtherImprovedBubbleSort(int arr[], int N) {
			int count = 0;
			int flag;
			//1. count number of passes
			for(int i = 1 ; i < N ; i++) {
				flag = 0;
				//2. compare two consecutive elements
				for(int j = 0 ; j < N - i ; j++) {
					count++;
					//3. if left element is greater than right element then swap
					if(arr[j] > arr[j + 1]) {
						int temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = temp;
						flag = 1;
					}
				}
				if(flag == 0)
					break;
			}
			return count;
		}

		public static void main(String[] args) {
			int arr[] = {13, 46, 24, 52, 20, 9};
			
			System.out.println("Before Sorting : " + Arrays.toString(arr));
			
			int size = arr.length;
			
			int comparisions = furtherImprovedBubbleSort(arr,size);
			
			System.out.println("After Sorting Comparisions are : " + comparisions);

		}

		
	}
	
	

