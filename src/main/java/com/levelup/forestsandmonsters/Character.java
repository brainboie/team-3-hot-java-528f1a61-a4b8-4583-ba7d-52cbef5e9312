package com.levelup.forestsandmonsters;

import java.awt.Point;

import com.levelup.forestsandmonsters.GameController.DIRECTION;

public class Character {
    public static final String DEFAULT_CHARACTER_NAME = "Character";

    public String name;
    private GameMap map;
    public Position currentPosition;
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
        this.currentPosition = map.startingPosition;
        moveCount = 0;
    }

    public String getName() {
        return this.name;
    }

    public Position getPosition() {
        return this.currentPosition;
    }

    public int getMoveCount() {
        return moveCount;
    }

    public void move(DIRECTION directionToMove) {
        currentPosition = map.calculatePosition(currentPosition, directionToMove);
        moveCount++;
    }

    public void setMoveCount(int moveCount) {
        this.moveCount = moveCount;
    }

    public void setCharacterPosition(Point coordinates) {
        currentPosition.coordinates = coordinates;
    }

}
