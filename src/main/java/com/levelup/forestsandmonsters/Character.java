package com.levelup.forestsandmonsters;

import java.awt.Point;

public class Character {
    static final String DEFAULT_CHARACTER_NAME = "Character";

    public String name;
    private GameMap map;
    private Point position;

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
    }

    public String getName() {
        return this.name;
    }

    public Point getPosition() {
        return this.position;
    }

}
