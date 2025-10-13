package com.Sorting;
import java.util.* ;

public class Bubble_Sort {

    public static void bubbleSort(int[] arr, int i, int j) {
        if (i == arr.length - 1) {
            return;
        }

        if (j < arr.length - 1 ) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
            bubbleSort(arr, i, j + 1);
        } else {
            bubbleSort(arr, i + 1, 0);
        }
    }


    public static void main(String[] args) {
        int[] arr = {5,1,6,2} ;
        bubbleSort(arr, 0, 0);
        System.out.println(Arrays.toString(arr));







    }
}
