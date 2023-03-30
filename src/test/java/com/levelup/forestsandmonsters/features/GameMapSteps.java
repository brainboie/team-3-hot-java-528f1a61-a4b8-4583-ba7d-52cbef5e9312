package com.levelup.forestsandmonsters.features;

import static org.junit.Assert.*;

import org.junit.Test;

import com.levelup.forestsandmonsters.*;

public class GameMapSteps {
    @Test
    public void initializationNumberOfPositions() {
        GameMap GM=new GameMap();
        assertEquals(100, GM.numPositions);
    }
    @Test
    public void initislizaeStartingPosition () 
    {
        GameMap GM=new GameMap ();
        assertEquals(0, GM.startingPosition.coordinates.x);
        assertEquals(0, GM.startingPosition.coordinates.y);
    }
}



