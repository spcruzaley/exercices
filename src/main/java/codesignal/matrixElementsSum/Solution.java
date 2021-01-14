package codesignal.matrixElementsSum;

import utils.Misc;

public class Solution {

    public static void main(String[] args) {
        int[][] matrix = buildTestMatrixTwo();
        int sum = matrixElementsSum(matrix);
        
        System.out.println("Sum: " + sum);
    }

    static int matrixElementsSum(int[][] matrix) {
        int sum = 0;

        for (int x = 0; x < matrix.length; x++) {
            for (int y = 0; y < matrix[x].length; y++) {
                sum += getValueFromTopField(matrix, x, y);
            }
        }
        
        return sum;
    }

    static int getValueFromTopField(int[][] matrix, int x, int y) {
        if(x == 0) return matrix[x][y];

        if(matrix[x-1][y] != 0) {
            return matrix[x][y];
        } else {
            matrix[x][y] = 0;
        }

        return 0;
    }

    private static int[][] buildTestMatrixOne() {
        int[][] matrix = new int[3][4];

        matrix[0][0] = 0;
        matrix[0][1] = 1;
        matrix[0][2] = 1;
        matrix[0][3] = 2;

        matrix[1][0] = 0;
        matrix[1][1] = 5;
        matrix[1][2] = 0;
        matrix[1][3] = 0;

        matrix[2][0] = 2;
        matrix[2][1] = 0;
        matrix[2][2] = 3;
        matrix[2][3] = 3;

        return matrix;
    }

    private static int[][] buildTestMatrixTwo() {
        int[][] matrix = new int[3][4];

        matrix[0][0] = 1;
        matrix[0][1] = 1;
        matrix[0][2] = 1;
        matrix[0][3] = 0;

        matrix[1][0] = 0;
        matrix[1][1] = 5;
        matrix[1][2] = 0;
        matrix[1][3] = 1;

        matrix[2][0] = 2;
        matrix[2][1] = 1;
        matrix[2][2] = 3;
        matrix[2][3] = 10;

        return matrix;
    }

}
