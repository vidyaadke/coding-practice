package Maths;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerOfThreeTest {
    PowerOfThree powerOfThree;

    @BeforeEach
    void init(){
        powerOfThree = new PowerOfThree();
    }

    @Test
    void isPowerOfThree() {
        assertEquals(true, powerOfThree.isPowerOfThree(3));
        assertEquals(true, powerOfThree.isPowerOfThree(9));
        assertEquals(true, powerOfThree.isPowerOfThree(27));
        assertEquals(false, powerOfThree.isPowerOfThree(5));
        assertEquals(true, powerOfThree.isPowerOfThree(0));
    }
}