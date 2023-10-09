package de.ait.homework34;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringProcessorTest {

    private StringProcessor stringProcessor;

    @BeforeEach
    public void setUp(){
        stringProcessor=new StringProcessor();
    }

    @Test
    public void testConcatenateLiteralMeaning (){
        assertEquals("homework",stringProcessor.concatenate("home","work"));
    }
    @Test
    public void testConcatenateDigitalLiteralMeaning (){
        assertEquals("COVID-19",stringProcessor.concatenate("COVID","-19"));
    }
    @Test
    public void testConcatenateDigitalMeaning (){
        assertEquals("2023",stringProcessor.concatenate("20","23"));
    }

    @Test
    public void testGetLengthLineEinWord(){
        assertEquals(5,stringProcessor.getLength("world"));
    }
    @Test
    public void testGetLengthLineWithSpace(){
        assertEquals(11,stringProcessor.getLength("Hello world"));
    }

    @Test
    public void testReverseEinWord(){
        assertEquals("drow",stringProcessor.reverse("word"));
    }

    @Test
    public void testReverseEinWordCapitalLetter(){
        assertEquals("droW",stringProcessor.reverse("Word"));
    }
    @Test
    public void testReverseWordsWithSpace(){
        assertEquals("dlrow ollaH",stringProcessor.reverse("Hallo world"));
    }

    @Test
    public void testisPalindromePositivEinWord() {
        assertEquals(true,stringProcessor.isPalindrome("level"));
    }

    @Test
    public void testisPalindromeNegativeEinWord() {
        assertEquals(false,stringProcessor.isPalindrome("dog"));
    }

    @Test
    public void testisPalindromePositiveSentence() {
        assertEquals(true,stringProcessor.isPalindrome("able was I saw elba"));
    }

    @Test
    public void testisPalindromeNegativeSentence() {
        assertEquals(false,stringProcessor.isPalindrome("I am a programmer"));
    }

}
