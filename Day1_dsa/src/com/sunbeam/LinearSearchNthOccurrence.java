package com.sunbeam;

public class LinearSearchNthOccurrence {
	 public static int linearSearchNthOccurrence(int[] arr, int target, int n) {
	        int count = 0;  
	        int index = 0;  
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == target) {
	                count++;
	                if (count == n) {
	                	return i;
	                }
	            }
	        }

	        return -1;
	    }

	    public static void main(String[] args) {
	        int myArray[] = {1, 2, 3, 4, 3, 5, 3, 6};
	        int elementToFind = 3;
	        int nthOccurrence = 2;

	        int result = linearSearchNthOccurrence(myArray, elementToFind, nthOccurrence);
	        if (result != -1) {
	            System.out.println("The " + nthOccurrence + "th occurrence of " + elementToFind + " is at index " + result + ".");
	        } else {
	            System.out.println("The " + nthOccurrence + "th occurrence of " + elementToFind + " was not found.");
	        }
	    }
	}



