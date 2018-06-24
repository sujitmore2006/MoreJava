package com.company;

public class Game {

	public static void main(String[] args) {
		startGame();
		readScore(7);
		stopGame();
		
	}
	
	public static void startGame() {
		System.out.println("Let the Games begin!");
	}
	 
	public static int readScore(int c) {
		int a = 2;
		int b = 3;
		int x = a + b + c;
		System.out.println("The Score is : " + x);
		return x;
	}
	
	public static void stopGame() {
		System.out.println("The Game has Stopped");
	}
}
