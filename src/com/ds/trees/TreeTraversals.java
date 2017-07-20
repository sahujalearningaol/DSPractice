package com.ds.trees;

/**
 * Created by Sourabh on 7/15/2017.
 * http://www.geeksforgeeks.org/tree-traversals-inorder-preorder-and-postorder/
 */
public class TreeTraversals {
    public static void preOrder(BinaryTree.Node node) {
        if(node == null) {
            return;
        }
        System.out.print(" " + node.data);
        preOrder(node.left);
        preOrder(node.right);

    }

    public static void postOrder(BinaryTree.Node node) {
        if(node == null) {
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(" " + node.data);

    }

    public static void inOrder(BinaryTree.Node node) {
        if(node.left != null) {
            inOrder(node.left);
        }

        System.out.print(" " + node.data);

        if(node.right != null) {
            inOrder(node.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree bt = BinaryTree.makeTree();
        preOrder(bt.root);
        System.out.println("\n\n\n\n");
        postOrder(bt.root);
        System.out.println("\n\n\n\n");
        inOrder(bt.root);
    }
}
