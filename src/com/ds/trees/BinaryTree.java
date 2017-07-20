package com.ds.trees;

/**
 * Created by Sourabh on 7/18/2017.
 */
public class BinaryTree {
    Node root;

    static class Node {
        String data;
        Node parent, left, right;
        Node(String data) {
            this.data = data;
        }
    }

    public boolean isRoot(Node node) {
        return node == root;
    }

    /* * Java Program to traverse a binary tree using PreOrder traversal. * In PreOrder the node value is printed first, followed by visit * to left and right subtree.
    * * input:
    *                      1
    *                  /       \
    *                2          9
    *              /   \       / \
    *             3     6     10  11
    *           /  \   / \       /  \
    *          4    5 7   8     12  13
    */


    public static BinaryTree makeTree() {
        BinaryTree bt = new BinaryTree();
        BinaryTree.Node root = new BinaryTree.Node("1");
        bt.root = root;
        bt.root.left = new BinaryTree.Node("2");
        bt.root.right = new BinaryTree.Node("9");
        bt.root.left.left = new BinaryTree.Node("3");
        bt.root.left.right = new BinaryTree.Node("6");

        bt.root.left.left.left = new BinaryTree.Node("4");
        bt.root.left.left.right = new BinaryTree.Node("5");

        bt.root.left.right.left = new BinaryTree.Node("7");
        bt.root.left.right.right = new BinaryTree.Node("8");

        bt.root.right.left = new BinaryTree.Node("10");
        bt.root.right.right = new BinaryTree.Node("11");

        bt.root.right.right.left = new BinaryTree.Node("12");
        bt.root.right.right.right = new BinaryTree.Node("13");
        return bt;
    }
}
