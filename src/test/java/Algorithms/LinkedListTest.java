package Algorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    LinkedList linkedList;

    @BeforeEach
    void init(){
        linkedList = new LinkedList();

    }

    @Test
    void isCyclic_not_cyclic() {
        linkedList.append(new Node("first"));
        linkedList.append(new Node("second"));
        linkedList.append(new Node("third"));
        assertEquals(linkedList.isCyclic(), false);
        assertEquals(3,linkedList.getLength());
    }

    @Test
    void isCyclic_cyclic() {
        LinkedList linkedList = new LinkedList();
        linkedList.append(new Node("101"));
        Node cycle = new Node("201");
        linkedList.append(cycle);
        linkedList.append(new Node("301"));
        linkedList.append(new Node("401"));
        linkedList.append(cycle);
        assertEquals(true,linkedList.isCyclic());
    }
}