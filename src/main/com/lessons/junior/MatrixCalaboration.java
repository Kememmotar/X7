package com.lessons.junior;

public class MatrixCalaboration {

    public Matrix colobarate(Matrix...matrices) {
        int x;
        int y;
        int[][] values;
        if (matrices.length > 0) {
            Matrix matrix = matrices[0];
            int[][] tempValues = matrix.getValues();
            x = tempValues.length;
            y = tempValues[0].length;
            values = new int[x][y];
        } else {
            return new Matrix();
        }
        for (int matrixes = 0; matrixes < matrices.length; matrixes++) {
            int[][] valuesMatrices = matrices[matrixes].getValues();
            if (valuesMatrices.length != x && valuesMatrices[0].length != y) continue;
            for (int xMatrixes = 0; xMatrixes < x; xMatrixes++) {
                for (int yMatrixes = 0; yMatrixes < y; yMatrixes++) {
                    values[xMatrixes][yMatrixes] += valuesMatrices[xMatrixes][yMatrixes];
                }
            }
        }
        return new Matrix(values);
    }

}
