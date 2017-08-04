package com.ctci.arraysandstrings;

import java.util.Arrays;

/**
 * Created by sahuj6 on 8/2/17.
 */
public class RotateMatrix {
    public static int[][] rotate(int[][] origArray) {
        int[][] rotatedArray = new int[origArray.length][origArray[0].length];
        int rows = origArray.length;
        int cols = origArray[0].length;


        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                rotatedArray[j][rows - 1 - i] = origArray[i][j];
            }
        }

        return rotatedArray;
    }

    public static void main(String[] args) {
        int[][] origArray = new int[][]{
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        System.out.println(Arrays.deepToString(rotate(origArray)));
    }
}
