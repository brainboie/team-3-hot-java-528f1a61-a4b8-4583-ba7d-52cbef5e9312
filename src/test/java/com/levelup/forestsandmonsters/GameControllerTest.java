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
        GameController gameController = new GameController();
        gameController.createCharacter("George Dragon");
        gameController.startGame();
        
        gameController.move(DIRECTION.SOUTH);
        gameController.move(DIRECTION.EAST);
        
        GameController.GameStatus status = gameController.getStatus();
        assertEquals(1, status.currentPosition.x);
        assertEquals(1, status.currentPosition.y);
    }

}
