package main.java.datastructures.linkedlist;

public class InsertNode {

    public static void main(String[] args) {

        Node root = new Node();
        root.data = 2;

        Node result = insert(root, 3);

        PrintElements.print(result);
    }
    static Node insert(Node head, int data) {

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
        }

        insert(head.next, data);

        return head;
    }
}
