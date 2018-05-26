package com.agapovp.epam.fundamentals.ht1.ex4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int n;
        int length;
        double max;
        double arrayOfDoubles[];

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {

            n = Integer.parseInt(bufferedReader.readLine());

            if (n < 1 || n % 2 != 0) {
                throw new IllegalArgumentException();
            }
            arrayOfDoubles = new double[n];
            length = arrayOfDoubles.length;

            for (int i = 0; i < length; i++) {
                arrayOfDoubles[i] = getRandomValue();
                System.out.println(arrayOfDoubles[i]);
            }

            max = arrayOfDoubles[0]
                    + arrayOfDoubles[arrayOfDoubles.length - 1];

            for (int i = 1; i < length / 2; i++) {
                double sum = arrayOfDoubles[i] + arrayOfDoubles[length - 1 - i];
                if (sum > max) {
                    max = sum;
                }
            }

            System.out.println(String.format("The greatest sum is: %f", max));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static double getRandomValue() {
        Random random = new Random();
        while (true) {
            double value = Double.longBitsToDouble(random.nextLong());
            if (value < Double.POSITIVE_INFINITY
                    && value > Double.NEGATIVE_INFINITY) {
                return value;
            }
        }
    }
}
