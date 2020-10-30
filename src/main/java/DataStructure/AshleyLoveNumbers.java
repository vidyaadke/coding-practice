package DataStructure;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//Class to find unique numbers from list of numbers (positive/negative)
public class AshleyLoveNumbers {

    public Set<Integer> findUniqueNumbers(int[] inputNumbers) {
        Set<Integer> numbers = new HashSet<>();
        Arrays.stream(inputNumbers).forEach(a -> numbers.add(a));
        return numbers;
    }
}
