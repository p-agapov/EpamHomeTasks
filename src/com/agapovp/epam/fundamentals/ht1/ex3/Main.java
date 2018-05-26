package com.agapovp.epam.fundamentals.ht1.ex3;

import static java.lang.Math.tan;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        double a = 0d;
        double b = 0d;
        double h = 0d;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String inputString = bufferedReader.readLine();
            String[] inArgs = inputString.split(" ");

            if (inArgs.length != 3)
                throw new IllegalArgumentException();

            a = Double.parseDouble(inArgs[0]);
            b = Double.parseDouble(inArgs[1]);
            h = Double.parseDouble(inArgs[2]);

        } catch (Exception e) {
            e.printStackTrace();
        }

        for (double x = a; x < b; x += h) {

            double fun = tan(2 * x) - 3;

            System.out.println(String.format("%15.10f; %15.10f", x, fun));
        }
    }
}
