package com.LinearSearch.ArrayList_type;
import java.util.* ;


public class ListInFunction {

    public static ArrayList<Integer> linearSearch(int[] arr , int target , int i ){
        ArrayList<Integer> list  = new ArrayList<>();
        if(i>=arr.length){
            return list ;
        }
        if(arr[i] == target){
            list.add(i) ;
        }

        ArrayList<Integer> oldList = linearSearch(arr ,target , i+1 ) ;
        list.addAll(oldList) ;
        return list ;

    }


    public static void main(String[] args) {
        int[] arr = {1,23,2,5,7,23,3} ;
        int key = 23 ;
        ArrayList<Integer> list = linearSearch(arr , key ,0) ;
        System.out.println(list);


    }
}

