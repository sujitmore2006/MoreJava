package com.company;

public class TestData1 
{
	
	public static void main(String[] args) 
	{
		int x = 5;
		int y = 6;
		int z = 7;
	
		
		AllOperations myOperation = new AllOperations();
		System.out.println("The average of these three numbers is " + myOperation.average(x, y, z));
	}
}
