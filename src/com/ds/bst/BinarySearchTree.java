package com.ds.bst;

/**
 * Created by sahuj6 on 7/24/17.
 */
public class BinarySearchTree {
    public class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    // Root of BST
    public Node root;

    // Constructor
    public BinarySearchTree() {
        root = null;
    }

    public void insert(int key) {
        root = insertRec(root, key);
    }

    /* A recursive function to insert a new key in BST */
    public Node insertRec(Node root, int key) {

        /* If the tree is empty, return a new node */
        if (root == null)
        {
            root = new Node(key);
            return root;
        }

        /* Otherwise, recur down the tree */
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        /* return the (unchanged) node pointer */
        return root;
    }

    public static BinarySearchTree createBinaryTree() {
        BinarySearchTree tree = new BinarySearchTree();

        /* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
        20   40  60   80
       /  \    \
      5   25   45
        */
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(5);
        tree.insert(25);
        tree.insert(40);
        tree.insert(45);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        return tree;
    }
}
