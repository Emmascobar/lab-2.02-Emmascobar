package org.ironhack.subclasses;

import org.ironhack.classes.Player;

public class Elf extends Player {

    private int shield;

    public Elf(int health, int lives, int strenght, int mana) {
        super(health, lives, strenght);
        this.shield = shield;
    }

    public int getShield() {
        return shield;
    }

    public void setShield(int shield) {
        this.shield = shield;
    }
}
