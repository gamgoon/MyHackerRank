package main.java.datastructures.linkedlist;

public class InsertNode {
    public static Node insert(Node head, int data) {

        if (head == null) {
            Node newNode = new Node();
            newNode.data = data;
            newNode.next = null;
            return newNode;
        }

        if (head.next == null) {
            Node newNode = new Node();
            newNode.data = data;
            newNode.next = null;
            head.next = newNode;
            return head;
        }

        insert(head.next, data);

        return head;
    }
}
