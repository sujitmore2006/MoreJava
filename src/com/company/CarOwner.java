package com.company;

public class CarOwner {
    public static void main(String[] args) {
        /* Car myCar = new Car();
        myCar.start();
        myCar.drive(100);
        myCar.stop(); */

        Car jCar = new JamesBondCar();
        jCar.start();
        jCar.drive(300);
        jCar.stop();
    }
}