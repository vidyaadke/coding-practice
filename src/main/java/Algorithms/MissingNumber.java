package Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//not working
public class MissingNumber {

    public List<Integer> findMissingNumbers(Integer[] array){
        List<Integer> outputList = new ArrayList<>();

        Set<Integer> mySet = new TreeSet<Integer>(Arrays.asList(array));

        int min = ((TreeSet<Integer>) mySet).first();

        for (int i = 0; i < mySet.size(); i++) {
            int number = min + i;
            if (!mySet.contains(number)) {
                System.out.println ("Missing: " + number);
                i--;
            }

        }
        return outputList;
    }
}
