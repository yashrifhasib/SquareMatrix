import java.util.Arrays;

public class SquareMatrix {
    public static double sumMajorDiagonal(double[][] matrix) {
        double sum = 0;
        boolean checkSquare = checkSquare(matrix);

        if (checkSquare) {
            for (int i = 0; i < matrix.length; i++) {
                sum += matrix[i][i];
            }
            return sum;
        }
        else
            return (double) Integer.MIN_VALUE;
    }

    public static double sumMinorDiagonal(double[][] matrix) {
        double sum = 0;
        boolean checkSquare = checkSquare(matrix);

        if (checkSquare) {
            int index = 0;
            for (int i = matrix.length - 1; i >= 0; i--) {
                sum += matrix[index][i];
                index++;
            }
            return sum;
        }
        else
            return Integer.MIN_VALUE;
    }

    public static double[][] transpose(double[][] matrix) {
        double[][] transposed = new double[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[0].length; j++) {
                transposed[i][j] = matrix[j][i];
            }
        return transposed;
    }

    public static boolean isMatrix(double[][] matrix) {
        int length = matrix[0].length;
        boolean qualifier = false;
        for (int i = 1; i < matrix.length; i++) {
            qualifier = matrix[i].length == length;
        }
        return qualifier;
    }

    private static boolean checkSquare(double[][] matrix) {
        return (matrix[0].length == matrix.length) && isMatrix(matrix);
    }

    public static void main(String[] args) {
        double[][] squareMatrix = {
                             {5, 6, 7, 8, 9},
                             {2, 6, 9, 7, 8},
                             {12, 56, 89, 56, 89},
                             {12, 23, 45, 78, 79},
                             {123, 456, 789, 147, 258}};

        System.out.println(sumMajorDiagonal(squareMatrix));
        System.out.println(sumMinorDiagonal(squareMatrix));
        System.out.println(Arrays.deepToString(transpose(squareMatrix)));
    }
}