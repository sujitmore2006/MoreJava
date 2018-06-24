package com.company;

public class Shape
{
    int width;
    int height;
    int lenght;

    public Shape(int x, int y, int z)
    {
        width = x;
        height = y;
        lenght = z;
    }

    public void volume()
    {
        int result = height * width * lenght;
        System.out.println("The volume of the box is: " + result);
    }

}
