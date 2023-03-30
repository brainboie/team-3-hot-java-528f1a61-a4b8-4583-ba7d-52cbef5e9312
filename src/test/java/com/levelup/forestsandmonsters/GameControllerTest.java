package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.levelup.forestsandmonsters.GameController.DIRECTION;

public class GameControllerTest {
    @Test
    public void initializationCreatesResults() {
        GameController testObj = new GameController();
        assertNotNull(testObj.status);
    }

    @Test
    public void testFakeCharacterEnteringFakeMap() {
        Character fakeCharacter = new Character("George Dragon");
        GameMap fakeMap = new GameMap();

        fakeCharacter.enterMap(fakeMap);
        fakeCharacter.move(DIRECTION.NORTH);
        fakeCharacter.move(DIRECTION.EAST);
        
        assertEquals(1, fakeCharacter.getPosition().coordinates.x);
        assertEquals(1, fakeCharacter.getPosition().coordinates.y);
        
        
    }

}
