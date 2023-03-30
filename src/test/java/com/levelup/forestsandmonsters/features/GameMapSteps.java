package com.levelup.forestsandmonsters.features;

import static org.junit.Assert.*;

import org.junit.Test;

import com.levelup.forestsandmonsters.*;

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
    
}




