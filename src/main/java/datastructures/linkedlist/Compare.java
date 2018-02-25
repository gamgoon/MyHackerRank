package main.java.datastructures.linkedlist;

public class Compare {
    public static int compareLists(Node headA, Node headB) {
        if (headA == null && headB == null)
            return 1;
        if (headA == null || headB == null)
            return 0;
        int eq = headA.data == headB.data ? 1 : 0;
        if (eq == 1)
            eq = compareLists(headA.next, headB.next);

        return eq;
    }
}
