package main.java.datastructures.linkedlist;

public class FindMergePoint {

    /**
     * 이건 아니다 싶지만...
     * @param headA
     * @param headB
     * @return
     */
    public static int findMergeNode(Node headA, Node headB) {

        Node first = headA;
        Node last = headB;

        int result = 0;
        boolean ended = false;

        while (first != null) {
            while (last != null) {
                if (first == last) {
                    result = first.data;
                    ended = true;
                    break;
                }
                last = last.next;
            }
            if (ended)
                break;
            first = first.next;
            last = headB;
        }

        return result;
    }

    /**
     * discussion에서 참고. 머리 좋네;;
     * @param headA
     * @param headB
     * @return
     */
    public static int findMergeNode2(Node headA, Node headB) {

        Node first = headA;
        Node last = headB;

        while (first != last) {

            if (first.next == null) {
                first = headB;
            } else {
                first = first.next;
            }

            if (last.next == null) {
                last = headA;
            } else {
                last = last.next;
            }
        }

        return first.data;
    }
}
