package com.ds.bst;

/**
 * Created by sahuj6 on 7/24/17.
 */
public class FindNthLargestElementInTree {
    private static int counter;
    public static void findNthLargestNumber(BinarySearchTree.Node node, int nthNumber) {
        if(node == null) {
            return;
        } else {
            findNthLargestNumber(node.right, nthNumber);
            counter++;
            if(counter == nthNumber) {
                System.out.println(node.key);
            }
            findNthLargestNumber(node.left, nthNumber);

        }
    }

    public static void main(String[] args) {
        BinarySearchTree tree = BinarySearchTree.createBinaryTree();
        findNthLargestNumber(tree.root, 3);
    }
}
