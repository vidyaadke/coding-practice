package Maths;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberTest {

    PrimeNumber primeNumber;

    @BeforeEach
    void init(){
         primeNumber = new PrimeNumber();
    }

    @Test
    void getAllPrimeNumbers_1() {
        List<Integer> expectedValues = List.of(2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,
            97,101,103,107,109,113,127,131,137,139,149);
        List<Integer> outputNumbers = primeNumber.getAllPrimeNumbers(150);
        assertEquals(35,outputNumbers.size());
        assert (outputNumbers.containsAll(expectedValues));

    }

    @Test
    void getAllPrimeNumbers_2() {
        List<Integer> expectedValues = List.of(2,3,5,7);
        List<Integer> outputNumbers = primeNumber.getAllPrimeNumbers(10);
        assertEquals(4,outputNumbers.size());
        assert (outputNumbers.containsAll(expectedValues));

    }

    @Test
    void getAllPrimeNumbers_3() {
        List<Integer> outputNumbers = primeNumber.getAllPrimeNumbers(1);
        assertEquals(0,outputNumbers.size());
    }
}