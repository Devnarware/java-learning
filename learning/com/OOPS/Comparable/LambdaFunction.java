package com.OOPS.Comparable;

import java.util.ArrayList;

import static java.lang.Integer.sum;

public class LambdaFunction {

    static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>() ;
        for (int i = 0; i < 5; i++) {
            list.add(i+1) ;
        }

        list.forEach(n -> System.out.print(n + " "));

//        for (Integer n : list){
//            System.out.println(n);
//        }


        Operation sum = (a, b) -> a+b ;
        Operation product = (a, b) -> a*b ;

    LambdaFunction calc = new LambdaFunction() ;

//        System.out.println(calc.operate(2, 5, sum));
//        System.out.println(calc.operate(2, 5, product));


    }

    private int operate(int a, int b, Operation op) {
        return op.operation(a, b) ;
    }
    interface Operation{
        int operation(int a, int b) ;
    }
}
