package com.ds.trees;

import java.util.Arrays;
import java.util.Stack;

/**
 * Created by Sourabh on 7/15/2017.
 * http://www.geeksforgeeks.org/given-a-binary-tree-print-out-all-of-its-root-to-leaf-paths-one-per-line/
 */

public class PrintAllRootToLeafPaths {
    private static Stack<String> stack = new Stack<String>();

    public static void traverse(BinaryTree.Node node) {
        if(node == null) {
            return;
        }

        stack.push(node.data);
        if(node.left == null && node.right == null) {
            System.out.println(Arrays.asList(stack.toArray()));
            return;
        }
        traverse(node.left);
        stack.pop();
        traverse(node.right);
        stack.pop();
    }

    public static void main(String[] args) {
        BinaryTree bt = BinaryTree.makeTree();
        traverse(bt.root);
    }
}
