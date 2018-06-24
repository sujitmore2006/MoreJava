package com.company;

public class JamesBondCar extends Car
{
    @Override
    public int drive(int howlong)
    {
        distance = howlong * 180;
        System.out.println("Man this car is really FAST... James Bond is going at " + distance + " miles");
        return distance;
    }
}
