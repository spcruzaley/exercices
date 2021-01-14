package misc.minimalroute;

import misc.MinimalRoute;
import misc.MinimalRouteTwo;
import org.junit.Test;

import java.util.Arrays;

/**
 * STATUS: PENDING TO FINISH
 */
public class MinimalRouteTwoTest {

    @Test
    public void testMethod5x5_7() {
        int[][] matrix = generateMatrixWithMinimal5x5_7();

        MinimalRoute minimalRoute = new MinimalRoute();
        //minimalRoute.searchForTarget(matrix);
    }

    @Test
    public void testMethod5x5_6() {
        int[][] matrix = generateMatrixWithMinimal5x5_6();

        MinimalRoute minimalRoute = new MinimalRoute();
        //minimalRoute.searchForTarget(matrix);
    }

    @Test
    public void testMethod4x4_5() {
        int[][] matrix = generateMatrixWithMinimal4x4_5();
        int[][] matrix2 = generateMatrixWithMinimal4x4_5();

        MinimalRouteTwo minimalRouteTwo = new MinimalRouteTwo(matrix);
    }

    private int[][] generateMatrixWithMinimal5x5_7() {
        int[][] matrix = new int[5][5];

        //Put the user
        matrix[0][0]=MinimalRoute.USER;
        //Put walls
        matrix[1][1]=MinimalRoute.WALL;
        matrix[2][1]=MinimalRoute.WALL;
        matrix[4][1]=MinimalRoute.WALL;
        matrix[0][3]=MinimalRoute.WALL;
        matrix[2][3]=MinimalRoute.WALL;
        //Put the target
        matrix[4][3]=MinimalRoute.TARGET;

        return matrix;
    }

    private int[][] generateMatrixWithMinimal5x5_6() {
        int[][] matrix = new int[5][5];

        //Put the user
        matrix[0][0]=MinimalRoute.USER;
        //Put walls
        matrix[0][1]=MinimalRoute.WALL;
        matrix[1][1]=MinimalRoute.WALL;
        //Put the target
        matrix[0][2]=MinimalRoute.TARGET;

        return matrix;
    }

    private int[][] generateMatrixWithMinimal4x4_5() {
        int[][] matrix = new int[4][4];

        //Put the user
        matrix[0][0]=MinimalRoute.USER;
        //Put walls
        matrix[1][1]=MinimalRoute.WALL;
        matrix[1][2]=MinimalRoute.WALL;
        matrix[3][1]=MinimalRoute.WALL;
        matrix[3][3]=MinimalRoute.WALL;
        //Put the target
        matrix[3][2]=MinimalRoute.TARGET;

        return matrix;
    }

    private int[][] generateMatrixWithMinimal4() {
        int[][] matrix = new int[5][5];

        //Put the user
        matrix[0][0]=MinimalRoute.USER;
        //Put the target
        matrix[4][0]=MinimalRoute.TARGET;

        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        System.out.println("");
        System.out.println("------------------------------------------");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

}
