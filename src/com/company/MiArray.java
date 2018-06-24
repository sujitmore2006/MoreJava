package com.company;

public class MiArray
{
    public static void main(String[] args)
    {
        String players [];

        players = new String[4];

        players[0] = "Davis";
        players[1] = "Daniel";
        players[2] = "Anna";
        players[3] = "Gregory";

        for (String x: players) {
            System.out.println("Congratulations " + x + "!");
        }

        int totalPlayers = players.length;
        System.out.println("The number of players in the array are: " + totalPlayers);

        //starting my loop code
        int counter;

        for(counter = 0; counter < totalPlayers; counter++)
        {
            String thePlayer = players[counter];
            System.out.println("Congratulations1, " + thePlayer + "!");
        }
    }
}
