package com.ds.bst;

/**
 * Created by sahuj6 on 7/24/17.
 */
public class DeleteNode {

    public static BinarySearchTree.Node deleteNode(BinarySearchTree.Node parent, int nodeValue) {
        if(parent == null)
            return parent;

        if(nodeValue < parent.key) {
            parent.left = deleteNode(parent.left, nodeValue);
        } else if(nodeValue > parent.key) {
            parent.right = deleteNode(parent.right, nodeValue);
        } else {
            //Node that is supposed to be deleted is found here. Lets start the deletion process.
            if(parent.left != null && parent.right != null) {
                BinarySearchTree.Node minValueNode = minValue(parent.right);
                parent.key = minValueNode.key;
                parent.right = deleteNode(parent.right, minValueNode.key);
            } else if(parent.left != null && parent.right == null) {
                parent = parent.left;
            } else if(parent.left == null && parent.right != null) {
                parent = parent.right;
            } else {
                return null;
            }
        }

        return parent;
    }

    public static BinarySearchTree.Node minValue (BinarySearchTree.Node node) {
        if(node.left == null) {
            return node;
        } else {
            return minValue(node.left);
        }
    }

    public static void inOrder(BinarySearchTree.Node root) {
        if (root == null)
            return;
        inOrder(root.left);
        System.out.print(root.key + " ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        BinarySearchTree tree = BinarySearchTree.createBinaryTree();
        inOrder(tree.root);
        System.out.println();

        deleteNode(tree.root, 30);

        inOrder(tree.root);
        System.out.println();
    }
}
