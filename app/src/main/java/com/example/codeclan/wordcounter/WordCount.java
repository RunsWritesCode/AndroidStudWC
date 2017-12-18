package com.example.codeclan.wordcounter;


/**
 * Created by sophiemullins on 18/12/2017.
 */



public class WordCount {

    public String words;


    public static int countWords(String input) {
        if (input == null || input.isEmpty()) {
                return 0;
            }
        String[] words = input.split("\\s+"); return words.length;
    }

}


//pure java code
