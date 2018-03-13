package main.java.datastructures.linkedlist;

/**
 *  Reverse a doubly linked list
 */
public class ReverseDoubleLinkedList {
    public static DNode reverse(DNode head) {
        if (head == null) {
            return head;
        }

        DNode next = head.next;
        head.next = head.prev;
        head.prev = next;

        return next == null ? head : reverse(next);
    }
}
