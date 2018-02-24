package main.java.datastructures.linkedlist;

public class InsertNode2 {
    Node insert(Node head, int x) {

        Node node = new Node();
        node.data = x;

        if (head != null) {
            node.next = head;
        }

        return node;
    }
}
