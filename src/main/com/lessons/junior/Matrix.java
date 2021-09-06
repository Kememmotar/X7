package com.lessons.junior;

public class Matrix {
    private int x;
    private int y;

    public int[][] getValues() {
        return values;
    }

    private int [][] values;

    public Matrix(int x, int y) {
        this.x = x;
        this.y = y;
        values = new int[x][y];
    }

    public Matrix(Matrix...matrixes) {
        if (matrixes.length > 0) {
            this.x = matrixes[0].x;
            this.y = matrixes[0].y;
        } else {
            return;
        }
        values = new int[this.x][this.y];
        for (Matrix matrix : matrixes) {
            for (int x = 0; x < this.x; x++) {
                for (int y = 0; y < this.y; y++) {
                    values[x][y] += matrix.values[x][y];
                }
            }
        }
    }

    public Matrix(int[][] values) {
        this.x = values.length;
        this.y = values[0].length;
        this.values = values;
    }

    private static String right(String s, int x) {
        return s.substring(s.length() - x);
    }

    public String toString() {
        String returnValue = "";
        for (int x = 0; x < this.x; x++) {
            returnValue = returnValue + "[";
            for (int y = 0; y < this.y; y++) {
                if (y != 0) returnValue = returnValue + ", ";
                returnValue = returnValue + right("00" + this.values[x][y], 3);
            }
            returnValue = returnValue + "]" + "\n";
        }
        return returnValue;
    }
}
