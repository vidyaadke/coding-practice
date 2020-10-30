package Algorithms;

import java.util.AbstractMap;
import java.util.Map;

public class RomanToInteger {

    Map<String, Integer> RomanCharToValue = Map.ofEntries(
        new AbstractMap.SimpleEntry<>("I",1),
        new AbstractMap.SimpleEntry<>("V",5),
        new AbstractMap.SimpleEntry<>("X",10),
        new AbstractMap.SimpleEntry<>("L",50),
        new AbstractMap.SimpleEntry<>("C",100),
        new AbstractMap.SimpleEntry<>("D",500),
        new AbstractMap.SimpleEntry<>("M",1000)
    );

    public int calculateValue(String input){
        int result = 0;

        for(int i = 0 ; i < input.length() ; i++){
            char charVal = input.charAt(i);
            int val  = RomanCharToValue.get(charVal);
            if(i+1 < input.length()){
                char charNextVal = input.charAt(i+1);
                int nextVal  = RomanCharToValue.get(charNextVal);
                if(val >= nextVal){
                    result = result + val;
                }else{
                    result = result + nextVal - val;
                    i++;
                }
            }else {
                result = result + val;
            }
        }
        return result;

    }
}
