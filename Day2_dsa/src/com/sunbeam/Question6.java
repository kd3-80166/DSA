package com.sunbeam;


	public class Question6 {
	    public static int rank(int[] arr, int key) {
	        int count = 1; 

	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] > key) {
	                count++;
	            }
	        }

	        return count; 
	    }

	    public static void main(String[] args) {
	        int[] arr = { 10, 20, 70, 13, 16, 3, 11 };
	        int key = 10; 
	        int elementRank = rank(arr, key);

	        System.out.println("Rank of " + key + " is: " + elementRank);
	    }
	}


	
	
	
	
	

