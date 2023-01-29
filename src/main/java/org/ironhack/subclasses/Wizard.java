package org.ironhack.subclasses;

import org.ironhack.classes.Player;

public class Wizard extends Player {

    private int magic;

    public Wizard(int health, int lives, int strenght, int magic) {
        super(health, lives, strenght);
        this.magic = magic;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }
}
