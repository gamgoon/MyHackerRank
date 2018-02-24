package test.java.datastructures.linkedlist;

import main.java.datastructures.linkedlist.InsertNode;
import main.java.datastructures.linkedlist.Node;
import main.java.datastructures.linkedlist.PrintElements;
import main.java.datastructures.linkedlist.Reverse;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class ReverseTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    private Node root;
    @Before
    public void setUp() throws Exception {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));

        root = InsertNode.insert(null, 1);
        InsertNode.insert(root, 2);
        InsertNode.insert(root, 3);
        InsertNode.insert(root, 4);
    }

    @After
    public void restoreStreams() {
        System.setOut(System.out);
        System.setErr(System.err);
    }

    @Test
    public void testReverse() {
        Node reverse = Reverse.reverse(root);
        PrintElements.print(reverse);
        assertEquals("4\n3\n2\n1\n", outContent.toString());
    }
}