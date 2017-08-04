package com.ds.arrays;

/**
 * Created by sahuj6 on 8/1/17.
 */
public class SpiralMatrix {
    public static void walk(int[][] matrix, int numRows, int numColumns) {
        int rowFwdIndex = 0;
        int rowBackIndex = numRows - 1;
        int columnTopIndex = numColumns - 1;
        int columnDownIndex = 0;
        int counter = 0;

        while(true) {
            for(int i = rowFwdIndex; i < (matrix[rowFwdIndex].length - rowFwdIndex) && (counter < (numColumns*numRows)); i++) {
                System.out.print(" " + matrix[rowFwdIndex][i]);
                counter++;
            }
            rowFwdIndex++;

            for(int i = rowFwdIndex; i < (matrix.length - (matrix.length - columnTopIndex))&&(counter < (numColumns*numRows)); i++) {
                System.out.print(" " + matrix[i][columnTopIndex]);
                counter++;
            }
            columnTopIndex--;

            for(int i = columnTopIndex; (i >= columnDownIndex)&&(counter < (numColumns*numRows)); i--) {
                System.out.print(" " + matrix[rowBackIndex][i]);
                counter++;
            }
            rowBackIndex--;

            for(int i = rowBackIndex; (i >= rowFwdIndex)&&(counter < (numColumns*numRows)); i--) {
                System.out.print(" " + matrix[i][columnDownIndex]);
                counter++;
            }
            columnDownIndex++;

            if(counter >= (numColumns*numRows)) {
                break;
            }

        }
    }


    public static void main(String[] args) {
        int[][] matrix = {
                            {1, 2, 3, 4,  5,  6},
                            {7, 8, 9, 10, 11, 12},
                            {13,14,15,16, 17, 18},
                            {19,20,21,22, 23, 24},
                            {25,26,27,28, 29, 30}
        };
        walk(matrix, 5, 6);
    }
}
