package com.company;

public class AreaPerimeterRectangle 
{
	
	public static void main(String[] args) 
	{
		double a = 5.5;
		double b = 8.5;
		
		
		TestData2 myOutcome = new TestData2();
		System.out.println("The area of the rectangle is: " + myOutcome.area(a, b) );
		System.out.println("The perimeter of the rectangle is: " + myOutcome.perimeter(a, b));
	}
	
}