package Maths;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

    public List<Integer> getAllPrimeNumbers(Integer number){
        List<Integer> outputNumbers = new ArrayList<>();

        for(int i = 1; i<= number ; i++){
            int counter = 0;
            for(int num = i ; num >= 1 ; num--){
                if(i % num == 0){
                    counter++;
                }
            }
            if(counter == 2){
                outputNumbers.add(i);
            }
        }
        return outputNumbers;
    }
}
