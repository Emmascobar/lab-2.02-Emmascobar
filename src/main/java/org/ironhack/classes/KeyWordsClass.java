package org.ironhack.classes;

public class KeyWordsClass {

    private static String[] keywordsList = { "abstract", "break", "boolean", "continue", "implements",
            " return ", " transient ", " catch ", " extends "," int", " short ", " try ", " char ", " final ", " interface " };


    public static boolean keyword(String word){
        for(String keyword : keywordsList){
            if(word.contains(keyword));
            return true;
        }
        return false;
    }

}

