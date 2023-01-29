package com.ironhack.mavendemo.utils;
import org.ironhack.classes.KeyWordsClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class KeywordsTest {

    private KeyWordsClass wordTest;

    @BeforeEach
    void setUp() {
        wordTest = new KeyWordsClass();
    }

    @AfterEach
    void tearDown() {

    }
    void Keywords_ListWords_true() {
        assertEquals(true, wordTest.keyword("Dont break my heart"));
        assertEquals(false, wordTest.keyword("I love to breakdance"));
    }
}
