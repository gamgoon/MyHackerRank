package test.java.datastructures.linkedlist;

import main.java.datastructures.linkedlist.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DeleteDupNodeTest {

    private Node root;
    private Node expected;
    @Before
    public void setUp() {
        root = InsertNode.insert(null, 2);
        InsertNode.insert(root, 2);
        InsertNode.insert(root, 3);
        InsertNode.insert(root, 4);
        InsertNode.insert(root, 5);
        InsertNode.insert(root, 5);

        expected = InsertNode.insert(null, 2);
        InsertNode.insert(expected, 3);
        InsertNode.insert(expected, 4);
        InsertNode.insert(expected, 5);

    }

    @Test
    public void removeDuplicates() {
        Node result = DeleteDupNode.removeDuplicates(root);
        assertTrue(Compare.compareLists(result, expected) == 1);
        PrintElements.print(result);
    }
}