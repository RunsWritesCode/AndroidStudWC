package com.example.codeclan.wordcounter;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by sophiemullins on 18/12/2017.
 */

public class WordCountTest {

   WordCount wordCount;


    @Before
    public void before(){
        wordCount = new WordCount();
    }


    @Test
    public void canCountWords() {
        WordCount wordCount = new WordCount();
        assertEquals(4, wordCount.countWords("one two three four"));
    }

}
