package utils;

import java.io.*;
import java.util.*;

public class Misc {

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

    public static void printCharMatrix(char[][] matrix, int size, int length) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(matrix[i][j]);
                if(j<matrix.length-1)
                    System.out.print(",");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int[] getNumsFromFile(String path) {
        List<Integer> nums = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(Misc.getCurrentPath().concat(path))));
            String string;

            while ((string = br.readLine()) != null) {
                nums.add(Integer.parseInt(string));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found - " + e.getMessage());
        } catch (IOException e) {
            System.out.println("File error - " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Number format error - " + e.getMessage());
        }

        int[] intNumbers = new int[nums.size()];
        int cont = 0;
        for (int i : nums) {
            intNumbers[cont++] = i;
        }

        return intNumbers;
    }

    public static List<String> getListFromInput(String path) {
        List<String> elements = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(Misc.getCurrentPath().concat(path))));
            String line;

            while ((line = br.readLine()) != null) {
                elements.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found - " + e.getMessage());
        } catch (IOException e) {
            System.out.println("File error - " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Number format error - " + e.getMessage());
        }

        return elements;
    }

    public static String getCurrentPath() {
        StringBuilder builder = new StringBuilder();

        try {
            builder.append(new File( "." ).getCanonicalPath());
            builder.append("/src/main/java/");
        } catch (IOException e) {
            System.out.println(e.getCause());
        }

        return builder.toString();
    }

}
