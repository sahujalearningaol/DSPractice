package com.ds.bst;

/**
 * Created by sahuj6 on 7/24/17.
 * http://www.geeksforgeeks.org/print-bst-keys-in-the-given-range/
 */
public class PrintKeysInGivenRange {

    public static void printRange(BinarySearchTree.Node node, int startVal, int endVal) {
        if(node == null) {
            return;
        } else {
            printRange(node.left, startVal, endVal);
            printRange(node.right, startVal, endVal);

            if((startVal < node.key) && (node.key < endVal && node.key > startVal)) {
                System.out.println(node.key);
            }
        }
    }

    public static void main(String[] args) {
        BinarySearchTree tree = BinarySearchTree.createBinaryTree();
        printRange(tree.root, 20,60);
    }
}
