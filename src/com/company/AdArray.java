package com.company;

public class AdArray
{
     public static void main(String[] args)
     {
         String[] players = {" David", " Danial", " Anna", " Gregory"};

         int totalPlayers = players.length;
         System.out.println("The number of players in the array : " + totalPlayers);

         //starting my loop code
         int counter;

         for(counter = 0; counter < totalPlayers; counter++)
         {
             String thePlayer = players[counter];
             System.out.println("Congrats BRO!! " + thePlayer + "!!!!!");
         }

         for (String x: players)
         {
             System.out.println(" Congrats BRO!! " + x + "!!!! , ");
         }
     }
}
