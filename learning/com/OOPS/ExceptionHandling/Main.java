package com.OOPS.ExceptionHandling;

public class Main {

    static void main(String[] args) {

        int a = 5 ;
        int b = 0 ;

        int c = divide(a, b) ;

    }
    static int divide(int a, int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("mat kr lala mt kr") ;
        }
        return a/b ;
    }

}
