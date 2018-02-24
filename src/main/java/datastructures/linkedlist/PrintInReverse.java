package main.java.datastructures.linkedlist;

public class PrintInReverse {
    void reversePrint(Node head) {
        if (head == null)
            return;

        reversePrint(head.next);
        System.out.println(head.data);
    }
}
