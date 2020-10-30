package Algorithms;

import com.sun.source.tree.BinaryTree;

public class DoublyLinkedList {
    DoublyLinkedListNode head;
    DoublyLinkedListNode tail;

    DoublyLinkedList(){
        this.head = new DoublyLinkedListNode("head");
        this.tail = head;
        head.setNext(null);
        head.setPrevious(null);
    }
    public DoublyLinkedListNode head(){
        return head;
    }

    public void append(DoublyLinkedListNode node){

        //add newNode to the end of list. tail->next set to newNode
        tail.setNext(node);
        //newNode->previous set to tail
        node.setPrevious(tail);
        //newNode becomes new tail
        tail = node;
        //tail's next point to null
        tail.setNext(null);

    }

    public boolean isCyclic(){
        boolean cyclic = false;

        DoublyLinkedListNode slow = head;
        DoublyLinkedListNode fast = head;

        while(fast != null && fast.getNext() != null){
            fast = fast.getNext().getNext();
            slow = slow.getNext();
            if(fast == slow){
                cyclic = true;
                break;
            }
        }


        return cyclic;
    }

    public int getLength(){
        DoublyLinkedListNode current = head;
        int length = 0;
        while(current.getNext() != null){
            length++;
            current = current.getNext();
        }
        return length;
    }
}

class DoublyLinkedListNode{
    private String data;
    private DoublyLinkedListNode next;
    private DoublyLinkedListNode previous;

    public DoublyLinkedListNode(String data) {
        this.data = data;
        this.next = null;
        this.previous = null;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public DoublyLinkedListNode getNext() {
        return next;
    }

    public void setNext(DoublyLinkedListNode next) {
        this.next = next;
    }

    public DoublyLinkedListNode getPrevious() {
        return previous;
    }

    public void setPrevious(DoublyLinkedListNode previous) {
        this.previous = previous;
    }
}
