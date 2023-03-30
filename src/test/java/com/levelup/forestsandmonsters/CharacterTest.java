package com.levelup.forestsandmonsters;

import static org.junit.Assert.*;

import org.junit.Test;

public class CharacterTest {
    @Test
    public void initializationChracaterName() {
        Character testObj = new Character();
        assertNotNull(testObj.name);
    }

    @Test
    public void initializationCharacterNameBeLance() {
        Character testObj = new Character("Lance");
        assertEquals(testObj.name, "Lance");
    }

}


