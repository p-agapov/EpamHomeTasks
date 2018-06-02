package com.agapovp.epam.fundamentals.ht3.ex1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;

public class CrazyLogger {
    private StringBuilder log;

    public CrazyLogger() {
        this.log = new StringBuilder();
    }

    public String getLog() {
        return log.toString();
    }

    public void log(String message) {
        log.append(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-YYYY : hh-mm")));
        log.append(" - ");
        log.append(message);
        log.append("\n");
    }

    public String findAndGet(String keyWord) {
        String[] strings = log.toString().split("\n");

        StringBuilder stringBuilder = new StringBuilder();
        for (String string : strings) {
            if (string.contains(keyWord)) {
                stringBuilder.append(string);
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }

    public void findAndPrint(String keyWord) {
        System.out.println(findAndGet(keyWord));
    }
}
