package com.levelup.forestsandmonsters;
import java.awt.Point;

public class GameStatus {
    public String characterName;
    public Point currentPosition;
    public  GameStatus(String charName, int currX, int currY ){
        this.characterName  = charName;
        currentPosition = new Point(currX, currY);
    }

    public  GameStatus() {
        this.characterName  = "test"; 
        currentPosition = new Point(0, 0);
    }
    
    @Override
    public String toString() {
        String str = characterName + " has moved to " + currentPosition.x + "," + currentPosition.y + ".";
        return str;
    }
}
