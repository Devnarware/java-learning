package com.OOPS.Comparable;

import java.util.Arrays;

public class Main {

    static void main(String[] args) {


        Students dev = new Students(80.0f , 21) ;
        Students kunal = new Students(76.0f , 12) ;
        Students anu = new Students(96.4f , 13) ;
        Students mayank = new Students(98.0f , 14) ;
        Students rinku = new Students(75.0f , 15) ;
        Students aditya = new Students(96.0f , 16) ;

        Students[] list = {dev ,kunal , anu , mayank , rinku , aditya} ;


        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));



//        if (kunal.compareTo(dev) > 0){
//            System.out.println("kunal got more marks then dev");
//        }else{
//            System.out.println("dev got more marks");
//        }
//
//        System.out.println(kunal.compareTo(dev));
    }

}
