package Algorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListTest {

    DoublyLinkedList linkedList;

    @BeforeEach
    void init(){
        linkedList = new DoublyLinkedList();
    }

    @Test
    void append() {
        linkedList.append(new DoublyLinkedListNode("First"));
        linkedList.append(new DoublyLinkedListNode("second"));
        linkedList.append(new DoublyLinkedListNode("third"));
        System.out.println(linkedList.getLength());
    }
}