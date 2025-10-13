package com.Patters;

public class UpperTriangle {


    public static void upperTriangle(int r, int c){
        if(r == 0){
            return ;
        }
        if(r>c){
            upperTriangle(r, c+1);
            System.out.print("* ") ;
        }else{
            upperTriangle(r-1, 0);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        upperTriangle(4, 0);
    }
}
