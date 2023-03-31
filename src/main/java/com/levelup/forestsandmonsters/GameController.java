package com.levelup.forestsandmonsters;

import java.awt.Point;

public class GameController {

    static final String DEFAULT_CHARACTER_NAME = "Character";
    Character character;
    GameMap map;
    GameStatus status;

    public class GameStatus {
        public String characterName = DEFAULT_CHARACTER_NAME;
        public Point currentPosition = null;
        public int moveCount = 0;

        public void statusUpdate (){
            status.characterName = character.getName();
            status.currentPosition = character.getPosition().coordinates;
            status.moveCount = character.getMoveCount();
        }
    }

    public GameController() {
        this.status = new GameStatus();
    }

    // TODO: Ensure this AND CLI commands match domain model
    public static enum DIRECTION {
        NORTH, SOUTH, EAST, WEST
    }

    // Pre-implemented to demonstrate ATDD
    // MODIFIED2: delegate to Chracter class
    // MODIFIED1: Input name will be trimmed on both end if it contains while spaces.
    public void createCharacter(String name) {
        this.character = new Character(name);
    }

    // Create map but not character 
    public void startGame() {
        map = new GameMap();
        character.enterMap(map);
        status.statusUpdate();
    }

    public GameStatus getStatus() {
        return this.status;
    }

    public void move(DIRECTION directionToMove) {
        this.character.move (directionToMove);
        status.currentPosition = character.getPosition().coordinates;
        status.moveCount = character.getMoveCount();
    }

    public void setCharacterPosition(Point coordinates) {
        this.character.setCharacterPosition(coordinates);
    }

    public void setCurrentMoveCount(int moveCount) {
        this.character.setMoveCount(moveCount);
    }

    public int getTotalPositions() {
        return map.getTotalPositions();
    }

}
