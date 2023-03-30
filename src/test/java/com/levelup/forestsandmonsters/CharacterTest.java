package com.levelup.forestsandmonsters;

import static org.junit.Assert.*;

import org.junit.Test;

public class CharacterTest {
    @Test
    public void initializationCreatesResults() {
        Character testObj = new Character();
        assertNotNull(testObj.name);
    }

    @Test
    public void initializationCreatesWithNameResults() {
        Character testObj = new Character("Lance");
        assertNotNull(testObj.name);
        assertEquals(testObj.name, "Lance");
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


