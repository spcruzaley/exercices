import utils.Misc;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Testing {

    public static void main(String[] args) {
        char[][] matrix = new char[4][5];
        matrix[0]=new char[]{'a','a','a','a','a'};
        matrix[1]=new char[]{'b','a','b','a','a'};
        matrix[2]=new char[]{'a','b','b','a','a'};
        matrix[3]=new char[]{'a','a','a','a','a'};

        System.out.println("matrix.length: " + matrix.length);
        System.out.println("matrix.length: " + matrix[0].length);
    }

    private static void maniputaleMatrix(char[][] matrix) {
        for (int x = 0; x < matrix.length; x++) {
            for (int y = 0; y < matrix.length; y++) {
                matrix[x][y] = '-';
            }
        }
    }


}
