package main.java.datastructures.linkedlist;

/**
 * Inserting a Node Into a Sorted Doubly Linked List
 */
public class InsertingNode {
    public static DNode sortedInsert(DNode head, int data) {
        if (head == null) {
            DNode header = new DNode();
            header.data = data;
            return header;
        }

        if (data < head.data) {
            DNode header = new DNode();
            header.data = data;
            head.prev = header;
            header.next = head;
            return header;
        }

        if (data > head.data && head.next != null) {
            head.next = sortedInsert(head.next, data);
        } else if (data > head.data && head.next == null){
            DNode tail = new DNode();
            tail.data = data;
            tail.prev = head;
            head.next = tail;
            return head;
        }

        return head;
    }
}
