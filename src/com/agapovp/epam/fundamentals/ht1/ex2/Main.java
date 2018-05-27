package com.agapovp.epam.fundamentals.ht1.ex2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {

        int number = 1;
        double epsilon = 1;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            epsilon = Double.parseDouble(bufferedReader.readLine());

            double elementOfSequence;

            while (true) {
                elementOfSequence = 1d / pow((number + 1), 2);

                System.out.println(String.format("%.30f", elementOfSequence));
                if (elementOfSequence < epsilon) {
                    System.out.println(String.format("Number: %d", number));
                    break;
                }
                number++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
