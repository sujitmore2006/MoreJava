package com.company;
public class MeArray
{
    public static void main(String[] args)
    {
        String players[] ;
        players = new String[4];
        players[0] = "David";
        players[1] = "Daniel";
        players[2] ="Anna";
        players[3] = "Gregory";
        int totalPlayers = players.length;
        System.out.println("The number of players in the array is" + " " + totalPlayers);
        int counter;

        for(counter =0; counter < totalPlayers; counter++ )
        {
            String thePlayer = players[counter];
            System.out.println("Congratulations" + " " + thePlayer);

        }

        for(String x:players)
        {
            System.out.println("Congratulation" + "," + x + "!!");
        }

        for (counter = 0; counter< 4; counter++)
        {

            System.out.println(counter);
        }
    }
}
