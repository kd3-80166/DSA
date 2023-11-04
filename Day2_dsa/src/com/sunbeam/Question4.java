package com.sunbeam;

public class Question4 {
	  public static void insertionSortDescending(int[] arr) {
	        int n = arr.length;
	        for (int i = 1; i < n; i++) {
	            int currentElement = arr[i];
	            int j = i - 1;
	            while (j >= 0 && arr[j] < currentElement) {
	                arr[j + 1] = arr[j];
	                j--;
	            }
	            arr[j + 1] = currentElement;
	        }
	    }

	    public static void main(String[] args) {
	        int[] arr = {5, 2, 9, 3, 6};
	        insertionSortDescending(arr);

	        System.out.println("Array sorted in descending order: ");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	    }
}
