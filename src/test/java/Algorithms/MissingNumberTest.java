package Algorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingNumberTest {

    MissingNumber missingNumber;

    @BeforeEach
    void init(){
        missingNumber = new MissingNumber();
    }

    @Test
    void findMissingNumbers() {
        missingNumber.findMissingNumbers(new Integer[]{4,6,7,8,1,2});
    }
}