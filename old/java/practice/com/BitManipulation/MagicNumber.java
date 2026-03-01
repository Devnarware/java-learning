package com.BitManipulation;

public class MagicNumber {

    public static void magicNum(int n ){
        int ans = 0;
        int base = 5 ;
        while(n>0){
            int lastDigit = n&1 ;
            ans = ans + base*lastDigit ;
            base = base*5 ;
            n = n>>1 ;
        }
        System.out.println(ans);


    }

    public static void main(String[] args) {
        int n = 6 ;
        magicNum(n);
        int count = 1 ;
        int lastDigit ;
        int ans = 0 ;
        while (n>0){
            lastDigit = n&1 ;
            if(lastDigit == 1){
                ans = ans + (int)Math.pow(5, count) ;
            }
            count++ ;
            n = n>>1 ;

        }
        System.out.println(ans);

    }
}
