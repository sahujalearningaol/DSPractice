package com.ds.bst;

/**
 * Created by sahuj6 on 7/25/17.
 */
public class FindNthSmallestElementInTree {
    private static int counter;
    public static void findNthSMallestNumber(BinarySearchTree.Node node, int nthNumber) {
        if(node == null) {
            return;
        } else {
            findNthSMallestNumber(node.left, nthNumber);
            counter++;
            if(counter == nthNumber) {
                System.out.println(node.key);
            }
            findNthSMallestNumber(node.right, nthNumber);

        }
    }

    public static void main(String[] args) {
        BinarySearchTree tree = BinarySearchTree.createBinaryTree();
        findNthSMallestNumber(tree.root, 3);
    }
}
