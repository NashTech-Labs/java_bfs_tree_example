package com.knoldus.bfs.example;

import static org.junit.Assert.assertNull;

import org.junit.Ignore;
import org.junit.Test;

public class BreadthFirstSearchTest {
    /**
     * Method under test: {@link BreadthFirstSearch#printLevelOrder()}
     */
    @Test
    public void testPrintLevelOrder() {
        BreadthFirstSearch breadthFirstSearch = new BreadthFirstSearch();
        breadthFirstSearch.printLevelOrder();
        assertNull(breadthFirstSearch.root);
    }

    /**
     * Method under test: {@link BreadthFirstSearch#printLevelOrderWithQueue()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testPrintLevelOrderWithQueue() {
        // TODO: Complete this test.
        //   java.lang.NullPointerException
        //       at org.example.BreadthFirstSearch.printLevelOrderWithQueue(BreadthFirstSearch.java:45)
        //   In order to prevent printLevelOrderWithQueue()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   printLevelOrderWithQueue().

        (new BreadthFirstSearch()).printLevelOrderWithQueue();
    }
}

