package com.chainsys.day6;

import java.util.Arrays;

public class ArrayFunction {
		    public static void main(String[] args) {
		        // Example array
		        int[] numbers = {5, 2, 8, 1, 6, 3};

		        // Printing the original array
		        System.out.println("Original array: " + Arrays.toString(numbers));

		        // Sorting the array
		        Arrays.sort(numbers);
		        System.out.println("Sorted array: " + Arrays.toString(numbers));

		        // Searching for an element in the array
		        int searchElement = 6;
		        int index = Arrays.binarySearch(numbers, searchElement);
		        if (index >= 0) {
		            System.out.println(searchElement + " found at index " + index);
		        } else {
		            System.out.println(searchElement + " not found in the array");
		        }

		        // Filling the array with a specific value
		        int[] filledArray = new int[5];
		        Arrays.fill(filledArray, 10);
		        System.out.println("Filled array: " + Arrays.toString(filledArray));

		        // Copying an array
		        int[] copiedArray = Arrays.copyOf(numbers, numbers.length);
		        System.out.println("Copied array: " + Arrays.toString(copiedArray));

		        // Checking equality of arrays
		        int[] newArray = {1, 2, 3, 4, 5};
		        boolean isEqual = Arrays.equals(numbers, newArray);
		        System.out.println("Arrays are equal: " + isEqual);
		        
		        //sort using parrllel sort
		        int[] pSort= {6,3,8,55,3,2,90};
		        Arrays.parallelSort(pSort);
		        System.out.println("Parallel Sort Array: "+Arrays.toString(pSort));
		        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		        // Printing the original array
		        System.out.println("Original array: " + Arrays.toString(number));

		        // Computing parallel prefix sum
		        Arrays.parallelPrefix(number, (left,right) -> left *2);
		        
		        // Printing the array after computing parallel prefix sum
		        System.out.println("Array after parallel prefix sum: " + Arrays.toString(number));
		        //
		        int[] copyOfRange = Arrays.copyOfRange(number, 1, 6);
		        System.out.println("Copy of specfic range in Another Array: "+Arrays.toString(copiedArray));
		  
		    }
}

