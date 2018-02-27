package main.java.datastructures.linkedlist;

public class GetNodeValue {
    public static int getNodeValue(Node head, int n) {

        Node resultNode = head;
        int index = 0;
        while (head != null) {
            head = head.next;
            if (index > n)
                resultNode = resultNode.next;

            index++;
        }

        return resultNode.data;
    }

}
