package com.ironhack.mavendemo.utils;
import org.ironhack.classes.Player;
import org.ironhack.subclasses.Elf;
import org.ironhack.subclasses.Warrior;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {

    private Player player1;
    private Player player2;

    @BeforeEach
    void setUp() {
        player1 = new Elf(200, 2,100,60);
        player2= new Warrior(200, 2, 100, 90);
    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void decrementLives_Player_down() {
    assertEquals(200, player1.decrementZero());
    }

    @Test
    void health_Playerattack_down() {
        assertEquals(100, player1.setHealth(player1.getHealth()-player2.getStrenght()));
    }

}
