package by.itacademy.hw5.Task3;

public class Matrix {
    private int[][] matrix1;
    private int[][] matrix2;
    private int numberOfColumns;
    private int numberOfLines;

    Matrix(int numberOfColumns, int numberOfLines) {
        this.numberOfColumns = numberOfColumns;
        this.numberOfLines = numberOfLines;
    }


    public int[][] multiplicationMatrix() {
        int[][] result = new int[numberOfColumns][numberOfLines];
        for (int i = 0; i < numberOfColumns; i++) {
            for (int j = 0; j < numberOfLines; j++) {
                result[i][j] = matrix1[i][j] * matrix2[i][j];
            }
        }
        return result;
    }

    public int[][] sumMatrix() {
        int[][] result = new int[numberOfColumns][numberOfLines];
        for (int i = 0; i < numberOfColumns; i++) {
            for (int j = 0; j < numberOfLines; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    public int[][] multiplicationByNumber(int[][] matrix, int number) {
        for (int i = 0; i < numberOfColumns; i++) {
            for (int j = 0; j < numberOfLines; j++) {
                matrix[i][j] *= number;
            }
        }
        return matrix;
    }

    public void outputMatrix(int[][] matrix) {
        for (int i = 0; i < numberOfColumns; i++) {
            for (int j = 0; j < numberOfLines; j++) {
                System.out.print(matrix[i][j] + " ");
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

    public int[][] getMatrix2() {
        return matrix2;
    }

    public void setMatrix2(int[][] matrix2) {
        this.matrix2 = matrix2;
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
