package com.lessons.junior;

public class RandomMatrixFactory {

    private final int maxRange;

    public RandomMatrixFactory(int maxRange) {
        this.maxRange = maxRange;
    }

    public Matrix create(int x, int y) {
        int[][] values = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                values[i][j] = (int)(Math.random()*((maxRange - 1)+1)) + 1;
            }
        }
        return new Matrix(values);
    }

}
