package main.java.datastructures.linkedlist;

public class Reverse {
    public static Node reverse(Node head) {

        if (head == null)
            return null;

        if (head.next == null)
            return head;

        Node last = reverse(head.next);

        head.next.next = head;
        head.next = null;
        return last;
    }
}
