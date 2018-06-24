package com.company;

public class Car
{
    int distance = 77777;

    public void start()
    {
        System.out.println("The car has started moving to Pune");
    }

    public void stop()
    {
        System.out.println("The car has reached Pune after driving for " + distance + " miles");
    }

    public int drive(int howlong)
    {
        distance = howlong * 60;
        System.out.println("This car will go for " + distance + " miles");
        return distance;
    }
}
