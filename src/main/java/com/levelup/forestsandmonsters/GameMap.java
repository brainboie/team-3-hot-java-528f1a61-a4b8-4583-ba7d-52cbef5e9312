package com.levelup.forestsandmonsters;

import java.awt.Point;

import com.levelup.forestsandmonsters.GameController.DIRECTION;

public class GameMap {
    public Position[][] positions = new Position[10][10];
    public int numPositions = 100;
    public Position startingPosition = new Position(0, 0);

    public GameMap() {
        for(int height=0; height < 9; height++) {
            for(int width=0; width < 9; width++) {
                positions[height][width] = new Position(height, width);
            }
        }
    }

    public int getTotalPositions() {
        return (this.positions.length * this.positions[0].length);
    }

    public boolean isPositionValid(Point positionCoordinates) {
        return ((positionCoordinates.x >= 0) && (positionCoordinates.x <=9) && (positionCoordinates.y >=0 ) && (positionCoordinates.y <=9));
    }

    public Position calculatePosition(Position startingPosition, DIRECTION direction) {
        Position newPosition = new Position(startingPosition.coordinates.x, startingPosition.coordinates.y);
        switch(direction) {
            case NORTH:
                newPosition.coordinates.y--;
                break;
            case SOUTH:
                newPosition.coordinates.y++;
                break;
            case EAST:
                newPosition.coordinates.x++;
                break;
            case WEST:
                newPosition.coordinates.x--;
                break;
        }
        return this.isPositionValid(newPosition.coordinates) ? newPosition : startingPosition;
    }
}
