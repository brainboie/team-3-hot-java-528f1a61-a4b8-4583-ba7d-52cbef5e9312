package com.levelup.forestsandmonsters;

import java.awt.Point;

public class Position {
    public Point coordinates;
    // Constructor to create new Point with provided x and y coordinates
    public Position(int xCoordinates, int yCoordinates) {
        coordinates = new Point(xCoordinates, yCoordinates);
    }
}
