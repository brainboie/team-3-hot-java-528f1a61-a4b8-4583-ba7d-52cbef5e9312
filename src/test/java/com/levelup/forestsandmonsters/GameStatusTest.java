package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;


public class GameStatusTest {
    
    @Test
    public void initializationCreatesResults() {
        GameStatus testObj = new GameStatus();
        assertNotNull(testObj.getCharacterName());
    }
    @Test
    public void initializationPos() {
        GameStatus testObj = new GameStatus();
        assertNotNull(testObj.getCurrentPosition());
    }

    @Test
    public void toStringTest() {
        GameStatus testObj = new GameStatus();
        assertNotNull(testObj.toString());
    }

}
