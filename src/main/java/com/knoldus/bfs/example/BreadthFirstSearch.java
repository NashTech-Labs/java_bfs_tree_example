package com.knoldus.bfs.example;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
    Node root;

    /**
     *function to print level order traversal of tree - BFS
     * <p>
     * */
    void printLevelOrder() {
        int h = height(root);
        int i;
        for (i = 1; i <= h; i++)
            printGivenLevel(root, i);
    }

    /**
     * Print nodes at the given level
     * <p>
     * */
    private void printGivenLevel(Node root, int level) {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.key + " ");
        else if (level > 1) {
            printGivenLevel(root.left, level - 1);
            printGivenLevel(root.right, level - 1);
        }
    }

    void printLevelOrderWithQueue() {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {

            /**
             * poll() removes the present head. For more information on poll()
             * visit http://www.tutorialspoint.com/java/util/linkedlist_poll.htm
             */
            Node tempNode = queue.poll();
            System.out.print(tempNode.key + " ");

            /* Enqueue left child */
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }

            /* Enqueue right child */
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
    }

    private int height(Node root) {
        if (root == null)
            return 0;
        else {
            /* compute height of each subtree */
            int lheight = height(root.left);
            int rheight = height(root.right);

            /* use the larger one */
            if (lheight > rheight)
                return (lheight + 1);
            else
                return (rheight + 1);
        }
    }
}
