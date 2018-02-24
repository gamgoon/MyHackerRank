package main.java.datastructures.linkedlist;

public class InsertNth {
    static Node insertNth(Node head, int data, int position) {
        if (head == null) {
            Node node = new Node();
            node.data = data;
            return node;
        }

        if (position == 0) {
            Node node = new Node();
            node.data = data;
            node.next = head;
            return node;
        }

        if (position == 1) {
            Node node = new Node();
            node.data = data;
            node.next = head.next;
            head.next = node;
            return head;
        }

        insertNth(head.next, data, position - 1);

        return head;
    }

    public static void main(String[] args) {
        Node root = insertNth(null, 3, 0);
        root = insertNth(root, 5, 1);
        root = insertNth(root, 4, 2);
        root = insertNth(root, 2, 3);
        root = insertNth(root, 10, 1);
        PrintElements.print(root);
    }
}
