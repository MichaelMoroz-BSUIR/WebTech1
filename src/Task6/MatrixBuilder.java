package Task6;

public class MatrixBuilder {

    public static double[][] buildMatrix(double[] arr) {

        if (arr.length == 0)
            return new double[0][];

        double[][] matrix = new double[arr.length][arr.length];
        for (int y = 0; y < arr.length; y++) {
            for (int x = 0; x < arr.length; x++) {
                matrix[y][x] = arr[((y + x) % arr.length)];
            }
        }
        return matrix;
    }
}
