package by.itacademy.hw5.Task3;

public class Main {
    public static void main(String[] args) {
        int numberOfColumns = 3;
        int numberOfLines = 3;
        int[][] matrix1 = new int[numberOfColumns][numberOfLines];
        int[][] matrix2 = new int[numberOfColumns][numberOfLines];
        Matrix matrix = new Matrix(numberOfColumns, numberOfLines, matrix1);

        for (int i = 0; i < numberOfColumns; i++) {
            for (int j = 0; j < numberOfLines; j++) {
                matrix1[i][j] = (int) (Math.random() * (100 - (-100))) - 100;
            }
        }

        for (int i = 0; i < numberOfColumns; i++) {
            for (int j = 0; j < numberOfLines; j++) {
                matrix2[i][j] = (int) (Math.random() * (100 - (-100))) - 100;
            }
        }

        matrix.setMatrix1(matrix1);
        matrix.outputMatrix(matrix1);
        matrix.multiplyByNumber(2);
        matrix.outputMatrix(matrix1);
        matrix.outputMatrix(matrix.multiplyMatrix(matrix2));
        matrix.outputMatrix(matrix.sumMatrix(matrix2));
    }
}

