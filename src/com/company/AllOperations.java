package com.company;

import java.math.*;

public class AllOperations
{

	public int multiply(int x, int y) 
	{
		int result = x * y;
		return result;
	}

	public int add(int x, int y) 
	{	
		int result = x + y;
		return result;
	}
	
	public int subtract(int a, int b) 
	{
		int result = a - b;
		return result;		
	}

	public int divide(int x, int y) 
	{
		int result = x / y;
		return result;
	}
	
	public int mod(int x, int y) 
	{
		int result = x % y;
		return result;
	}
	
	public double compute() 
	{
		double x = 25.5;
		double y = 3.5;
		double z = 40.5;
		double a = 4.5;
		double result = ((x * y - y * y) / (z - a));
		return result;
		}
	
	public double area(double x)
	{
		double result = x * x * Math.PI;	
		return result;			
	}
	
	public double perimeter(double x)
	{
		double result = (x * 2) * Math.PI;
		return result;				
	}
	
	public int average(int x, int y, int z) 
	{
		int result = (x + y + z) / 3;
		return result;
	}
	
}
