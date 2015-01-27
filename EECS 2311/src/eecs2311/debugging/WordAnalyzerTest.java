package eecs2311.debugging;

import static org.junit.Assert.*;
import org.junit.*;

public class WordAnalyzerTest {

    WordAnalyzer wa;
    
    @Test
    public void testFirstRepeatedCharacter() {
        wa = new WordAnalyzer("aardvark");
        assertEquals('a', wa.firstRepeatedCharacter());
        wa = new WordAnalyzer("roommate");
        assertEquals('o', wa.firstRepeatedCharacter());
        wa = new WordAnalyzer("mate");
        assertEquals(0, wa.firstRepeatedCharacter());
        wa = new WordAnalyzer("test");
        assertEquals(0, wa.firstRepeatedCharacter());        
    }

    @Test
    public void testFirstMultipleCharacter() {
        wa = new WordAnalyzer("mississippi");
        assertEquals('i', wa.firstMultipleCharacter());
        wa = new WordAnalyzer("mate");
        assertEquals(0, wa.firstMultipleCharacter());
        wa = new WordAnalyzer("test");
        assertEquals('t', wa.firstMultipleCharacter());
    }

    @Test
    public void testCountRepeatedCharacters() {
        wa = new WordAnalyzer("mississippiii");
        assertEquals(4, wa.countRepeatedCharacters());
        wa = new WordAnalyzer("test");
        assertEquals(0, wa.countRepeatedCharacters());
        wa = new WordAnalyzer("aabbcdaaaabb");
        assertEquals(4, wa.countRepeatedCharacters());
        
    }

}
