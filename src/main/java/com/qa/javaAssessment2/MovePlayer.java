package com.qa.javaAssessment2;

public class MovePlayer extends PlayerPosition{


	public void movePlayer() {
		PlayerPosition playerPosition = new PlayerPosition();
		
		boolean continueGame = true;
		
		while(continueGame == true) {
		
			String directionChoice = Utilities.input("Which direction would you like to go? NORTH, SOUTH, EAST or WEST").toUpperCase();
			
			if( directionChoice.equals("NORTH")) {
				setPlayerY(getPlayerY()+1);
				
				if(Utilities.input("Would you like to continue?" ).equals("yes")) {
					continueGame = true;
				}
				else {
					continueGame = false;
				}
				
				
				}
			else if (directionChoice.equals("SOUTH")) {
				setPlayerY(getPlayerY()-1);

				if(Utilities.input("Would you like to continue?" ).equals("yes")) {
					continueGame = true;
				}
				else {
					continueGame = false;
				}
			}
			else if (directionChoice.equals("EAST")) {
				setPlayerX(getPlayerX()+1);

				if(Utilities.input("Would you like to continue?" ).equals("yes")) {
					continueGame = true;
				}
				else {
					continueGame = false;
				}
			}
			else if (directionChoice.equals("WEST")) {
				setPlayerX(getPlayerX()+1);

				if(Utilities.input("Would you like to continue?" ).equals("yes")) {
					continueGame = true;
				}
				else {
					continueGame = false;
				}
			}
			else {
				System.out.println("Invalid direction");
			};
		
	System.out.println(playerX);
	System.out.println(playerY);
		
	}
}
}
