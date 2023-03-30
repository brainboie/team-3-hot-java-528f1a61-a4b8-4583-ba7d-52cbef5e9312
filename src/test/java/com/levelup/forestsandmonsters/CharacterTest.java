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

}


