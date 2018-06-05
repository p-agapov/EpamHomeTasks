package com.agapovp.epam.fundamentals.ht3.ex2;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quiz {
    private static final String fileSeparator = File.separator;
    private static final String folder = "src/com/agapovp/epam/fundamentals/ht3/ex2/resources";
    private static final String option = "option.quiz";
    private static final String errors = "errors.quiz";
    private static final String questions = "questions.quiz";
    private static final String answers = "answers.quiz";

    public static void main(String[] args) {
        int number;
        String mode;

        String[] exceptionsText = new String[2];
        exceptionsText[0] = "Input error!/Ошибка ввода!\n\n";
        exceptionsText[1] = "There is no such option!/Нет такой опции!\n\n";

        List<String> listOfAnswers = new ArrayList<>();

        try (
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))
        ) {
            String menu = new String(Files.readAllBytes(Paths.get(folder
                    + fileSeparator
                    + option)));

            System.out.println(menu);

            while (true) {
                try {
                    number = Integer.parseInt(bufferedReader.readLine());

                    switch (number) {
                        case 1:
                            mode = "en";
                            break;
                        case 2:
                            mode = "ru";
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }

                    break;

                } catch (NumberFormatException e) {
                    System.out.println(exceptionsText[0]);
                } catch (IllegalArgumentException e) {
                    System.out.println(exceptionsText[1]);
                }
            }

            String[] buff = new String(Files.readAllBytes(Paths.get(folder
                    + fileSeparator
                    + mode
                    + fileSeparator
                    + errors))).split("\n");

            for (int i = 0; i < exceptionsText.length; i++) {
                exceptionsText[i] = buff[i];
            }

            menu = new String(Files.readAllBytes(Paths.get(folder
                    + fileSeparator
                    + mode
                    + fileSeparator
                    + answers)));

            listOfAnswers.addAll(Arrays.asList(menu.split("\n")));

            menu = new String(Files.readAllBytes(Paths.get(folder
                    + fileSeparator
                    + mode
                    + fileSeparator
                    + questions)));

            while (true) {
                try {
                    System.out.println(menu);

                    number = Integer.parseInt(bufferedReader.readLine());

                    if (number == 0) {
                        break;
                    }

                    switch (number) {
                        case 1:
                            System.out.println(listOfAnswers.get(0) + "\n\n");
                            break;
                        case 2:
                            System.out.println(listOfAnswers.get(1) + "\n\n");
                            break;
                        case 3:
                            System.out.println(listOfAnswers.get(2) + "\n\n");
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }

                } catch (NumberFormatException e) {
                    System.out.println(exceptionsText[0]);
                } catch (IllegalArgumentException e) {
                    System.out.println(exceptionsText[1]);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
