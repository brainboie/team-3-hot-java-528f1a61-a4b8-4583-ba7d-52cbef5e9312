package com.levelup.forestsandmonsters.features;

import static org.junit.Assert.*;

import org.junit.Test;

import com.levelup.forestsandmonsters.*;
import com.levelup.forestsandmonsters.GameController.DIRECTION;

import java.awt.Point;

public class GameMapSteps {
    @Test
    public void initializationNumberOfPositions() {
        GameMap GM = new GameMap();
        assertEquals(100, GM.numPositions);
    }
    @Test
    public void initilizeStartingPosition () 
    {
        GameMap GM = new GameMap ();
        assertEquals(0, GM.startingPosition.coordinates.x);
        assertEquals(0, GM.startingPosition.coordinates.y);
    }
    @Test
    public void GetPositionsAreProperSize() {
        GameMap GM = new GameMap();
        // Crude attempt to demonstrate total length of multi-dimensional array
        assertEquals(GM.numPositions, (GM.positions.length * GM.positions[0].length));
    }
    @Test
    public void GetTotalPositionsAreProperAmount() {
        GameMap GM = new GameMap();
        assertEquals(GM.numPositions, GM.getTotalPositions());
    }
    @Test
    public void VerifyInvalidPositionIsInvalid() {
        GameMap GM = new GameMap();
        assertEquals(false, GM.isPositionValid(new Point(11, 11)));
        assertEquals(false, GM.isPositionValid(new Point(0, -1)));
    }
    @Test
    public void isCalculatedPositionValid() {
        GameMap GM = new GameMap();
        // Test moves from 0,0 to 1,0
        assertNotEquals(GM.startingPosition.coordinates.y, GM.calculatePosition(GM.startingPosition, DIRECTION.SOUTH).coordinates.y);
        // Test moves from 0,0 to 0,0
        assertEquals(GM.startingPosition.coordinates.y, GM.calculatePosition(GM.startingPosition, DIRECTION.NORTH).coordinates.y);
        // Test moves from 0,0 to 0,1
        assertNotEquals(GM.startingPosition.coordinates.x, GM.calculatePosition(GM.startingPosition, DIRECTION.EAST).coordinates.x);
        // Test moves from 0,0 to 0,0
        assertEquals(GM.startingPosition.coordinates.x, GM.calculatePosition(GM.startingPosition, DIRECTION.WEST).coordinates.x);
    }
    @Test
    public void isCalculatedPositionInvalid() {
        GameMap GM = new GameMap();
        // Test moves from 0,0 to -1,0 and is reset to 0,0
        assertEquals(GM.startingPosition.coordinates.y, GM.calculatePosition(GM.startingPosition, DIRECTION.NORTH).coordinates.y);
        // Test moves from 0,0 to 0,-1 and is reset to 0,0
        assertEquals(GM.startingPosition.coordinates.x, GM.calculatePosition(GM.startingPosition, DIRECTION.WEST).coordinates.x);
    }
}




