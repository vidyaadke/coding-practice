package Algorithms;

public class LinkedList {
    Node head;
    LinkedList(){
        this.head = new Node("head");
    }
    public Node head(){
        return head;
    }

    public void append(Node node){
        Node current = head;

        while(current.getNext() != null){
            current = current.getNext();
        }

        current.setNext(node);
    }

    public boolean isCyclic(){
        boolean cyclic = false;

        Node slow = head;
        Node fast = head;

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
        Node current = head;
        int length = 0;
        while(current.getNext() != null){
            length++;
            current = current.getNext();
        }
        return length;
    }
}

class Node{
    private String data;
    private Node next;

    public Node(String data) {
        this.data = data;
        this.next = null;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
