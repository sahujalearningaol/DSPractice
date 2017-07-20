package com.ds.trees;

/**
 * Created by Sourabh on 7/15/2017.
 * http://www.geeksforgeeks.org/print-ancestors-of-a-given-node-in-binary-tree/
 */
public class PrintAncestorsOfAGivenNode {
    static boolean found = false;

    //I am using post order traversal here...
    public static void printAncestors1(BinaryTree.Node node, String givenNode) {
        if(node == null || found) {
            return;
        }

        if(node.data.equals(givenNode)) {
            found = true;
        }

        if(!found) {
            printAncestors1(node.left, givenNode);
            printAncestors1(node.right, givenNode);
            if(found) {
                System.out.println(" " + node.data);
            }
        }
    }

    /* If target is present in tree, then prints the ancestors
       and returns true, otherwise returns false. */
    public static boolean printAncestors2(BinaryTree.Node node, String givenNode) {
        if(node == null) {
            return false;
        }

        if(node.data.equals(givenNode)) {
            return true;
        }

        if(printAncestors2(node.left, givenNode) || printAncestors2(node.right, givenNode)) {
            System.out.println(" " + node.data);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        BinaryTree bt = BinaryTree.makeTree();
        printAncestors1(bt.root, "7");
        System.out.println("\n\n\n");
        printAncestors2(bt.root, "7");
    }
}
