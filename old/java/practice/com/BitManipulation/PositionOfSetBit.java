package com.BitManipulation;

public class PositionOfSetBit {
    public static void main(String[] args) {
        int n =     -4 ;
        int count = 0 , pos = 0 ;
        while(count<=0){
            if(n == 0){
                break ;
            }else{
                if((n&1) != 0){
                    count++ ;
                }else{
                    n = n>>1 ;
                }
                pos++ ;
            }
        }
        System.out.println(pos);


    }
}
