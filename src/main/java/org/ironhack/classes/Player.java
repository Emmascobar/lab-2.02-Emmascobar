package org.ironhack.classes;

public class Player {
    private int health;
    private int lives;
    private int strenght;

    private final int ORIGINAL_HEALTH = 100;

    public Player(int health, int lives, int strenght) {
        this.health = health;
        this.lives = lives;
        this.strenght = strenght;

    }

    public int decrementZero() {
        if (health <= 0) {
            lives--;
            health = ORIGINAL_HEALTH;
        }
        return health;
    }
        public int getHealth () {
            return health;
        }

        public int setHealth (int health){
            this.health = health;
            return health;
        }

        public int getLives () {
            return lives;
        }

        public void setLives ( int lives){
            this.lives = lives;

        }

        public int getStrenght () {
            return strenght;
        }

        public void setStrenght ( int strenght){
            this.strenght = strenght;
        }

        public void attack (Player playerAttack){
            playerAttack.setHealth(playerAttack.getHealth() - this.getStrenght());
        }
    }
