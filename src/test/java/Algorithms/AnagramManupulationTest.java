package Algorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramManupulationTest {

    AnagramManupulation anagramManupulation;

    @BeforeEach
    void init(){
        anagramManupulation = new AnagramManupulation();
    }

    @Test
    void findCount() {
        assertEquals(4,anagramManupulation.findCount("ccdd","ggtt"));
        assertEquals(-1,anagramManupulation.findCount("aaa","aa"));
        assertEquals(2,anagramManupulation.findCount("ddcf","dcek"));
    }
}