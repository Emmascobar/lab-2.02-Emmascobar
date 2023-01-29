package com.ironhack.mavendemo.utils;

import org.ironhack.classes.Impares;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

public class ImparesTest {

    Impares impares;

    @BeforeEach
    void setUp() {

        impares = new Impares();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void createArray_Intsodds_NewArray() {
        int[] expectedResult = {1, 3, 5};
        List<Integer> result = impares.arrayImpares(5);
    }
}