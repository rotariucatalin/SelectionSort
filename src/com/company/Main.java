package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    private void selectionSort(int[] arr) {

        int n = arr.length;

        for(int i = 0; i < n - 1; i++) {

            //Storing the min index
            int min_idx = i;

            for( int j = i + 1; j < n; j++) {

                //If the next value is lower than the starting value for ou index then update the min_idx
                if(arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }

            //After we select the min_idx swap the value into array
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;

        }
    }
}
