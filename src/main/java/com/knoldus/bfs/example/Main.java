package com.knoldus.bfs.example;

public class Main {

    public static void main(String[] args) {
        BreadthFirstSearch tree = new BreadthFirstSearch();

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);

        tree.root = node1;

        node1.left = node2;
        node1.right = node3;

        node2.left = node4;
        node2.right = node5;

        node3.left = node6;
        node3.right = node7;

        System.out.println("Level Order traversal of binary tree is ");
        tree.printLevelOrder();
        System.out.println("\n Level Order traversal of binary tree using Queue is ");
        tree.printLevelOrderWithQueue();
    }
}