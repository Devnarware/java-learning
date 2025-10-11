package com.LinearSearch;
public class Boolean_type {

    public static boolean linearSearch(int[] arr , int target , int i){
        if(i>=arr.length){
            return false ;
        }
        if(arr[i] == target){
            return true ;
        }
        else{
            return linearSearch(arr , target , i+1) ;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,5,2,5,7,23,3} ;
        int key = 231 ;
        System.out.println(linearSearch(arr , key , 0));


    }
}

