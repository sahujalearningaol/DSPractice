package com.ds.bst;

import com.ds.recursion.BinarySearch;

/**
 * Created by sahuj6 on 7/24/17.
 * http://www.geeksforgeeks.org/find-the-minimum-element-in-a-binary-search-tree/
 */
public class FindMinAndMaxValues {
    public static int minValue1(BinarySearchTree.Node node) {
        if(node.left == null) {
            return node.key;
        } else {
            return minValue1(node.left);
        }
    }

    public static int minValue2(BinarySearchTree.Node node) {
        while(node.left != null) {
            node = node.left;
        }
        return node.key;
    }
    public static void main(String[] args) {
        BinarySearchTree tree = BinarySearchTree.createBinaryTree();
        System.out.println(minValue1(tree.root));
        System.out.println(minValue2(tree.root));
    }
}
