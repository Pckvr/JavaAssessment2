package com.qa.javaAssessment2;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Before;
import org.junit.Test;

public class MovementTest {
	
	@Before
	public void setup() {
		System.out.println("Test Begin");
	}

	
	@Test
	public void xPosition() {
		PlayerPosition playerPosition = new PlayerPosition(0,0);
		playerPosition.setPlayerX(4);
		playerPosition.setPlayerY(0);
		assertEquals("Set Position error", 4, playerPosition.getPlayerX());
		
	}
	
	@Test

	
	
	
	@Test
	public void moveNorth() {
		
		Swamp swamp = new Swamp();
		Player player = new Player();
		DirectionChoice directionChoice = new DirectionChoice(); // user choice of N,S,E or W
		PlayerPosition playerPosition = new PlayerPosition();	// saves the coordinates of the player (x,y) relative to starting point (0,0)
		
		player.setPlayerY(0);
		player.setDirection("NORTH");
		swamp.movePlayer(player);
		assertEquals("Move North Error", 1, player.getPlayerY());
		
	
	
	
	}
}
