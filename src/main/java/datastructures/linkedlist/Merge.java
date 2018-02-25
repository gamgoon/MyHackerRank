package main.java.datastructures.linkedlist;

public class Merge {
    public static Node mergeLists(Node headA, Node headB) {
        if (headA == null && headB == null)
            return null;
        if (headA == null)
            return headB;
        if (headB == null)
            return headA;

        if (headA.data <= headB.data) {
            headA.next = mergeLists(headA.next, headB);
        } else {
            Node tmp = headB;
            headB = headB.next;
            tmp.next = headA;
            headA = tmp;
            headA.next = mergeLists(headA.next, headB);
        }

        return headA;
    }
}
