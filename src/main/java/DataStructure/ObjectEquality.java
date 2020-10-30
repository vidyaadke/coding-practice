package DataStructure;

import java.util.List;

//Class to validate if 2 objects are equal or not
public class ObjectEquality {

    ObjectEqualityModel object1;
    ObjectEqualityModel object2;

    public ObjectEquality(ObjectEqualityModel object1, ObjectEqualityModel object2) {
        this.object1 = object1;
        this.object2 = object2;
    }

    public boolean checkIfEqual(){

        boolean isEqual = false;

        //use equals method to check object equality
        if(object1.equals(object2)){
            isEqual = true;
        }

        return isEqual;
    }
}
