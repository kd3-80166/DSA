package com.sunbeam;

public class NonRepeating {
	public static int linear_search(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            int count = 0;
            for (int j = 0; j < size; j++) {
                if (i != j && arr[i] == arr[j]) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                return arr[i];
            }
        }
       
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
		
        int result = linear_search(arr, arr.length);
        
        if (result != -1) {
            System.out.println("The first non-repeating element is: " + result);
        } else {
            System.out.println("No non-repeating element found.");
        }
    }
}
	
	
	
	

