package by.itacademy.hw5.Task3;

public class Matrix {
    private int[][] matrix1;
    private int numberOfColumns;
    private int numberOfLines;

    public Matrix(int numberOfColumns, int numberOfLines, int[][] matrix1) {
        this.numberOfColumns = numberOfColumns;
        this.numberOfLines = numberOfLines;
        this.matrix1 = matrix1;
    }


    public int[][] multiplyMatrix(int[][] matrix2) {
        int[][] result = new int[numberOfColumns][numberOfLines];
        for (int i = 0; i < numberOfColumns; i++) {
            for (int j = 0; j < numberOfLines; j++) {
                result[i][j] = matrix1[i][j] * matrix2[i][j];
            }
        }
        return result;
    }

    public int[][] sumMatrix(int[][] matrix2) {
        int[][] result = new int[numberOfColumns][numberOfLines];
        for (int i = 0; i < numberOfColumns; i++) {
            for (int j = 0; j < numberOfLines; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    public int[][] multiplyByNumber(int number) {
        int[][] result = new int[numberOfColumns][numberOfLines];
        for (int i = 0; i < numberOfColumns; i++) {
            for (int j = 0; j < numberOfLines; j++) {
                result[i][j] = matrix1[i][j] * number;
            }
        }
        return matrix1;
    }

    public void outputMatrix(int[][] matrix1) {
        for (int i = 0; i < numberOfColumns; i++) {
            for (int j = 0; j < numberOfLines; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public int[][] getMatrix1() {
        return matrix1;
    }

    public void setMatrix1(int[][] matrix1) {
        this.matrix1 = matrix1;
    }


    public int getNumberOfColumns() {
        return numberOfColumns;
    }

    public void setNumberOfColumns(int numberOfColumns) {
        this.numberOfColumns = numberOfColumns;
    }

    public int getNumberOfLines() {
        return numberOfLines;
    }

    public void setNumberOfLines(int numberOfLines) {
        this.numberOfLines = numberOfLines;
    }

}
