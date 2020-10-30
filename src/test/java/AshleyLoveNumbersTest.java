import DataStructure.AshleyLoveNumbers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class AshleyLoveNumbersTest {

    AshleyLoveNumbers ashleyLoveNumbers;

    @BeforeEach
    void init(){
        ashleyLoveNumbers = new AshleyLoveNumbers();
    }

    @Test
    void findUniqueNumbers_positive() {
        Set<Integer> expectedValues =  new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        Set<Integer> outputValues = ashleyLoveNumbers.findUniqueNumbers(new int[]{1,2,2,3,3,4,3,5,5,6});
        assertEquals(true, expectedValues.containsAll(outputValues));
    }

    @Test
    void findUniqueNumbers_negative() {
        Set<Integer> expectedValues =  new HashSet<>(Arrays.asList(-1,1,-2,2,3,4,5,6));
        Set<Integer> outputValues = ashleyLoveNumbers.findUniqueNumbers(new int[]{-1,1,-1,-2,2,3,3,4,3,5,5,6});
        assertEquals(true, expectedValues.containsAll(outputValues));
    }
}