package test.java.datastructures.linkedlist;

import main.java.datastructures.linkedlist.InsertNode;
import main.java.datastructures.linkedlist.Node;
import main.java.datastructures.linkedlist.PrintElements;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class InsertNodeTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void setUp() throws Exception {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(System.out);
        System.setErr(System.err);
    }

    @Test
    public void testInsertNode() {
        Node root = InsertNode.insert(null, 1);
        InsertNode.insert(root, 2);
        InsertNode.insert(root, 3);
        InsertNode.insert(root, 4);
        PrintElements.print(root);

        assertEquals("1\n2\n3\n4\n", outContent.toString());
    }
}