package org.ironhack.classes;


import java.util.ArrayList;
import java.util.List;

public class Impares {

    public static List<Integer> arrayImpares(int n) {
        List<Integer> oddarrays = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            if (i % 2 != 0) {
                oddarrays.add(i);
            }
        }
        return oddarrays;
    }
}
