import Algorithms.BestStockProfit;
import DataStructure.AshleyLoveNumbers;
import DataStructure.LinkedListAddition;
import DataStructure.ObjectEquality;
import DataStructure.ObjectEqualityModel;
import org.javatuples.Pair;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {

        //Problem 1 for object equality

        //intialise objects
        ObjectEqualityModel object1 = new ObjectEqualityModel("abc", 1);
        ObjectEqualityModel object2 = new ObjectEqualityModel("abc", 1);


        ObjectEquality objectEquality = new ObjectEquality(object1, object2);
        System.out.println(objectEquality.checkIfEqual() ? "Objects are equal" : "Objects are not equal");


        // problem 2 for Ashley Numbers
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{
            System.out.println("Please enter numbers separated by space to find unique numbers.");

            //read input numbers by space
            String numberString = br.readLine();

            //store numbers in integer array
            int[] inputNumbers = Arrays.stream(numberString.split(" ")) .mapToInt(Integer::parseInt) .toArray();
            AshleyLoveNumbers ashleyLoveNumbers = new AshleyLoveNumbers();

            Set<Integer> outputNumbers = ashleyLoveNumbers.findUniqueNumbers(inputNumbers);

            outputNumbers.stream().forEach(s -> System.out.println(s));
        }catch (Exception e){
            System.out.println("Exception in reading input");
        }

        //Problem 3 for Linked list addition
        LinkedListAddition linkedListAddition = new LinkedListAddition();
        Pair<LinkedList<Integer>,LinkedList<Integer>> pair = linkedListAddition.populateInputLists();
        linkedListAddition.addLinkedLists(pair.getValue1(),pair.getValue1());

        //Problem 4 for stock profit
        System.out.println("Enter stock price separated by space");
        int[] stockPriceValues = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        BestStockProfit bestStockProfit = new BestStockProfit();
        Integer output = bestStockProfit.findBestProfit(stockPriceValues);
        System.out.println("Best Profit calculated is : " + output);


        char ch = 'P';
        char ch2 = 'p';

        //conversion using Character.getNumericValue()
        int num = Character.getNumericValue(ch);
        int num2 = Character.getNumericValue(ch2);
        System.out.println("ASCII value of char "+ch+ " is: "+num);
        System.out.println("ASCII value of char "+ch2+ " is: "+num2);

    }
}
