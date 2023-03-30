package com.levelup.forestsandmonsters;
import java.awt.Point;

public class GameStatus {
    private String characterName;
    private Point currentPosition;
    
    public String getCharacterName()
    {
        return this.characterName;
    }
    public Point getCurrentPosition()
    {
        return this.currentPosition;
    }
    public  GameStatus(String charName, int currX, int currY ){
        
        this.characterName  = "charName"; 
        currentPosition.x = currX;
        currentPosition.y = currY;
    }

    public  GameStatus(){
        
        this.characterName  = "test"; 
        currentPosition = new Point(0, 0);
    }
    @Override
    public String toString() {
        String str = "Character name is " + characterName + " Position = " + currentPosition.toString();
        return str;
    }
}
