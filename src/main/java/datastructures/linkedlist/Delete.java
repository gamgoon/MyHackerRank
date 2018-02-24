package main.java.datastructures.linkedlist;

public class Delete {
    public static Node delete(Node head, int position) {
        if (position == 0)
            return head.next;

        if (position == 1) {
            head.next = head.next.next;
            return head;
        }

        delete(head.next, position - 1);
        return head;
    }
}
