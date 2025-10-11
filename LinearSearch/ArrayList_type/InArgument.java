package com.LinearSearch.ArrayList_type;
import java.util.* ;


public class InArgument {

    public static ArrayList<Integer> linearSearch(int[] arr , int target , int i , ArrayList<Integer> list){
        if(i>=arr.length){
            return list ;
        }
        if(arr[i] == target){
            list.add(i) ;
        }

        return linearSearch(arr ,target , i+1 ,list) ;

    }


    public static void main(String[] args) {
        int arr[] = {1,23,2,5,7,23,3} ;
        ArrayList<Integer> list = new ArrayList<>() ;
        int key = 23 ;
        System.out.println(linearSearch(arr , key , 0 ,list));


    }
}
