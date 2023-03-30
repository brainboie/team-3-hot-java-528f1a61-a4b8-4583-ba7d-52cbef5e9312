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
/* 
    @Test
    public void initializationStartingPosition() {
        
    }

    /**@Test
    public void enterMap(GameMap map){
        Character testChar = new Character("Lance");
        testChar.enterMap(map);
        assertNotNull(testChar.map);
        assertEquals(testChar.map, map);
    }
    */

}



