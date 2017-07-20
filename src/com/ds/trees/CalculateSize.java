package com.ds.trees;

/**
 * Created by Sourabh on 7/15/2017.
 * http://www.geeksforgeeks.org/write-a-c-program-to-calculate-size-of-a-tree/
 */
public class CalculateSize {
    static int size = 0;

    public static int sizeOfTree(BinaryTree.Node node) {
        if(node == null) {
            return 0;
        }
        size++;
        sizeOfTree(node.left);
        sizeOfTree(node.right);
        return size;
    }

    public static int sizeOfTree2(BinaryTree.Node node) {
        if (node == null)
            return 0;
        else
            return(sizeOfTree2(node.left) + 1 + sizeOfTree2(node.right));
    }


    public static void main(String[] args) {
        BinaryTree bt = BinaryTree.makeTree();
        System.out.println(sizeOfTree(bt.root));
        System.out.println(sizeOfTree2(bt.root));
    }
}
