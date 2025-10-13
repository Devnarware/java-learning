package com.Patters;

public class LowerTriangle {

    public static void lowerTriangle(int r, int c){
        if(r == 0){
            return ;
        }
        if(r>c){
            System.out.print("* ") ;
            lowerTriangle(r, c+1);
        }else{
            System.out.println();
            lowerTriangle(r-1, 0);
        }
    }

    public static void main(String[] args) {
        lowerTriangle(4, 0);
    }

}
