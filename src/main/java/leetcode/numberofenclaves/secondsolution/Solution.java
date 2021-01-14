package leetcode.numberofenclaves.secondsolution;

import utils.Misc;

public class Solution {

    public static void main(String[] args) {
        int[][] matrix = new int[10][11];
        matrix[0] = new int[]{0,0,1,1,1,0,1,1,1,0,1};
        matrix[1] = new int[]{1,1,1,1,0,1,0,1,1,0,0};
        matrix[2] = new int[]{0,1,0,1,1,0,0,0,0,1,0};
        matrix[3] = new int[]{1,0,1,1,1,1,1,0,0,0,1};
        matrix[4] = new int[]{0,0,1,0,1,1,0,0,1,0,0};
        matrix[5] = new int[]{1,0,0,1,1,1,0,0,0,1,1};
        matrix[6] = new int[]{0,1,0,1,1,0,0,0,1,0,0};
        matrix[7] = new int[]{0,1,1,0,1,0,1,1,1,0,0};
        matrix[8] = new int[]{1,1,0,1,1,1,0,0,0,0,0};
        matrix[9] = new int[]{1,0,1,1,0,0,0,1,0,0,1};

        Solution solution = new Solution();
        System.out.println(solution.numEnclaves(matrix));
    }

    public int numEnclaves(int[][] A) {
        Misc.printIntMatrix(A, A.length, A[0].length);
        traverseBoundary(A, A.length, A[0].length);
        Misc.printIntMatrix(A, A.length, A[0].length);

        return countLands(A);
    }

    private int countLands(int[][] a) {
        int cont = 0;

        for (int x = 1; x < a.length-1; x++) {
            for (int y = 1; y < a[0].length-1; y++) {
                if(a[x][y] == 1) {
                    cont++;
                }
            }
        }

        return cont;
    }

    public void traverseBoundary(int a[][], int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && a[i][j] == 1) {
                    dfs(a, i, j);
                } else if (i == m - 1  && a[i][j] == 1) {
                    dfs(a, i, j);
                } else if (j == 0  && a[i][j] == 1) {
                    dfs(a, i, j);
                } else if (j == n - 1  && a[i][j] == 1) {
                    dfs(a, i, j);
                }
            }
        }
    }

    private void dfs(int[][] a, int x, int y) {
        a[x][y]=0;

        //to go left
        if(y-1 >= 0 && a[x][y-1] == 1) {
            dfs(a, x, y-1);
        }

        //to go down
        if(x+1 < a.length && a[x+1][y] == 1) {
            dfs(a, x+1, y);
        }

        //to go right
        if(y+1 < a[0].length && a[x][y+1] == 1) {
            dfs(a, x, y+1);
        }

        //to go up
        if(x-1 >= 0 && a[x-1][y] == 1) {
            dfs(a, x-1, y);
        }
    }

}
