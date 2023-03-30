package com.levelup.forestsandmonsters;

import java.awt.Point;

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
        for(int height=0; height < 9; height++) {
            for(int width=0; width < 9; width++) {
                if (positions[height][width].coordinates == positionCoordinates) {
                    return true;
                }
            }
        }
        return false;
    }
}
