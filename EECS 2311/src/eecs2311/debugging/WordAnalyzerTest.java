package eecs2311.debugging;

import static org.junit.Assert.*;
import org.junit.*;

public class WordAnalyzerTest {

    WordAnalyzer wa;
    
    @Test
    public void testFirstRepeatedCharacter() {
        wa = new WordAnalyzer("aardvark");
        assertSame('a', wa.firstRepeatedCharacter());
        wa = new WordAnalyzer("roommate");
        assertSame('o', wa.firstRepeatedCharacter());
        wa = new WordAnalyzer("mate");
        assertSame(0, wa.firstRepeatedCharacter());
        wa = new WordAnalyzer("test");
        assertSame(0, wa.firstRepeatedCharacter());        
    }

    @Test
    public void testFirstMultipleCharacter() {
        wa = new WordAnalyzer("mississippi");
        assertSame('i', wa.firstMultipleCharacter());
        wa = new WordAnalyzer("mate");
        assertSame(0, wa.firstMultipleCharacter());
        wa = new WordAnalyzer("test");
        assertSame('t', wa.firstMultipleCharacter());
    }

    @Test
    public void testCountRepeatedCharacters() {
        wa = new WordAnalyzer("mississippiii");
        assertSame(4, wa.countRepeatedCharacters());
        wa = new WordAnalyzer("test");
        assertSame(0, wa.countRepeatedCharacters());
        wa = new WordAnalyzer("aabbcdaaaabb");
        assertSame(4, wa.countRepeatedCharacters());
        
    }

}
