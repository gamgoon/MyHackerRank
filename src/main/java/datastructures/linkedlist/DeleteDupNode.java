package main.java.datastructures.linkedlist;

public class DeleteDupNode {
    public static Node removeDuplicates(Node head) {
        if (head == null)
            return null;
        if (head.next == null)
            return head;

        Node current = head;

        while (current.next != null) {

            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }

        }

        return head;
    }
}
