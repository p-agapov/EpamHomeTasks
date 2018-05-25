package com.agapovp.epam.fundamentals.ht1.ex2;

import static java.lang.Math.pow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int number = 1;
        double epsilon = 1;
        try {
            epsilon = Double.parseDouble(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        double elementOfSequence;

        while (true) {
            elementOfSequence = 1d / pow((number + 1), 2) ;

            System.out.println(String.format("%.30f", elementOfSequence));
            if (elementOfSequence < epsilon) {
                System.out.println(String.format("Number: %d", number));
                break;
            }
            number++;
        }
    }
}
