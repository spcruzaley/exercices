package leetcode.numberofenclaves.firstsolution;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        /*int[][] matrix = new int[4][4];
        matrix[0] = new int[]{0,1,1,0};
        matrix[1] = new int[]{0,0,1,0};
        matrix[2] = new int[]{0,0,1,0};
        matrix[3] = new int[]{0,0,0,0};*/

        /*int[][] matrix = new int[3][4];
        matrix[0] = new int[]{0,0,0,0};
        matrix[1] = new int[]{0,0,1,1};
        matrix[2] = new int[]{0,0,0,0};*/

        /*int[][] matrix = new int[4][4];
        matrix[0] = new int[]{0,0,0,0};
        matrix[1] = new int[]{1,0,1,0};
        matrix[2] = new int[]{0,1,1,0};
        matrix[3] = new int[]{0,0,0,0};*/

        /*int[][] matrix = new int[6][6];
        matrix[0] = new int[]{0,0,1,0,1,0};
        matrix[1] = new int[]{0,0,1,0,1,0};
        matrix[2] = new int[]{0,1,0,0,0,1};
        matrix[3] = new int[]{0,1,1,0,1,0};
        matrix[4] = new int[]{0,1,0,0,0,0};
        matrix[5] = new int[]{0,1,0,0,0,0};*/

        /*int[][] matrix = new int[7][7];
        matrix[0] = new int[]{0,0,1,0,1,0,0};
        matrix[1] = new int[]{0,0,1,0,1,0,0};
        matrix[2] = new int[]{0,1,0,0,0,1,0};
        matrix[3] = new int[]{0,1,1,0,1,0,0};
        matrix[4] = new int[]{0,1,0,0,0,0,0};
        matrix[5] = new int[]{0,1,0,0,0,0,0};
        matrix[6] = new int[]{0,0,0,0,0,0,0};*/

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
        solution.numEnclaves(matrix);
    }

    static int depthSize = 0;
    static boolean touchBoundary = false;

    public int numEnclaves(int[][] A) {
        List<Island> islands = new ArrayList<>();

        for (int x = 0; x < A.length; x++) {
            for (int y = 0; y < A[x].length; y++) {
                if(A[x][y] == 1) {
                    A[x][y] = 0;
                    Island island = new Island(x, y);
                    dfs(A, island);
                    island.setTouchBoundary(touchBoundary);
                    island.setSingleLands(depthSize);
                    islands.add(island);

                    touchBoundary = false;
                    depthSize = 0;
                }
            }
        }

        int lands = 0;
        for (Island island : islands) {
            if(!island.isTouchBoundary())
                lands += island.getSingleLands();
        }

        return lands;
    }

    private boolean isLandConnectedWithBoundary(Island island, int boundaryX, int boundaryY) {
        if (island.getX() == 0 || island.getY() == 0 || island.getX() == boundaryX || island.getY() == boundaryY) {
            return true;
        }

        return false;
    }

    private void dfs(int[][] matrix, Island island) {
        int x = island.getX();
        int y = island.getY();
        if(isLandConnectedWithBoundary(island, matrix.length - 1, matrix[0].length - 1)) {
            touchBoundary = true;
        }
        depthSize++;

        //Check in left side
        if(y > 0) {
            if(matrix[x][y-1] == 1) {
                matrix[x][y-1] = 0;
                Island islandLeft = new Island(x, y-1);
                island.setLeft(islandLeft);
                dfs(matrix, islandLeft);
            }
        }

        //Check in bottom side
        if(x < matrix.length - 1) {
            if(matrix[x+1][y] == 1) {
                matrix[x+1][y] = 0;
                Island islandBottom = new Island(x+1, y);
                island.setBottom(islandBottom);
                dfs(matrix, islandBottom);
            }
        }

        //Check in right side
        if(y < matrix[0].length-1) {
            if(matrix[x][y+1] == 1) {
                matrix[x][y+1] = 0;
                Island islandRight = new Island(x, y+1);
                island.setRight(islandRight);
                dfs(matrix, islandRight);
            }
        }

        //Check in up side
        if(x > 0) {
            if(matrix[x-1][y] == 1) {
                matrix[x-1][y]=0;
                Island islandUp = new Island(x-1, y);
                island.setUp(islandUp);
                dfs(matrix, islandUp);
            }
        }
    }

}
