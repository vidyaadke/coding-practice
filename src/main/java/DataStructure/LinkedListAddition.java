package DataStructure;

import org.javatuples.Pair;

import java.util.LinkedList;

public class LinkedListAddition {

    private LinkedList<Integer> outputList = new LinkedList<>();

    public LinkedList<Integer> addLinkedLists(LinkedList<Integer> inputList1, LinkedList<Integer> inputList2){

        Integer carry = 0;

        while (inputList1.iterator().hasNext() && inputList2.iterator().hasNext()){
            if(carry == 0) {
                Integer value =inputList1.iterator().next() + inputList2.iterator().next();
                Integer base = getBase(value);
                carry = getCarry(value);
                outputList.add(base);
            }else {
                Integer value =inputList1.iterator().next() + inputList2.iterator().next();
                Integer base = getBase(carry + value);
                carry = getCarry(carry + value);
                outputList.add(base);
            }
            inputList1.poll();
            inputList2.poll();
        }
        //if input lists are empty, save carry
        if(!inputList1.iterator().hasNext() && !inputList2.iterator().hasNext()){
            if(carry != 0){
                outputList.add(carry);
            }
        }else {
            //save inputlist2
            if (!inputList1.iterator().hasNext() && inputList2.iterator().hasNext()) {
                saveSingleList(carry, inputList2);
            }
            //save inputlist1
            else if (!inputList2.iterator().hasNext() && inputList1.iterator().hasNext()) {
                saveSingleList(carry, inputList1);
            }
        }
        outputList.forEach(e -> System.out.println(e));
        return outputList;
    }

    private Integer getBase(Integer value){
        return value % 10;
    }

    private Integer getCarry(Integer value){
        return value / 10;
    }

    private void saveSingleList(Integer carry, LinkedList inputList2){
        while (inputList2.iterator().hasNext()) {
            if (carry != 0) {
                Integer value = (Integer) inputList2.iterator().next();
                Integer base = getBase(carry + value);
                carry = getCarry(carry + value);
                outputList.add(base);
            } else {
                outputList.add((Integer) inputList2.iterator().next());
            }
            inputList2.poll();
        }
    }

    public Pair<LinkedList<Integer>, LinkedList<Integer>> populateInputLists(){

        LinkedList<Integer> inputList1 = new LinkedList<>();
        LinkedList<Integer> inputList2 = new LinkedList<>();
        inputList1.add(9);
        inputList1.add(9);
        inputList1.add(9);
        inputList2.add(9);
        inputList2.add(9);
        inputList2.add(9);
        return  Pair.with(inputList1,inputList2);
    }
}
