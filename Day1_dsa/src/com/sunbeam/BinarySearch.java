package com.sunbeam;
public class BinarySearch {
    public static int binarySearch(int[] arr, int key) {
        int comparisons = 0;
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            comparisons++;
            int mid = (left + right) / 2;

            if (arr[mid] == key) {
                return comparisons;
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return comparisons; // If key is not found
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key = 7;
        int comparisons = binarySearch(arr, key);

        if (comparisons != -1) {
            System.out.println("Binary search found the key " + key + " with " + comparisons + " comparisons.");
        } else {
            System.out.println("Binary search did not find the key " + key + " with " + comparisons + " comparisons.");
        }
    }
}