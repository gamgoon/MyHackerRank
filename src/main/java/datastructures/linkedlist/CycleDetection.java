package main.java.datastructures.linkedlist;

/**
 * Constraints
 * - 0 <= list size <= 100
 */
public class CycleDetection {
    boolean hasCycle(Node head) {
        if (head == null)
            return false;
        Node current = head;
        int max = 100;
        int count = 0;
        while(true) {
            if (current == null)
                return false;
            if (count == max)
                return true;
            current = current.next;
            count++;
        }
    }

    boolean hasCycle2(Node head) {
        if (head == null)
            return false;

        Node fast = head;
        Node slow = head;

        while (slow.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow)
                return true;
        }

        return false;
    }
}
