package com.company;

public class Fish extends Pet 
{
    int currentDepth;

    Fish(int currentDepth){
        this.currentDepth = currentDepth;
    }
	
	public int dive(int howDeep)
    {
		currentDepth = currentDepth + howDeep;
		if (currentDepth > 100)
		{
			System.out.println("I am a little fish and I can't dive below 100ft");
			currentDepth = currentDepth - howDeep;
		}
		else
		{
			System.out.println("Diving for " + howDeep + " feet");
			System.out.println("I'm at " + currentDepth + " feet below sea level");
		}
		return currentDepth;
	}
    public String talk(String something)
    {
        return "Don't you know that fish don't talk";
    }
}
