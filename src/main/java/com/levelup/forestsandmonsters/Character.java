package com.levelup.forestsandmonsters;

import java.awt.Point;

import com.levelup.forestsandmonsters.GameController.DIRECTION;

public class Character {
    static final String DEFAULT_CHARACTER_NAME = "Character";

    public String name;
    private GameMap map;
    private Position position;
    private int moveCount;

    public Character() {
        name = DEFAULT_CHARACTER_NAME;
    }

    public Character(String name) {
        if (name != null && !name.trim().equals("")) {
            this.name = name.trim();
        } else {
            this.name = DEFAULT_CHARACTER_NAME;
        }
    }

    public void enterMap(GameMap map) {
        this.map = map;
        this.position = map.startingPosition;
    }

    public String getName() {
        return this.name;
    }

    public Position getPosition() {
        return this.position;
    }

    public int getMoveCount() {
        return moveCount;
    }

    public void move(DIRECTION directionToMove) {
        /** 
        Position newPosition = map.calcuratePosition(this.position, directionToMove);
        if isPositionValid(newPosition.coordinates) {
            position = newPosition;
        }
        */
        // TODO: this return fake position of (1,1)
        position = new Position(1,1);
    }

    public void setMoveCount(int moveCount) {
        this.moveCount = moveCount;
    }

    public void setCharacterPosition(Point coordinates) {
        position.coordinates = coordinates;
    }

}
