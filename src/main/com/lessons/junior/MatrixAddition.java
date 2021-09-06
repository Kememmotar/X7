package com.lessons.junior;

import java.util.Scanner;

public class MatrixAddition {

    public static void main(String[] args) {

        int x = 0;
        int y = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input x: ");
        x = sc.nextInt();
        System.out.print("Input y: ");
        y = sc.nextInt();

        RandomMatrixFactory randomMatrixFactory = new RandomMatrixFactory(100);
        Matrix m1 = randomMatrixFactory.create(x, y);
        Matrix m2 = randomMatrixFactory.create(x, y);

        MatrixCalaboration matrixCalaboration = new MatrixCalaboration();
        Matrix mCount = matrixCalaboration.colobarate(m1, m2);
        System.out.println("Matrix1: \n" + m1);
        System.out.println("Matrix2: \n" + m2);
        System.out.println("Count: \n" + mCount);

    }

}
