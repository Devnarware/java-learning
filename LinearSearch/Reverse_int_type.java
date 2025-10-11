package com.LinearSearch;

public class Reverse_int_type {

    public static int linearSearch(int[] arr , int target , int i){
        if(i<0){
            return -1 ;
        }
        if(arr[i] == target){
            return i ;
        }   
        else{
            return linearSearch(arr , target , i-1) ;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,5,2,5,7,23,23} ;
        int key = 23 ;
        System.out.println(linearSearch(arr , key , arr.length-1));


    }
}

