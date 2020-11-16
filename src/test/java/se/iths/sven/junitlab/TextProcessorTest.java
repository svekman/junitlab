package se.iths.sven.junitlab;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class TextProcessorTest {

    @Test
    @DisplayName("Testar göra små bokstäver av stora")
    void testLowerLetters() {
        TextProcessor ord = new TextProcessor();
        //System.out.println(ord.reverseLetters("BAH"));
        assertEquals("bah", ord.lowerLetters("BAH"));
    }

    @Test
    @DisplayName("Ändring till stora bokstäver ger inte null")
    void testUpperLetters(){
        TextProcessor ord = new TextProcessor();
        assertNotNull(ord.upperLetters("REP"));
    }

    @Test
    @DisplayName("Palindromvändning?")
    void testReverse(){
        TextProcessor ord = new TextProcessor();
        assertEquals("adolf i floda", ord.reverseLetters("adolf i floda"));
    }
}
