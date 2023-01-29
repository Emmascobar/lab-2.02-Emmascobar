package org.ironhack.subclasses;

import org.ironhack.classes.Player;

public class Warrior extends Player {

    private int force;

    public Warrior(int health, int lives, int strenght, int force) {
        super(health, lives, strenght);
        this.force= force;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }
}
