package com.levelup.forestsandmonsters;

public class Character {
    static final String DEFAULT_CHARACTER_NAME = "Character";

    public String name;

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

}
