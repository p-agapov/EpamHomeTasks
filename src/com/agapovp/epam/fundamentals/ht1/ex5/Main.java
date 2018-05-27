package com.agapovp.epam.fundamentals.ht1.ex5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int size;
        int[][] matrix;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {

            size = Integer.parseInt(bufferedReader.readLine());

            if (size <= 0
                    || size > 100)
                throw new IllegalArgumentException("Argument must be in range [1; 100]");

            matrix = new int[size][size];

            for (int i = 0; i < size; i++) {
                matrix[i][i] = 1;
                matrix[size - i - 1][i] = 1;
            }

            for (int[] row: matrix) {
                System.out.println(Arrays.toString(row));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
