package Task6;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        double[] array = Input.input(in);
        System.out.println("Your array:");
        System.out.println(Arrays.toString(array));

        double[][] matrix = MatrixBuilder.buildMatrix(array);
        System.out.println("Matrix:");
        for (double[] row : matrix)
            System.out.println(Arrays.toString(row));
    }
}
