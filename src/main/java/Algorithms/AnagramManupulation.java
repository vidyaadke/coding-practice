package Algorithms;

import java.util.HashMap;
import java.util.Map;


public class AnagramManupulation {

    //Function to find total number of manupulations needed to make string anagram
    public int findCount(String s1, String s2){
        Map<Character, Integer> charMap = new HashMap<>();

        if(s1.length() != s2.length()){
            return  -1;
        }

        int count = 0;
        for(int i = 0; i< s1.length() ; i++){
           char chr =  s1.charAt(i);
           if(charMap.get(chr) == null){
               charMap.put(chr, 1);
           }else{
               int oldCount = charMap.get(chr);
               charMap.put(chr , ++oldCount);
           }
        }

        for(int i = 0; i< s2.length() ; i++){
            char chr =  s2.charAt(i);
            if(charMap.get(chr) != null){
                int oldCount = charMap.get(chr);
                charMap.put(chr , --oldCount);
            }
        }
        for(Integer value : charMap.values()){
            count = count + value;
        }
        return count;
    }
}
