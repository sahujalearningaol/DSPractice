package com.ds.trees;

import java.util.Arrays;

/**
 * Created by Sourabh on 7/15/2017.
 * http://www.geeksforgeeks.org/write-a-c-program-to-get-count-of-leaf-nodes-in-a-binary-tree/
 */
public class CountLeafNodesInTree {

    public static int traverse(BinaryTree.Node node, int size) {
        if(node == null) {
            return 0;
        }

        if(node.left == null && node.right == null) {
            return ++size;
        }

        size = traverse(node.left, size);
        size = traverse(node.right, size);
        return size;
    }

    static int getLeafCount(BinaryTree.Node node)
    {
        if (node == null)
            return 0;
        if (node.left == null && node.right == null)
            return 1;
        else
            return getLeafCount(node.left) + getLeafCount(node.right);
    }

    public static void main(String[] args) {
        BinaryTree bt = BinaryTree.makeTree();
        int size = traverse(bt.root, 0);
        System.out.println(size);

        System.out.println(getLeafCount(bt.root));
    }
}
