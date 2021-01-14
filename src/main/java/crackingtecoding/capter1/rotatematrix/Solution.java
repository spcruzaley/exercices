package crackingtecoding.capter1.rotatematrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        int[][] matrix = buildMatrix(5);

        printMatrix(matrix);
        rotate(matrix);
        printMatrix(matrix);
    }

    private static void rotate(int[][] arr) {
        int n = arr.length;
        int aux = 0, x, xp, y, yp;

        for (int offset = 0; offset < n - 2; offset++) {
            x = offset;
            xp = offset;
            y = n-1-offset;
            yp = n-1-offset;
            for (int i = offset; i < n - 1 - offset; i++) {
                aux = arr[x][xp];
                arr[x][xp] = arr[yp][x];
                arr[yp][x] = arr[y][yp];
                arr[y][yp] = arr[xp][y];
                arr[xp][y] = aux;
                xp++;
                yp--;
            }
        }
    }

    static int[][] buildMatrix(int size) {
        int cont = 1;
        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = cont++;
            }
        }

        return matrix;
    }

    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]);
                if(j<matrix.length-1)
                    System.out.print(",");
            }
            System.out.println();
        }
        System.out.println();
    }

}
