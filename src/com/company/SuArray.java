package com.company;

public class SuArray
{
    public static void main(String[] args)
    {
        String players [] = {"David","Daniel","Anna","Gregory"};

        int totalPlayers = players.length;
        System.out.println("The number of players in the array are: " + totalPlayers);

        //starting my loop code
        int counter;

        for(counter = 0; counter < totalPlayers; counter++)
        {
            String thePlayer = players[counter];
            System.out.println("Congratulations " + thePlayer + "!!!!");
        }

        for(String x: players)
        {
            System.out.println("Congratulations " + x + "!!!!");
        }
    }
}
