package com.OOPS.Cloning;

import java.util.Arrays;

public class Cloning {

    public static class Human implements Cloneable{
        int age ;
        String name ;
        int[] arr = new int[] {} ;

        Human(int age, String name, int[] arr){
            this.name = name ;
            this.age = age ;
            this.arr = arr ;
        }

        public Human(Human other){
            this.name = other.name ;
            this.age = other.age ;
            this.arr = other.arr ;
        }

        public Object clone() throws CloneNotSupportedException{
            return super.clone() ;
        }
    }

    static void main(String[] args) throws CloneNotSupportedException{

        int[] arr = {1,2, 3, 4} ;
        Human dev = new Human(19, "Dev", arr) ;
        Human twin = (Human)dev.clone() ;

        twin.arr[0] = 200 ;

        System.out.println(Arrays.toString(dev.arr));
    }
}
