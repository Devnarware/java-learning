package com.OOPS;

class Car{

    String brand ;
    String engineType ;
    int price ;
    int seats ;

    Car(){
        this.brand = "Maruti-Suzuki" ;
        this.engineType = "Diesel" ;
        this.price = 500000 ;
        this.seats = 4 ;
    }

    Car(String brand , String engineType , int price , int seats){
        this.brand = brand ;
        this.engineType = engineType ;
        this.price = price ;
        this.seats = seats ;
    }
    



}

public class Main {

    static void main(String[] args) {


        Car randomCar = new Car() ;

        System.out.println(randomCar.brand);
        System.out.println(randomCar.engineType);
        System.out.println(randomCar.price);
        System.out.println(randomCar.seats);

        System.out.println("------------------------------------------------------------");


        Car myCar = new Car("Ferrari" , "Petrol" , 15000000 , 2) ;

        System.out.println(myCar.brand);
        System.out.println(myCar.engineType);
        System.out.println(myCar.price);
        System.out.println(myCar.seats);


        System.out.println("------------------------------------------------------------");


        Car myCar2 = new Car("BMW" , "Petrol" , 25000000 , 4) ;

        System.out.println(myCar2.brand);
        System.out.println(myCar2.engineType);
        System.out.println(myCar2.price);
        System.out.println(myCar2.seats);
    }



}
