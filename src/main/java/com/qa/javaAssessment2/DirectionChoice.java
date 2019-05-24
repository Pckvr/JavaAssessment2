package com.qa.javaAssessment2;

public class DirectionChoice{
	
	Utilities.input();
	private String directionChoice;
	
	public DirectionChoice(String directionChoice) {
		this.directionChoice = directionChoice;
	}
	
	public String getDirectionChoice() {
		return directionChoice;
	}

	public void setDirectionChoice(String directionChoice) {
		
		this.directionChoice = Utilities.input("Which direction would you like to go?");
		
	}
	
}
