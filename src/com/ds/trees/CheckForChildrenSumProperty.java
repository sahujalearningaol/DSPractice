package com.ds.trees;

/**
 * Created by Sourabh on 7/15/2017.
 * http://www.geeksforgeeks.org/check-for-children-sum-property-in-a-binary-tree/
 */
public class CheckForChildrenSumProperty {
    public static boolean checkSum(BinaryTree.Node node) {
        if(node == null || (node.left == null && node.right == null)) {
            return true;
        }

        String leftDataStr = node.left != null ? node.left.data : "0";
        String rightDataStr = node.right != null ? node.right.data : "0";

        int leftData = Integer.parseInt(leftDataStr);
        int rightData = Integer.parseInt(rightDataStr);
        int nodeData = Integer.parseInt(node.data);
        boolean resultOfThisComparison = false;

        resultOfThisComparison = checkSum(node.left);
        resultOfThisComparison = checkSum(node.right);

        if((nodeData == (leftData + rightData)) && resultOfThisComparison) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();
        tree.root = new BinaryTree.Node("10");
        tree.root.left = new BinaryTree.Node("8");
        tree.root.right = new BinaryTree.Node("2");
        tree.root.left.left = new BinaryTree.Node("3");
        tree.root.left.right = new BinaryTree.Node("5");
        tree.root.right.right = new BinaryTree.Node("3");
        if (checkSum(tree.root) == true)
            System.out.println("The given tree DOES satisfies children"
                    + " sum property");
        else
            System.out.println("The given tree does NOT satisfy children"
                    + " sum property");
    }
}
