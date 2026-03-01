package com.OOPS;


class Test{
    String name ;


    Test(String name){
        this.name = name ;
    }
}

public class LearningAboutStatic {



    static void main(String[] args) {
        Test a = new Test("dev") ;
        System.out.println(a.name);
    }
}
