import DataStructure.ObjectEquality;
import DataStructure.ObjectEqualityModel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ObjectEqualityTest {

    ObjectEquality objectEquality;

    @BeforeEach
    void init(){

    }

    @Test
    void checkIfEqual_false_1() {

        ObjectEqualityModel object1 = new ObjectEqualityModel("abc", 1);
        ObjectEqualityModel object2 = new ObjectEqualityModel("abc", 1);

        objectEquality = new ObjectEquality(object1, object2);
        assertEquals(false, objectEquality.checkIfEqual());
    }

    @Test
    void checkIfEqual_true() {

        ObjectEqualityModel object1 = new ObjectEqualityModel("abc", 1);
        ObjectEqualityModel object2 = object1;

        objectEquality = new ObjectEquality(object1, object2);
        assertEquals(true, objectEquality.checkIfEqual());
    }

    @Test
    void checkIfEqual_false_2() {

        ObjectEqualityModel object1 = new ObjectEqualityModel("abc", 1);
        ObjectEqualityModel object2 = new ObjectEqualityModel("test", 2);

        objectEquality = new ObjectEquality(object1, object2);
        assertEquals(false, objectEquality.checkIfEqual());
    }



}