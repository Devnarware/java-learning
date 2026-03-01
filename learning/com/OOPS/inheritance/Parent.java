package com.OOPS.inheritance;

class Parent {

    void area(){
        System.out.println("parent area");
    }

    void check(){
        System.out.println("hello");
    }


}


class Child extends Parent{
//    @Override
    void area(){
        System.out.println("child area");
    }

    void area2(){
        System.out.println("area2");
    }
}


class Main{
    static void main(String[] args) {

        Child p = new Child() ;

        System.out.println(p);

    }
}