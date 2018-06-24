package com.company;

public class FishMaster
{
	public static void main(String[] args)
    {
		Fish myFish = new Fish(20);

		//Try to have the fish go below 100 feet

		myFish.dive(2); //go 2 feet down
		myFish.dive(97); //go another 97 feet down
		myFish.dive(3); //go another 3 feet down
		myFish.say("Don't you know fish don't talk?");
		myFish.sleep();
	}
}
